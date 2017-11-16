package com.binary.api.models.requests;

import com.binary.api.models.responses.TransferBetweenAccountsResponse;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

/**
 * <h1>TransferBetweenAccountsRequest</h1>
 *
 * <h2>Transfer Between Accounts Request</h2>
 * <p>
 *     This call allows transfers between accounts held by a given user with the 'malta' and
 *     'maltainvest' Landing Companies or between sub account and master account for omnibus accounts.
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/15/2017
 */
public class TransferBetweenAccountsRequest extends RequestBase {

    /**
     * if account_from and account_to are not provided, we'll just return available accounts
     */
    @SerializedName("transfer_between_accounts")
    private final int transferBetweenAccounts = 1;

    /**
     * The account_from loginid
     */
    @SerializedName("account_from")
    private String accountFrom;

    /**
     * The account_to loginid
     */
    @SerializedName("account_to")
    private String accountTo;

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

    public TransferBetweenAccountsRequest() {
        this.responseType = TransferBetweenAccountsResponse.class;
    }

    public String getAccountFrom() {
        return accountFrom;
    }

    public void setAccountFrom(String accountFrom) {
        this.accountFrom = accountFrom;
    }

    public String getAccountTo() {
        return accountTo;
    }

    public void setAccountTo(String accountTo) {
        this.accountTo = accountTo;
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
}
