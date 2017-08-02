package com.binary.api.models.requests;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

import java.lang.reflect.Type;

/**
 * Created by morteza on 7/19/2017.
 */

public class RequestBase {
    @SerializedName("passthrough")
    JsonObject passThrough;

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

    @Nullable
    public Integer getId() {
        return id;
    }

    public void setId(@Nullable Integer id) {
        this.id = id;
    }

    public Type getResponseType() {
        return responseType;
    }

    public void setResponseType(Type responseType) {
        this.responseType = responseType;
    }
}
