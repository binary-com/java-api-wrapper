package com.binary.api.models.requests;

import com.binary.api.models.responses.BuyContractForMultipleAccountsResponse;
import com.binary.api.models.responses.BuyContractResponse;
import com.binary.api.utils.Validator;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/8/2017
 */
public class BuyContractForMultipleAccountsRequest extends RequestBase {

    /**
     * Either the id received from a Price Proposal (proposal) call, or 1 if contract buy parameters are passed in the parameters field
     */
    @SerializedName("buy_contract_for_multiple_accounts")
    private String proposalId;

    /**
     * Maximum price at which to purchase the contract.
     */
    @SerializedName("price")
    private BigDecimal price;

    /**
     * API tokens identifying the accounts for which the contract is bought.
     * Note, if the same token appears multiple times or if multiple tokens designate the same account, the contract is bought multiple times for this account.
     */
    @SerializedName("tokens")
    private List<String> tokens;

    /**
     * Optional field, used to pass the parameters for contract buy
     */
    @SerializedName("parameters")
    private BuyContractParameters parameters;

    private BuyContractForMultipleAccountsRequest() {
        this.responseType = BuyContractForMultipleAccountsResponse.class;
    }

    public BuyContractForMultipleAccountsRequest(BigDecimal price ,
                                                 BuyContractParameters parameters, List<String> tokens) {
        this();
        this.proposalId = "1";
        this.setPrice(price);
        this.setTokens(tokens);
        this.setParameters(parameters);
    }

    public BuyContractForMultipleAccountsRequest(String proposalId, BigDecimal price, List<String> tokens) {
        this();
        this.setProposalId(proposalId);
        this.setPrice(price);
        this.setTokens(tokens);

    }

    public String getProposalId() {
        return proposalId;
    }

    public void setProposalId(String proposalId) {
        Validator.checkPattern("^(?:[\\w-]{32,128}|1)$", proposalId,
                "Proposal Id does not match the regex pattern /^(?:[\\w-]{32,128}|1)$/");
        this.proposalId = proposalId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<String> getTokens() {
        return tokens;
    }

    public void setTokens(List<String> tokens) {
        this.tokens = tokens;
    }

    public BuyContractParameters getParameters() {
        return parameters;
    }

    public void setParameters(BuyContractParameters parameters) {
        this.parameters = parameters;
    }
}
