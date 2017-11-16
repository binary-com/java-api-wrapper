package com.binary.api.models.responses;

import com.binary.api.models.requests.PaymentAgentWithdrawalRequest;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>PaymentAgentWithdrawalResponse</h1>
 *
 * <h2>Payment Agent Withdrawal Response</h2>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/15/2017
 */
public class PaymentAgentWithdrawalResponse extends ResponseBase<PaymentAgentWithdrawalRequest> {

    /**
     * If 1, withdrawal success. If 2, dry-run success.
     */
    @SerializedName("paymentagent_withdraw")
    private Integer result;

    /**
     * Payment agent name
     */
    @SerializedName("paymentagent_name")
    private String paymentAgentName;

    /**
     * Reference id of withdrawal performed
     */
    @SerializedName("transaction_id")
    private Long transactionId;

    public Integer getResult() {
        return result;
    }

    public String getPaymentAgentName() {
        return paymentAgentName;
    }

    public Long getTransactionId() {
        return transactionId;
    }
}
