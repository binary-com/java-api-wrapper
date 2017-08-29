package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/7/2017
 */
public class Portfolio {

    /**
     * Client open positions
     */
    @SerializedName("contracts")
    private List<PortfolioTransaction> contracts;

    public List<PortfolioTransaction> getContracts() {
        return contracts;
    }
}
