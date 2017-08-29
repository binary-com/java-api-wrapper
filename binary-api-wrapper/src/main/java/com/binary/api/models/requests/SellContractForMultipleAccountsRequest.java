package com.binary.api.models.requests;

import com.binary.api.models.responses.SellContractForMultipleAccountsResponse;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.List;

/**
 * <h1>SellContractForMultipleAccounts</h1>
 *
 * <h2>Sell multiple contracts</h2>
 * <p>
 *     Sell contracts for multiple accounts simultaneously. Uses the shortcode response from buy_contract_for_multiple_accounts to identify the contract,
 *     and authorisation tokens to select which accounts to sell those contracts on. Note that only the accounts identified by the tokens will be affected.
 *     This will not sell the contract on the currently-authorised account unless you include the token for the current account.
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/9/2017
 */
public class SellContractForMultipleAccountsRequest extends RequestBase {

    @SerializedName("sell_contract_for_multiple_accounts")
    private final int sellContractForMultipleAccounts = 1;

    /**
     * An internal ID used to identify the contract which was originally bought.
     * This is returned from the buy and buy_for_multiple_accounts calls.
     */
    @SerializedName("shortcode")
    private String shortCode;

    /**
     * Authorisation tokens which select the accounts to sell use for the affected accounts
     */
    @SerializedName("tokens")
    private List<String> tokens;

    /**
     * Minimum price at which to sell the contract, or '0' for 'sell at market'
     */
    @SerializedName("price")
    private BigDecimal price;

    private SellContractForMultipleAccountsRequest() {
        this.responseType = SellContractForMultipleAccountsResponse.class;
    }

    public SellContractForMultipleAccountsRequest(String shortCode, BigDecimal price, List<String> tokens) {
        this();
        this.price = price;
        this.tokens = tokens;
        this.shortCode = shortCode;
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public List<String> getTokens() {
        return tokens;
    }

    public void setTokens(List<String> tokens) {
        this.tokens = tokens;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
