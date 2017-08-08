package com.binary.api.models.responses;

import com.binary.api.models.requests.BuyContractRequest;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

/**
 * <h1>BuyContractResponse</h1>
 *
 * <h2>Buy a Contract Receive</h2>
 * <p>
 *     A message with transaction results is received
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/8/2017
 */
public class BuyContractResponse extends ResponseBase<BuyContractRequest> {

    /**
     *
     */
    @SerializedName("buy")
    private BuyReceipt buyReceipt;

    public BuyReceipt getBuyReceipt() {
        return buyReceipt;
    }
}
