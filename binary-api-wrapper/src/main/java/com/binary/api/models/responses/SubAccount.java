package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;

/**
 * Created by morteza on 7/28/2017.
 */
public class SubAccount {
    @SerializedName("loginid")
    private String loginId;

    @SerializedName("currency")
    private String currency;

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
