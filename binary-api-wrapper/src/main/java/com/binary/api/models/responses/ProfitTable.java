package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/8/2017
 */
public class ProfitTable {

    /**
     * Number of transactions returned in this call
     */
    @SerializedName("count")
    private Integer count;

    /**
     * Array of returned transactions
     */
    @SerializedName("transactions")
    private List<ProfitTableTransaction> transactions;

    public Integer getCount() {
        return count;
    }

    public List<ProfitTableTransaction> getTransactions() {
        return transactions;
    }
}
