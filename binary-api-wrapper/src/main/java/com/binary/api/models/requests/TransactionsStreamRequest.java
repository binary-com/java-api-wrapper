package com.binary.api.models.requests;

import com.binary.api.models.responses.TransactionsStreamResponse;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>TransactionsStreamRequest</h1>
 *
 * <h2>Transaction Subscription</h2>
 * <p>
 *     Subscribe to transaction notifications
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/8/2017
 */
public class TransactionsStreamRequest extends RequestBase {

    @SerializedName("transaction")
    private final int transaction = 1;

    @SerializedName("subscribe")
    private final int subscribe = 1;

    public TransactionsStreamRequest() {
        this.responseType = TransactionsStreamResponse.class;
    }
}
