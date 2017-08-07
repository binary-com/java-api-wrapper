package com.binary.api.models.responses;

import com.binary.api.models.requests.StatementRequest;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>StatementResponse</h1>
 *
 * <h2>Statement Receive</h2>
 * <p>
 *     A summary of account statement is received
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/7/2017
 */
public class StatementResponse extends ResponseBase<StatementRequest> {

    /**
     * Account statement.
     */
    @SerializedName("statement")
    private Statement statement;

    public Statement getStatement() {
        return statement;
    }
}
