package com.binary.api.models.responses;

import com.binary.api.models.requests.TransactionsStreamRequest;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>TransactionStreamResponse</h1>
 *
 * <h2>Transaction Updates</h2>
 * <p>
 *     Return transaction updates
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/8/2017
 */
public class TransactionsStreamResponse extends ResponseBase<TransactionsStreamRequest> {

    /**
     * Realtime stream of user transaction updates.
     */
    @SerializedName("transaction")
    private Transaction transaction;

    public Transaction getTransaction() {
        return transaction;
    }
}
