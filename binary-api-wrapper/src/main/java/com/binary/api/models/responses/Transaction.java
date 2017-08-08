package com.binary.api.models.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/8/2017
 */
public class Transaction {

    /**
     * Balance amount
     *
     */
    @SerializedName("balance")
    private BigDecimal balance;

    @SerializedName("action")
    private String action;

    /**
     * It is the contract id Example: 4867502908
     *
     */
    @SerializedName("contract_id")
    private Long contractId;

    /**
     * It is the transaction id. Every contract (buy or sell) or payment has a unique id. Example: 10867502908
     *
     */
    @SerializedName("transaction_id")
    private Long transactionId;

    /**
     * It is the amount of transaction performed Example: -83.2300
     *
     */
    @SerializedName("amount")
    private BigDecimal amount;

    /**
     * A stream id that can be used to cancel this stream using the Forget request. Example: 1d6651e7d599bce6c54bd71a8283e579
     *
     */
    @SerializedName("id")
    private String id;

    /**
     * Time at which transaction was performed, for buy its purchase time, for sell its sell time
     *
     */
    @SerializedName("transaction_time")
    private Long transactionTime;

    /**
     * Time at which contract was purchased, present only for sell transaction
     *
     */
    @SerializedName("purchase_time")
    private Long purchaseTime;

    /**
     * Transaction currency
     *
     */
    @SerializedName("currency")
    private String currency;

    /**
     * Description of contract purchased
     *
     */
    @SerializedName("longcode")
    private String longCode;

    /**
     * Symbol code
     *
     */
    @SerializedName("symbol")
    private String symbol;

    /**
     * Display name of symbol
     *
     */
    @SerializedName("display_name")
    private String displayName;

    /**
     * Epoch value of the expiry time of the contract. Please note that in case of buy transaction this is approximate value not exact one.
     *
     */
    @SerializedName("date_expiry")
    private Long dateExpiry;

    /**
     * Barrier of the contract. Only applicable to single barrier contracts. Could be undefined if a contract does not have a barrier.
     *
     */
    @SerializedName("barrier")
    private BigDecimal barrier;

    /**
     * The high barrier of a contract. Only applicable to double barrier contracts.
     *
     */
    @SerializedName("high_barrier")
    private BigDecimal highBarrier;

    /**
     * The low barrier of a contract. Only applicable to double barrier contracts.
     *
     */
    @SerializedName("low_barrier")
    private BigDecimal lowBarrier;

    public BigDecimal getBalance() {
        return balance;
    }

    public String getAction() {
        return action;
    }

    public Long getContractId() {
        return contractId;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getId() {
        return id;
    }

    public Long getTransactionTime() {
        return transactionTime;
    }

    public Long getPurchaseTime() {
        return purchaseTime;
    }

    public String getCurrency() {
        return currency;
    }

    public String getLongCode() {
        return longCode;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Long getDateExpiry() {
        return dateExpiry;
    }

    public BigDecimal getBarrier() {
        return barrier;
    }

    public BigDecimal getHighBarrier() {
        return highBarrier;
    }

    public BigDecimal getLowBarrier() {
        return lowBarrier;
    }
}
