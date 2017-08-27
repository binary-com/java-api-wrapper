package com.binary.api.models.responses;

import com.binary.api.models.requests.ApplicationListRequest;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * <h1>ApplicationListResponse</h1>
 *
 * <h2>App List Receive</h2>
 * <p>A message with created applications</p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/24/2017
 */
public class ApplicationListResponse extends ResponseBase<ApplicationListRequest> {

    @SerializedName("app_list")
    private List<Application> applications;

    public List<Application> getApplications() {
        return applications;
    }
}
