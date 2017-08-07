package com.binary.api.models.requests;

import com.binary.api.models.responses.OAuthApplicationResponse;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>OAuthApplicationsRequest</h1>
 *
 * <h2>OAuth Applications Send</h2>
 * <p>
 *     List all my used OAuth applications.
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/7/2017
 */
public class OAuthApplicationsRequest extends RequestBase {

    @SerializedName("oauth_apps")
    private final int oauthApps = 1;

    public OAuthApplicationsRequest() {
        this.responseType = OAuthApplicationResponse.class;
    }
}
