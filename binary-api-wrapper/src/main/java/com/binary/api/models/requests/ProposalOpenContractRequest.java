package com.binary.api.models.requests;

import com.binary.api.models.responses.ProposalOpenContractResponse;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>ProposalOpenContractRequest</h1>
 *
 * <h2>Latest price for an open contract</h2>
 * <p>
 *     Get latest price (and other information) for a contract in the user's portfolio
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/8/2017
 */
public class ProposalOpenContractRequest extends RequestBase {

    @SerializedName("proposal_open_contract")
    private final int proposalOpenContract = 1;

    /**
     * Contract id received from a Portfolio request. If not set, you will receive stream of all open contracts.
     */
    @SerializedName("contract_id")
    private Long contractId;

    public ProposalOpenContractRequest(Long contractId) {
        this.responseType = ProposalOpenContractResponse.class;
        this.contractId = contractId;
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }
}
