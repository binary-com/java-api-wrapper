package com.binary.api.models.requests;

import com.binary.api.models.responses.TimeResponse;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>TimeRequest</h1>
 *
 * <h2>Time request</h2>
 * <p>Request back-end server epoch time</p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/3/2017
 */
public class TimeRequest extends RequestBase {

    @SerializedName("time")
    private final int time = 1;

    public TimeRequest() {
        this.responseType = TimeResponse.class;
    }
}
