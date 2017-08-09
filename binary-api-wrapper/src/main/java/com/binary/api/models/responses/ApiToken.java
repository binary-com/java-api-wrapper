package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/9/2017
 */
public class ApiToken {

    /**
     * Display name
     */
    @SerializedName("display_name")
    private String displayName;

    /**
     * Last used
     */
    @SerializedName("last_used")
    private String lastUsed;

    /**
     * Scopes
     */
    @SerializedName("scopes")
    private List<String> scopes;

    /**
     * Token
     */
    @SerializedName("token")
    private String Token;

    /**
     * Validated IP(s) list
     */
    @SerializedName("valid_for_ip")
    private String validForIp;

    public String getDisplayName() {
        return displayName;
    }

    public String getLastUsed() {
        return lastUsed;
    }

    public List<String> getScopes() {
        return scopes;
    }

    public String getToken() {
        return Token;
    }

    public String getValidForIp() {
        return validForIp;
    }
}
