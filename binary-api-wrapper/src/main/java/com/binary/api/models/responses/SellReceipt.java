package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/9/2017
 */
public class SellReceipt {

    @SerializedName("balance_after")
    private BigDecimal balanceAfter;

    @SerializedName("contract_id")
    private Long contractId;

    @SerializedName("reference_id")
    private Long referenceId;

    @SerializedName("sell_price")
    private BigDecimal sellPrice;

    @SerializedName("sell_time")
    private String sellTime;

    @SerializedName("transaction_id")
    private Long transactionId;

    @SerializedName("token")
    private String token;

    public BigDecimal getBalanceAfter() {
        return balanceAfter;
    }

    public Long getContractId() {
        return contractId;
    }

    public Long getReferenceId() {
        return referenceId;
    }

    public BigDecimal getSellPrice() {
        return sellPrice;
    }

    public String getSellTime() {
        return sellTime;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public String getToken() {
        return token;
    }
}
