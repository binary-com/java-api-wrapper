package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/9/2017
 */
public class SellReceipt {

    /**
     * New account balance after completion of the sale
     */
    @SerializedName("balance_after")
    private BigDecimal balanceAfter;

    /**
     * Internal contract identifier for the sold contract
     */
    @SerializedName("contract_id")
    private Long contractId;

    /**
     * Actual effected sale price
     */
    @SerializedName("sold_for")
    private BigDecimal soldFor;

    /**
     * Internal transaction identifier for the sale transaction
     */
    @SerializedName("transaction_id")
    private Long transactionId;

    /**
     * Internal transaction identifier for the corresponding buy transaction
     */
    @SerializedName("reference_id")
    private Long referenceId;

    public BigDecimal getBalanceAfter() {
        return balanceAfter;
    }

    public Long getContractId() {
        return contractId;
    }

    public BigDecimal getSoldFor() {
        return soldFor;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public Long getReferenceId() {
        return referenceId;
    }
}