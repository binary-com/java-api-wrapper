package com.binary.api.models;

/**
 * Created by morteza on 7/19/2017.
 */

public class WebsocketEvent {
    private boolean isOpened = false;
    private boolean hasError = false;
    private String errorMessage;

    public boolean isOpened() {
        return isOpened;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }

    public boolean isHasError() {
        return hasError;
    }

    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
