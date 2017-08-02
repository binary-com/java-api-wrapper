package com.binary.api.models.requests;

import com.binary.api.models.responses.ForgetResponse;
import com.google.gson.annotations.SerializedName;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/1/2017
 */
public class ForgetRequest extends RequestBase {

    @SerializedName("forget")
    private String forget;

    public ForgetRequest(String forget){
        this.responseType = ForgetResponse.class;
        this.forget = forget;
    }

    public String getForget() {
        return forget;
    }

    public void setForget(String forget) {
        this.forget = forget;
    }
}
