package com.binary.api.models.responses;

import com.binary.api.models.requests.TimeRequest;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>TimeResponse</h1>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/3/2017
 */
public class TimeResponse extends ResponseBase<TimeRequest> {

    /**
     * Epoch of server time.
     */
    @SerializedName("time")
    private int time;

    public int getTime() {
        return time;
    }
}
