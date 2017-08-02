package com.binary.api.models.requests;

import com.binary.api.models.responses.ResponseBase;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/1/2017
 */
public class ForgetAllResponse extends ResponseBase<ForgetAllRequest> {

    @SerializedName("forget_all")
    private String[] streams;

    public String[] getStreams() {
        return streams;
    }

    public void setStreams(String[] streams) {
        this.streams = streams;
    }
}
