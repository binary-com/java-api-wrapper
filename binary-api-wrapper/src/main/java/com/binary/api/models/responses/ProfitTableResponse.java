package com.binary.api.models.responses;

import com.binary.api.models.requests.ProfitTableRequest;
import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

/**
 * <h1>ProfitTableResponse</h1>
 *
 * <h2>Profit Table Receive</h2>
 * <p>
 *     A summary of account profit table is received
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/8/2017
 */
public class ProfitTableResponse extends ResponseBase<ProfitTableRequest> {

    /**
     * Account Profit Table.
     */
    @SerializedName("profit_table")
    @Nullable
    private ProfitTable profitTable;

    public ProfitTable getProfitTable() {
        return profitTable;
    }
}
