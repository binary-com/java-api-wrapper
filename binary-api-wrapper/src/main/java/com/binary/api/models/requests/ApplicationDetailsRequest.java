package com.binary.api.models.requests;

import com.binary.api.models.responses.ApplicationDetailsResponse;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>ApplicationDetailsRequest</h1>
 *
 * <h2>App Get Send</h2>
 * <p>get created OAuth application by app_id</p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/27/2017
 */
public class ApplicationDetailsRequest extends RequestBase {

    @SerializedName("app_get")
    private Long applicationId;

    public ApplicationDetailsRequest(Long applicationId) {
        this.responseType = ApplicationDetailsResponse.class;
        this.setApplicationId(applicationId);
    }

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }
}
