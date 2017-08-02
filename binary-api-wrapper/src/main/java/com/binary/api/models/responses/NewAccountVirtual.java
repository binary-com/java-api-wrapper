package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/2/2017
 */
public class NewAccountVirtual {
    /**
     * Client id of the new virtual-money account
     */
    @SerializedName("client_id")
    private String clientId;

    /**
     * Email of the new virtual-money account
     */
    @SerializedName("email")
    private String email;

    /**
     * Account currency
     */
    @SerializedName("currency")
    private String currency;

    /**
     * Account balance
     */
    @SerializedName("balance")
    private BigDecimal balance;

    /**
     * Oauth token for the client's login session (so that the user may be logged in immediately)
     */
    @SerializedName("oauth_token")
    private String oauthToken;

    public String getClientId() {
        return clientId;
    }

    public String getEmail() {
        return email;
    }

    public String getCurrency() {
        return currency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public String getOauthToken() {
        return oauthToken;
    }
}
