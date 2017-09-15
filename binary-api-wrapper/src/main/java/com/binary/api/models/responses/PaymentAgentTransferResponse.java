package com.binary.api.models.responses;

import com.binary.api.models.requests.PaymentAgentTransferRequest;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>PaymentAgentTransferResponse</h1>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/15/2017
 */
public class PaymentAgentTransferResponse extends ResponseBase<PaymentAgentTransferRequest> {

    /**
     * If 1, transfer success. If 2, dry-run success.
     */
    @SerializedName("paymentagent_transfer")
    private Integer result;

    /**
     * The transfer_to client full name
     */
    @SerializedName("client_to_full_name")
    private String clientToFullName;

    /**
     * The transfer_to client loginid
     */
    @SerializedName("client_to_loginid")
    private String clientToLoginId;

    /**
     * Reference id of transfer performed
     */
    @SerializedName("transaction_id")
    private Long transactionId;

    public Integer getResult() {
        return result;
    }

    public String getClientToFullName() {
        return clientToFullName;
    }

    public String getClientToLoginId() {
        return clientToLoginId;
    }

    public Long getTransactionId() {
        return transactionId;
    }
}
