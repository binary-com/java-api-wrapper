package com.binary.api.models.responses;

import com.binary.api.models.requests.ProposalOpenContractRequest;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>ProposalOpenContractResponse</h1>
 *
 * <h2>Open contract proposal response</h2>
 * <p>
 *     Latest price and other details for an open contract in the user's portfolio
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/8/2017
 */
public class ProposalOpenContractResponse extends ResponseBase<ProposalOpenContractRequest> {

    /**
     * Latest price and other details for an open contract
     */
    @SerializedName("proposal_open_contract")
    private OpenContract openContract;

    public OpenContract getOpenContract() {
        return openContract;
    }
}
