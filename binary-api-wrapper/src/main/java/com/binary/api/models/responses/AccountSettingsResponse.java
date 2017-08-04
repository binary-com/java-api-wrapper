package com.binary.api.models.responses;

import com.binary.api.models.requests.AccountSettingsRequest;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>AccountSettingsResponse</h1>
 * <p>
 * <h2>Get User Settings Receive</h2>
 * <p>A message with User Settings</p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/4/2017
 */
public class AccountSettingsResponse extends ResponseBase<AccountSettingsRequest> {

    /**
     * Account settings
     */
    @SerializedName("get_settings")
    private AccountSettings settings;

    public AccountSettings getSettings() {
        return settings;
    }
}
