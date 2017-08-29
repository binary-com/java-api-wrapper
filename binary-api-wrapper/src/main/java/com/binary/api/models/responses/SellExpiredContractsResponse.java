package com.binary.api.models.responses;

import com.binary.api.models.requests.SellExpiredContractsRequest;
import com.google.gson.annotations.SerializedName;

import java.util.Map;

/**
 * <h1>SellExpiredContractsResponse</h1>
 *
 * <h2>Sell expired contracts</h2>
 * <p>
 *     Sell expired contract response
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/9/2017
 */
public class SellExpiredContractsResponse extends ResponseBase<SellExpiredContractsRequest> {

    /**
     * Sell expired contract object containing count of contracts sold
     */
    @SerializedName("sell_expired")
    private Map<String, Integer> result;

    public Integer getResult() {
        return result.size() > 0 ? result.get("count") : new Integer(0);
    }
}
