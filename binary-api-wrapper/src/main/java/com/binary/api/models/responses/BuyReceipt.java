package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/8/2017
 */
public class BuyReceipt {

    /**
     * The new account balance after completion of the purchase
     * (Required)
     *
     */
    @SerializedName("balance_after")
    private BigDecimal balanceAfter;

    /**
     * The description of contract purchased
     * (Required)
     *
     */
    @SerializedName("longcode")
    private String longCode;

    /**
     * Compact description of the contract purchased
     * (Required)
     *
     */
    @SerializedName("shortcode")
    private String shortCode;

    /**
     * Epoch value showing the expected start time of the contract
     * (Required)
     *
     */
    @SerializedName("start_time")
    private Long startTime;

    /**
     * Internal contract identifier
     * (Required)
     *
     */
    @SerializedName("contract_id")
    private Long contractId;

    /**
     * Actual effected purchase price
     * (Required)
     *
     */
    @SerializedName("buy_price")
    private BigDecimal buyPrice;

    /**
     * Epoch value of the transaction purchase time
     * (Required)
     *
     */
    @SerializedName("purchase_time")
    private Long purchaseTime;

    /**
     * Internal transaction identifier
     * (Required)
     *
     */
    @SerializedName("transaction_id")
    private Long transactionId;

    /**
     * Proposed payout value
     * (Required)
     *
     */
    @SerializedName("payout")
    private BigDecimal payout;

    public BigDecimal getBalanceAfter() {
        return balanceAfter;
    }

    public String getLongCode() {
        return longCode;
    }

    public String getShortCode() {
        return shortCode;
    }

    public Long getStartTime() {
        return startTime;
    }

    public Long getContractId() {
        return contractId;
    }

    public BigDecimal getBuyPrice() {
        return buyPrice;
    }

    public Long getPurchaseTime() {
        return purchaseTime;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public BigDecimal getPayout() {
        return payout;
    }
}
