package com.binary.api;

import com.binary.api.models.requests.RequestBase;
import com.binary.api.utils.ClassUtils;
import com.binary.api.models.responses.ResponseBase;
import com.binary.api.models.WebsocketEvent;
import com.google.gson.Gson;

import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by morteza on 7/19/2017.
 */

public class ApiWrapper {
    private static ApiWrapper instance;

    private OkHttpClient client;
    private WebsocketListener websocketListener;
    private String websocketUrl;
    public BehaviorSubject<WebsocketEvent> websocketEmitter = BehaviorSubject.create();
    private PublishSubject<String> responseEmitter = PublishSubject.create();
    private PublishSubject<String> requestEmitter = PublishSubject.create();

    private ApiWrapper(String applicationId, String language, String url){
        this.websocketUrl = url + String.format("?app_id=%s&l=%s", applicationId, language);
        this.client = new OkHttpClient();
        final Request request = new Request.Builder()
                .url(websocketUrl)
                .build();

        this.websocketListener = new WebsocketListener(this.websocketEmitter,
                this.responseEmitter, this.requestEmitter);

        this.client.newWebSocket(request, websocketListener);

        client.dispatcher().executorService().shutdown();
    }

    public static ApiWrapper build(String applicationId){
        return build(applicationId, "en", "wss://ws.binaryws.com/websockets/v3");
    }

    /**
     * Create or retrieve an instance of ApiWrapper class
     * @param applicationId
     * @param language
     * @param url
     * @return An Instance of ApiWrapper class
     */
    public static ApiWrapper build(String applicationId, String language, String url){
        if (instance == null) {
            instance = new ApiWrapper(applicationId, language, url);
        }
        return instance;
    }

    /**
     * Send a request to the server
     * @param request
     * @return An observale
     */
    public Observable<ResponseBase> sendRequest(RequestBase request){
        Gson gson = new Gson();
        this.websocketEmitter
                .filter(o -> {
                    return o.isOpened();
                })
                .take(1)
                .subscribe(
                o -> {
                    if(o.isOpened()) {
                        this.requestEmitter.onNext(gson.toJson(request));

                    }
                }
        );

        return instance.responseEmitter
                .filter((String o) -> {
                    ResponseBase response = gson.fromJson(o, request.getResponseType());

                    //FIXME Add req_id to the condition if it is exist
                    return request.getResponseType() == ClassUtils.getClassType(response.getType());
                })
                .map(o -> {
                    return gson.fromJson(o, request.getResponseType());
                });
    }


}
