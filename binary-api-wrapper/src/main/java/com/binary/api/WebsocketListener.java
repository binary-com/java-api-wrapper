package com.binary.api;

import com.binary.api.models.WebsocketEvent;

import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;

/**
 * Created by morteza on 7/18/2017.
 */

public class WebsocketListener extends WebSocketListener {

    private BehaviorSubject<WebsocketEvent> websocketEmitter;
    private PublishSubject<String> responseEmitter;
    private PublishSubject<String> requestEmitter;

    public WebsocketListener(BehaviorSubject<WebsocketEvent> wsEmitter,
                             PublishSubject<String> responseEmitter,
                             PublishSubject<String> requestEmitter){
        this.websocketEmitter = wsEmitter;
        this.responseEmitter = responseEmitter;
        this.requestEmitter = requestEmitter;

        this.responseEmitter.subscribe(
                o -> {
                    System.out.printf("Received Massage {} \r\n", o);
                }
        );
    }

    @Override
    public void onOpen(WebSocket webSocket, Response response) {
        WebsocketEvent wse = new WebsocketEvent();
        wse.setOpened(true);
        this.requestEmitter.subscribe( request -> {
            webSocket.send(request);
        });
        this.websocketEmitter.onNext(wse);


    }

    @Override
    public void onMessage(WebSocket webSocket, String message) {

        this.responseEmitter.onNext(message);

    }

    @Override
    public void onClosed(WebSocket webSocket, int code, String reason) {
        System.out.printf("Connectin Closed: {} \r\n", reason);
    }

    @Override
    public void onFailure(WebSocket webSocket, Throwable t, Response response) {
        //Log.i("Connection Failed", response != null ? response.toString() : "");
        System.out.println(String.format("Connection Failed {}", response));
    }
}
