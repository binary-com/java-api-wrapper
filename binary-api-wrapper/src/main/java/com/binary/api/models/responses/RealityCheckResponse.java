package com.binary.api.models.responses;

import com.binary.api.models.requests.RealityCheckRequest;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>RealityCheckResponse</h1>
 *
 * <h2>Reality check receive</h2>
 * <p>
 *     This gives summary of client's trades and account for reality check
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/8/2017
 */
public class RealityCheckResponse extends ResponseBase<RealityCheckRequest> {

    /**
     * Reality check summary of trades.
     */
    @SerializedName("reality_check")
    private RealityCheck realityCheck;

    public RealityCheck getRealityCheck() {
        return realityCheck;
    }
}
