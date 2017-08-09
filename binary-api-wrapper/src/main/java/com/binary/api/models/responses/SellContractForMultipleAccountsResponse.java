package com.binary.api.models.responses;

import com.binary.api.models.requests.SellContractForMultipleAccountsRequest;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * <h1>SellContractForMultipleAccountsResponse</h1>
 *
 * <h2>Sell for multiple contracts response</h2>
 * <p>
 *     Confirmation of the sale status for the selected contracts and accounts.
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/9/2017
 */
public class SellContractForMultipleAccountsResponse extends ResponseBase<SellContractForMultipleAccountsRequest> {

    /**
     * Status information for each affected acccount
     */
    @SerializedName("sell_contract_for_multiple_accounts")
    private MassSellContractResult massSellContractResult;

    public MassSellContractResult getMassSellContractResult() {
        return massSellContractResult;
    }

    public class MassSellContractResult {

        @SerializedName("result")
        private List<MassSellReceipt> massSellReceipts;

        public List<MassSellReceipt> getSellReceipts() {
            return massSellReceipts;
        }
    }
}
