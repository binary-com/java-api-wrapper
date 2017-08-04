package com.binary.api.models.requests;

import com.binary.api.models.responses.AccountLimitsResponse;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>AccountLimitsRequest</h1>
 *
 * <h2>Get Limits Send</h2>
 * <p>Trading and Withdrawal Limits for a given user</p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/3/2017
 */
public class AccountLimitsRequest extends RequestBase {

    @SerializedName("get_limits")
    private final int getLimits = 1;

    public AccountLimitsRequest() {
        this.responseType = AccountLimitsResponse.class;
    }
}
