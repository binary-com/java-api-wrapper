package com.binary.api.models.requests;

import com.binary.api.models.responses.LoginHistoryResponse;
import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

/**
 * <h1>LoginHistoryRequest</h1>
 *
 * <h2>Login History</h2>
 * <p>
 *     Retrieve a summary of login history for user.
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/7/2017
 */
public class LoginHistoryRequest extends RequestBase {

    @SerializedName("login_history")
    private final int loginHistory = 1;

    /**
     * Apply limit to count of login history records, default to 10. Max:50
     */
    @SerializedName("limit")
    @Nullable
    private Integer limit;

    public LoginHistoryRequest() {
        this.responseType = LoginHistoryResponse.class;
    }

    public LoginHistoryRequest(Integer limit) {
        this();
        this.setLimit(limit);
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
