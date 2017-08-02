package com.binary.api.models.requests;

import com.binary.api.models.responses.PayoutCurrenciesResponse;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>PayoutCurrenciesRequest</h1>
 *
 * <h2>Payout Currencies Send</h2>
 * <p>Retrieve a list of available option payout currencies.
 * If a user is logged in, only the currency available for his account will be returned.</p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/2/2017
 */
public class PayoutCurrenciesRequest extends RequestBase {

    @SerializedName("payout_currencies")
    private final int payoutCurrencies = 1;

    public PayoutCurrenciesRequest(){
        this.responseType = PayoutCurrenciesResponse.class;
    }
}
