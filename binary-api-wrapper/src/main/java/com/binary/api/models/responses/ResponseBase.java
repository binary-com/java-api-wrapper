package com.binary.api.models.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by morteza on 7/19/2017.
 */

public abstract class ResponseBase<T> {
    @SerializedName("echo_req")
    @Expose
    T request;

    @SerializedName("msg_type")
    @Expose
    String type;

    public String getType(){
        return this.type;
    }

    public T getRequest(){
        return this.request;
    }
}
