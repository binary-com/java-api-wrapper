package com.binary.api.models.requests;

import com.binary.api.models.responses.AccountStatusResponse;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>AccountStatusRequest</h1>
 *
 * <h2>Get Account Status Send</h2>
 * <p>Get Account Status</p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/4/2017
 */
public class AccountStatusRequest extends RequestBase {

    @SerializedName("get_account_status")
    private final int status = 1;

    public AccountStatusRequest() {
        this.responseType = AccountStatusResponse.class;
    }
}
