package com.binary.api.models.responses;

import com.binary.api.models.requests.WebsiteStatusRequest;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>WebsiteStatusResponse</h1>
 *
 * <h2>Server status</h2>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/3/2017
 */
public class WebsiteStatusResponse extends ResponseBase<WebsiteStatusRequest> {

    @SerializedName("website_status")
    private WebsiteStatus websiteStatus;

    public WebsiteStatus getWebsiteStatus() {
        return websiteStatus;
    }
}
