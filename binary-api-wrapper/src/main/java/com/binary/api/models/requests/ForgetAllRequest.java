package com.binary.api.models.requests;

import com.binary.api.models.enums.StreamTypes;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>ForgetAllRequest</h1>
 *
 * <h2>Cancel Incoming Streams Based on Type</h2>
 * Immediately cancel the real-time streams of messages of given type
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/1/2017
 */
public class ForgetAllRequest extends RequestBase {

    /**
     * Cancel all streams of a given type (which should be 'ticks', 'proposal', 'proposal_open_contract', etc)
     */
    @SerializedName("forget_all")
    private String stream;

    public ForgetAllRequest(StreamTypes stream){
        this.responseType = ForgetAllResponse.class;
        this.stream = stream.toString();
    }


}
