package com.binary.api.models.responses;

import com.binary.api.models.requests.OAuthApplicationsRequest;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * <h1>OAuthApplicationResponse</h1>
 *
 * <h2>OAuth Apps Receive</h2>
 * <p>
 *     A message with used applications
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/7/2017
 */
public class OAuthApplicationResponse extends ResponseBase<OAuthApplicationsRequest> {

    @SerializedName("oauth_apps")
    private List<OAuthApplication> oauthApplications;

    public List<OAuthApplication> getOauthApplications() {
        return oauthApplications;
    }
}
