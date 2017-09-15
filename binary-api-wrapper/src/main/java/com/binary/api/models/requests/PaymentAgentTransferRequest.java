package com.binary.api.models.requests;

import com.binary.api.models.responses.PaymentAgentTransferResponse;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

/**
 * <h1>PaymentAgentTransferRequest</h1>
 *
 * <h2>Payment Agent Transfer Request</h2>
 * <p>Payment Agent Transfer - this call is available only to accounts that are approved Payment Agents.</p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/15/2017
 */
public class PaymentAgentTransferRequest extends RequestBase {

    @SerializedName("paymentagent_transfer")
    private final int paymentAgentTransfer = 1;

    /**
     * The transfer_to loginid
     */
    @SerializedName("transfer_to")
    private String transferTo;

    /**
     * Currency
     */
    @SerializedName("currency")
    private String currency;

    /**
     * Amount
     */
    @SerializedName("amount")
    private BigDecimal amount;

    /**
     * If 1, just do validation
     */
    @SerializedName("dry_run")
    private Integer dryRun;

    public PaymentAgentTransferRequest() {
        this.responseType = PaymentAgentTransferResponse.class;
    }

    public String getTransferTo() {
        return transferTo;
    }

    public void setTransferTo(String transferTo) {
        this.transferTo = transferTo;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public boolean getDryRun() {
        return dryRun == 1 ? true : false;
    }

    public void setDryRun(boolean dryRun) {
        this.dryRun = dryRun ? 1 : 0;
    }
}
