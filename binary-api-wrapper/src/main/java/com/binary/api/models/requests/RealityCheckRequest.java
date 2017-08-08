package com.binary.api.models.requests;

import com.binary.api.models.responses.RealityCheckResponse;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>RealityCheckRequest</h1>
 *
 * <h2>Reality check send</h2>
 * <p>
 *     Retrieve summary of client's trades and account for the Reality Check facility.
 *     A 'reality check' means a display of time elapsed since the session began, and associated client profit/loss.
 *     The Reality Check facility is a regulatory requirement for certain landing companies.
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/8/2017
 */
public class RealityCheckRequest extends RequestBase {

    @SerializedName("reality_check")
    private final int realityCheck = 1;

    public RealityCheckRequest() {
        this.responseType = RealityCheckResponse.class;
    }
}
