package com.binary.api.models.responses;

import com.binary.api.models.requests.ForgetRequest;
import com.google.gson.annotations.SerializedName;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/1/2017
 */
public class ForgetResponse extends ResponseBase<ForgetRequest> {
    @SerializedName("forget")
    private int forget;

    public int getForget() {
        return forget;
    }

    public void setForget(int forget) {
        this.forget = forget;
    }
}
