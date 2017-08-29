package com.binary.api.models.requests;

import com.binary.api.models.responses.SellContractResponse;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

/**
 * <h1>SellContractRequest</h1>
 *
 * <h2>Sell a Contract Send</h2>
 * <p>
 *     Sell a Contract as identified from a previous Portfolio call
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/9/2017
 */
public class SellContractRequest extends RequestBase {

    /**
     * Pass contract_id received from the Portfolio call
     */
    @SerializedName("sell")
    private Long contractId;

    /**
     * Minimum price at which to sell the contract, or '0' for 'sell at market'
     */
    @SerializedName("price")
    private BigDecimal price;

    private SellContractRequest() {
        this.responseType = SellContractResponse.class;
    }

    public SellContractRequest(Long contractId, BigDecimal price) {
        this();
        this.price = price;
        this.contractId = contractId;
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
