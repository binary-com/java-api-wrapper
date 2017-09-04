package com.binary.api.models.responses;

import com.binary.api.models.requests.SetAccountCurrencyRequest;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>SetAccountCurrencyResponse</h1>
 *
 * <h2>Set Account Currency Response</h2>
 * <p>
 *     Status of set account currency call
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/4/2017
 */
public class SetAccountCurrencyResponse extends ResponseBase<SetAccountCurrencyRequest> {

    /**
     * 1: success, 0: no change
     */
    @SerializedName("set_account_currency")
    private Integer result;

    public Integer getResult() {
        return result;
    }
}
