package com.binary.api.models.requests;

import com.binary.api.models.responses.SetAccountCurrencyResponse;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>SetAccountCurrencyRequest</h1>
 *
 * <h2>Set Account Currency</h2>
 * <p>
 *     Set account currency, this will be default currency for your account i.e currency for trading, deposit.
 *     Please note that account currency can only be set once, and then can never be changed.
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/4/2017
 */
public class SetAccountCurrencyRequest extends RequestBase {

    /**
     * Currency of the account. List of supported currencies can be acquired with 'payout_currencies' call
     */
    @SerializedName("set_account_currency")
    private String accountCurrency;

    public SetAccountCurrencyRequest(String accountCurrency) {
        this.responseType = SetAccountCurrencyResponse.class;
        this.accountCurrency = accountCurrency;
    }

    public String getAccountCurrency() {
        return accountCurrency;
    }

    public void setAccountCurrency(String accountCurrency) {
        this.accountCurrency = accountCurrency;
    }
}
