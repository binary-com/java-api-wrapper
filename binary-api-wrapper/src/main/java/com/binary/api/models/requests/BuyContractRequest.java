package com.binary.api.models.requests;

import com.binary.api.models.responses.BuyContractResponse;
import com.binary.api.utils.Validator;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

/**
 * <h1>BuyContractRequest</h1>
 *
 * <h2>Buy a Contract Send</h2>
 * <p>
 *     Buy a Contract
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/8/2017
 */
public class BuyContractRequest extends RequestBase {

    /**
     * Either the id received from a Price Proposal (proposal) call, or 1 if contract proposalId parameters are passed in the parameters field
     */
    @SerializedName("buy")
    private String proposalId;

    /**
     * Maximum price at which to purchase the contract.
     */
    @SerializedName("price")
    private BigDecimal price;

    /**
     * Optional field, used to pass the parameters for contract proposalId
     */
    @SerializedName("parameters")
    private BuyContractParameters
            parameters;

    private BuyContractRequest() {
        this.responseType = BuyContractResponse.class;
    }

    public BuyContractRequest(BigDecimal price , BuyContractParameters parameters) {
        this();
        this.proposalId = "1";
        this.setPrice(price);
        this.setParameters(parameters);
    }

    public BuyContractRequest(String proposalId, BigDecimal price) {
        this();
        this.setProposalId(proposalId);
        this.setPrice(price);

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

    public BuyContractParameters getParameters() {
        return parameters;
    }

    public void setParameters(BuyContractParameters parameters) {
        this.parameters = parameters;
    }
}
