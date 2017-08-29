package com.binary.api.models.requests;

import com.binary.api.models.responses.SellExpiredContractsResponse;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>SellExpiredContractsRequest</h1>
 *
 * <h2>Sell expired contracts</h2>
 * <p>
 *     This call will try to sell any expired contracts and return the number of sold contracts.
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/9/2017
 */
public class SellExpiredContractsRequest extends RequestBase {

    @SerializedName("sell_expired")
    private final int sellExpired = 1;

    public SellExpiredContractsRequest() {
        this.responseType = SellExpiredContractsResponse.class;
    }
}
