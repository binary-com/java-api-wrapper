package com.binary.api.models.responses;

import com.binary.api.models.requests.TransferBetweenAccountsRequest;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

/**
 * <h1>TransferBetweenAccountsResponse</h1>
 *
 * <h2>Transfer Between Accounts Response</h2>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/15/2017
 */
public class TransferBetweenAccountsResponse extends ResponseBase<TransferBetweenAccountsRequest> {

    /**
     * If 1, transfer success.
     */
    @SerializedName("transfer_between_accounts")
    private Integer result;

    /**
     * the avaiable accounts to transfer
     */
    @SerializedName("accounts")
    private List<Map<String, String>> accounts;

    /**
     * the avaiable accounts to transfer
     */
    @SerializedName("client_to_full_name")
    private String clientToFullName;

    /**
     * The account to client loginid
     */
    @SerializedName("client_to_loginid")
    private String clientToLoginId;

    /**
     * Reference id of transfer performed
     */
    @SerializedName("transaction_id")
    private Long transactionId;

    public boolean getResult() {
        return result == 1 ? true : false;
    }

    public List<Map<String, String>> getAccounts() {
        return accounts;
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
