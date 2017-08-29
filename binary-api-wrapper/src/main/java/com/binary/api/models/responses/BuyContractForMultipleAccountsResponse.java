package com.binary.api.models.responses;

import com.binary.api.models.requests.BuyContractForMultipleAccountsRequest;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * <h1>BuyContractForMultipleAccountsResponse</h1>
 *
 * <h2>Buy a Contract for multiple Accounts Receive</h2>
 * <p>
 *     A message with transaction results is received
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/8/2017
 */
public class BuyContractForMultipleAccountsResponse extends ResponseBase<BuyContractForMultipleAccountsRequest> {

    /**
     * Receipt confirmation for the purchase
     */
    @SerializedName("buy_contract_for_multiple_accounts")
    private MassBuyContractResult buyContractResult;

    public MassBuyContractResult getMassBuyContractResult() {
        return buyContractResult;
    }

    public class MassBuyContractResult {

        @SerializedName("result")
        private List<BuyReceipt> result;

        public List<BuyReceipt> getResult() {
            return result;
        }
    }
}
