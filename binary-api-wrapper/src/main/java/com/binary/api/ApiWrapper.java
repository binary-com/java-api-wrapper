package com.binary.api;

import com.binary.api.models.requests.RequestBase;
import com.binary.api.utils.ClassUtils;
import com.binary.api.models.responses.ResponseBase;
import com.binary.api.models.WebsocketEvent;
import com.google.gson.Gson;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.WebSocket;

/**
 * Created by morteza on 7/19/2017.
 */

public class ApiWrapper {

    Logger logger = LoggerFactory.getLogger(ApiWrapper.class);

    private static ApiWrapper instance;

    private OkHttpClient client;
    private WebSocket webSocket;
    private WebsocketListener websocketListener;
    private String websocketUrl;
    public BehaviorSubject<WebsocketEvent> websocketEmitter = BehaviorSubject.create();
    private PublishSubject<String> responseEmitter = PublishSubject.create();
    private PublishSubject<String> requestEmitter = PublishSubject.create();

    private ApiWrapper(String applicationId, String language, String url){
        this.websocketUrl = url + String.format("?app_id=%s&l=%s", applicationId, language);

        try {
            this.connect();
        } catch (IOException e) {
            logger.debug(e.getMessage());
        }

        this.websocketEmitter.subscribe(e -> {
            if(!e.isOpened()) {
                this.connect();
            }
        });
    }

    private void connect() throws IOException {
        if (this.client != null) {
            client.connectionPool().evictAll();
            client.dispatcher().executorService().shutdown();
        }
        this.client = new OkHttpClient.Builder()
                .retryOnConnectionFailure(true)
                .build();
        final Request request = new Request.Builder()
                .url(websocketUrl)
                .build();

        this.websocketListener = new WebsocketListener(this.websocketEmitter,
                this.responseEmitter, this.requestEmitter);

        this.webSocket = this.client.newWebSocket(request, websocketListener);
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
