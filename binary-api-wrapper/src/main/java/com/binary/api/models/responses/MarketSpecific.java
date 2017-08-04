package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/4/2017
 */
public class MarketSpecific {

    @SerializedName("name")
    private String name;

    @SerializedName("turnover_limit")
    private BigDecimal turnoverLimit;

    @SerializedName("payout_limit")
    private BigDecimal payoutLimit;

    @SerializedName("profile_name")
    private String profileName;

    public String getName() {
        return name;
    }

    public BigDecimal getTurnoverLimit() {
        return turnoverLimit;
    }

    public BigDecimal getPayoutLimit() {
        return payoutLimit;
    }

    public String getProfileName() {
        return profileName;
    }
}
