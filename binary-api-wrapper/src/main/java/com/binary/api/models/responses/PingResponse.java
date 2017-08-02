package com.binary.api.models.responses;

import com.binary.api.models.requests.PingRequest;
import com.google.gson.annotations.SerializedName;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/2/2017
 */
public class PingResponse extends ResponseBase<PingRequest> {

    /**
     * Will return 'pong'
     */
    @SerializedName("ping")
    private String ping;

    public String getPing() {
        return ping;
    }
}
