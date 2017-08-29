package com.binary.api.models.responses;

import com.binary.api.models.requests.BalanceRequest;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>BalanceResponse</h1>
 *
 * <h2>Realtime Balance</h2>
 * <p>Return details of user account balance</p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/4/2017
 */
public class BalanceResponse extends ResponseBase<BalanceRequest> {

    /**
     * Realtime stream of user balance changes.
     */
    @SerializedName("balance")
    private Balance balance;

    public Balance getBalance() {
        return balance;
    }
}
