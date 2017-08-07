package com.binary.api.models.requests;

import com.binary.api.models.responses.LogoutResponse;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>LogoutReques</h1>
 *
 * <h2>Logout Request</h2>
 * <p>
 *     Logout the session
 * </p>
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/7/2017
 */
public class LogoutRequest extends RequestBase {

    @SerializedName("logout")
    private final int logout = 1;

    public LogoutRequest() {
        this.responseType = LogoutResponse.class;
    }
}
