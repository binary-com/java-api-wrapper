package com.binary.api.models.requests;

import com.binary.api.models.responses.RevokeOauthApplicationResponse;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>RevokeOauthApplicationRequest</h1>
 *
 * <h2>Revoke Oauth Application Send</h2>
 * <p>
 *     Used for revoking access of particular app.
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/4/2017
 */
public class RevokeOauthApplicationRequest extends RequestBase {

    @SerializedName("revoke_oauth_app")
    private Long appId;

    public RevokeOauthApplicationRequest(Long appId) {
        this.responseType = RevokeOauthApplicationResponse.class;
        this.appId = appId;
    }
}
