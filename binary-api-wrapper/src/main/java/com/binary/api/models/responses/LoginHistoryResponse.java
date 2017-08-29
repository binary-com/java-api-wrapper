package com.binary.api.models.responses;

import com.binary.api.models.requests.LoginHistoryRequest;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * <h1>LoginHistoryResponse</h1>
 *
 * <h2>Login History Response</h2>
 * <p>
 *     Recent login/logout history records
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/7/2017
 */
public class LoginHistoryResponse extends ResponseBase<LoginHistoryRequest> {

    /**
     * Array of records of client login/logout activities
     */
    @SerializedName("login_history")
    private List<LoginHistory> loginHistories;

    public List<LoginHistory> getLoginHistories() {
        return loginHistories;
    }
}
