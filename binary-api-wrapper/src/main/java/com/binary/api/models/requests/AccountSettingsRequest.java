package com.binary.api.models.requests;

import com.binary.api.models.responses.AccountSettingsResponse;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>AccountSettingsRequest</h1>
 * <p>
 * <h2>Get User Settings Send</h2>
 * <p>
 * Get User Settings (email, date of birth, address etc)
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/4/2017
 */
public class AccountSettingsRequest extends RequestBase {

    @SerializedName("get_settings")
    private final int getSettings = 1;

    public AccountSettingsRequest() {
        this.responseType = AccountSettingsResponse.class;
    }
}
