package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

import java.math.BigDecimal;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/7/2017
 */
public class Transaction {

    /**
     * It is the remaining balance Example: 10150.1300
     */
    @SerializedName("balance_after")
    private BigDecimal balanceAfter;

    /**
     * It is the transaction id. In statement every contract (buy or sell) and every payment has a unique id.
     * Example: 10867502908
     */
    @SerializedName("transaction_id")
    private int transactionId;

    /**
     * Internal transaction identifier for the corresponding buy transaction ( set only for contract selling )
     */
    @SerializedName("reference_id")
    @Nullable
    private Integer referenceId;

    /**
     * It is the contract id Example: 4867502908
     */
    @SerializedName("contract_id")
    @Nullable
    private Integer contractId;

    /**
     * It is the time of transaction Example: 1441175849
     */
    @SerializedName("transaction_time")
    private int transactionTime;

    /**
     * Time at which contract was purchased, present only for sell transaction
     */
    @SerializedName("purchase_time")
    private int purchaseTime;

    /**
     * It is the type of action Example: buy
     */
    @SerializedName("action_type")
    private String actionType;

    /**
     * It is the amount of transaction Example: -83.2300
     */
    @SerializedName("amount")
    private BigDecimal amount;

    /**
     * The description of contract purchased if description is set to 1
     */
    @SerializedName("longcode")
    private String longCode;

    /**
     * Compact description of the contract purchased if description is set to 1
     */
    @SerializedName("shortcode")
    @Nullable
    private String shortCode;

    /**
     * Payout price
     */
    @SerializedName("payout")
    @Nullable
    private BigDecimal payout;

    /**
     * Id of an app where this transaction was performed. For example, it's 1 for binary.com.
     */
    @SerializedName("app_id")
    @Nullable
    private Integer applicationId;

    public BigDecimal getBalanceAfter() {
        return balanceAfter;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public Integer getReferenceId() {
        return referenceId;
    }

    public Integer getContractId() {
        return contractId;
    }

    public int getTransactionTime() {
        return transactionTime;
    }

    public int getPurchaseTime() {
        return purchaseTime;
    }

    public String getActionType() {
        return actionType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getLongCode() {
        return longCode;
    }

    public String getShortCode() {
        return shortCode;
    }

    public BigDecimal getPayout() {
        return payout;
    }

    public Integer getApplicationId() {
        return applicationId;
    }
}
