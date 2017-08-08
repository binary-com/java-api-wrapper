package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/8/2017
 */
public class RealityCheck {

    /**
     * Reality check summary start time epoch
     */
    @SerializedName("start_time")
    private Long startTime;

    /**
     * Client loginid Example: CR000000
     */
    @SerializedName("loginid")
    private String loginId;

    /**
     * Currency of client account i.e currency for trading
     */
    @SerializedName("currency")
    private String currency;

    /**
     * Total count of contract purchased.
     */
    @SerializedName("buy_count")
    private Integer buyCount;

    /**
     * Total amount of contract purchased.
     */
    @SerializedName("buy_amount")
    private BigDecimal buyAmount;

    /**
     * Total count of contract sold.
     */
    @SerializedName("sell_count")
    private Integer sellCount;

    /**
     * Total amount of contracts sold.
     */
    @SerializedName("sell_amount")
    private BigDecimal sellAmount;

    /**
     * Indicative profit of contract as per current market price.
     */
    @SerializedName("potential_profit")
    private BigDecimal potentialProfit;

    /**
     * Total count of contracts that are not yet expired.
     */
    @SerializedName("open_contract_count")
    private Integer openContractCount;

    public Long getStartTime() {
        return startTime;
    }

    public String getLoginId() {
        return loginId;
    }

    public String getCurrency() {
        return currency;
    }

    public Integer getBuyCount() {
        return buyCount;
    }

    public BigDecimal getBuyAmount() {
        return buyAmount;
    }

    public Integer getSellCount() {
        return sellCount;
    }

    public BigDecimal getSellAmount() {
        return sellAmount;
    }

    public BigDecimal getPotentialProfit() {
        return potentialProfit;
    }

    public Integer getOpenContractCount() {
        return openContractCount;
    }
}
