package com.binary.api.models.responses;

import com.binary.api.models.requests.LandingCompanyDetailsRequest;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>LandingCompanyDetailsResponse</h1>
 *
 * <h2>Landing Company Receive</h2>
 * <p>A message with Landing Company</p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/2/2017
 */
public class LandingCompanyDetailsResponse extends ResponseBase<LandingCompanyDetailsRequest> {
    /**
     * Landing Company Details
     */
    @SerializedName("landing_company_details")
    private LandingCompanyDetails landingCompanyDetails;

    public LandingCompanyDetails getLandingCompanyDetails() {
        return landingCompanyDetails;
    }
}
