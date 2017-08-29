package com.binary.api.models.responses;

import com.binary.api.models.requests.AccountLimitsRequest;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>AccountLimitResponse</h1>
 *
 * <h2>Get Limits Receive</h2>
 * <p>Trading and Withdrawal Limits</p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/3/2017
 */
public class AccountLimitsResponse extends ResponseBase<AccountLimitsRequest> {

    /**
     * Trading limits of real account user
     */
    @SerializedName("get_limits")
    private AccountLimits limits;

    public AccountLimits getLimits() {
        return limits;
    }
}