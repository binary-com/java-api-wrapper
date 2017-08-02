package com.binary.api.models.requests;

import com.binary.api.models.responses.LandingCompanyDetailsResponse;
import com.binary.api.utils.Validator;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>LandingCompanyDetailsRequest</h1>
 *
 * <h2>Landing Company Details Send</h2>
 *
 * <p>Binary.com has a number of licensed subsidiaries in various jurisidictions,
 * which are called Landing Companies (and which are wholly owned subsidiaries of the Binary Group).
 * This call provides information about each Landing Company.</p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/2/2017
 */
public class LandingCompanyDetailsRequest extends RequestBase {
    /**
     * Landing company shortcode (for example: costarica, malta, maltainvest, iom)
     */
    @SerializedName("landing_company_details")
    private String landingCompanyCode;

    public LandingCompanyDetailsRequest(String landingCompanyCode){
        this.responseType = LandingCompanyDetailsResponse.class;
        this.setLandingCompanyCode(landingCompanyCode);
    }

    public String getLandingCompanyCode() {
        return landingCompanyCode;
    }

    public void setLandingCompanyCode(String landingCompanyCode) {
        Validator.checkPattern("^(\\w|-){3,20}$", landingCompanyCode,
                "Landing Company Code does not match the regex pattern /^(\\w|-){3,20}$/");
        this.landingCompanyCode = landingCompanyCode;
    }
}
