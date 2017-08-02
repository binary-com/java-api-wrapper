package com.binary.api.models.responses;

import com.binary.api.models.requests.PayoutCurrenciesRequest;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/2/2017
 */
public class PayoutCurrenciesResponse extends ResponseBase<PayoutCurrenciesRequest> {

    /**
     * Available payout currencies.
     * Note: if a user is logged in, only the currency available for his account will be returned.
     */
    @SerializedName("payout_currencies")
    private List<String> payoutCurrencies;

    public List<String> getPayoutCurrencies() {
        return payoutCurrencies;
    }
}
