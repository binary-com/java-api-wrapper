package com.binary.api;

import com.binary.api.models.WebsocketEvent;
import com.binary.api.models.responses.TickResponse;

import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by morteza on 7/18/2017.
 */

public class
WebsocketListener extends WebSocketListener {

    Logger logger = LoggerFactory.getLogger(WebsocketListener.class);

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
                    logger.info("Received Massage: {}", o);
                }
        );
    }

    @Override
    public void onOpen(WebSocket webSocket, Response response) {
        logger.info("Connection is opened!");
        WebsocketEvent wse = new WebsocketEvent(true, null);
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
        logger.info("Connection closed: {}", reason);
        this.websocketEmitter.onNext(new WebsocketEvent(false, reason));
    }

    @Override
    public void onFailure(WebSocket webSocket, Throwable t, Response response) {
        logger.info("Connection failed: {}", response != null ? response.message() : "");
        this.websocketEmitter.onNext(new WebsocketEvent(false, response != null ? response.message() : ""));
    }
}
