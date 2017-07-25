package com.binary.api.models.requests;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


import java.lang.reflect.Type;

import io.reactivex.annotations.Nullable;

/**
 * Created by morteza on 7/19/2017.
 */

public class RequestBase {
    @SerializedName("passthrough")
    JsonObject passThrough;

    @SerializedName("subscribe")
    @Nullable
    Integer subscribe = null;

    @SerializedName("req_id")
    @Nullable
    Integer id = null;

    @Expose
    transient Type  responseType;

    public JsonObject getPassThrough() {
        return passThrough;
    }

    public void setPassThrough(JsonObject passThrough) {
        this.passThrough = passThrough;
    }

    public int getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(int subscribe) {
        this.subscribe = subscribe;
    }

    @Nullable
    public Integer getId() {
        return id;
    }

    public void setId(@Nullable Integer id) {
        this.id = id;
    }

    public void setSubscribe(@Nullable Integer subscribe) {
        this.subscribe = subscribe;
    }

    public Type getResponseType() {
        return responseType;
    }

    public void setResponseType(Type responseType) {
        this.responseType = responseType;
    }
}
