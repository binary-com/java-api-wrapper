package com.binary.api.models.requests;

import com.binary.api.models.responses.LandingCompanyResponse;
import com.binary.api.utils.Validator;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>LandingCompanyRequest</h1>
 *
 * <h2>Landing Company Send</h2>
 * Binary.com has a number of licensed subsidiaries in various jurisidictions, which are called Landing Companies.
 * This call will return the appropriate Landing Company for clients of a given country.
 * The landing company may differ for gaming contracts (Volatility Indices)
 * and financial contracts (forex, stock indices, commodities)
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/1/2017
 */
public class LandingCompanyRequest extends RequestBase {

    /**
     * Client country
     */
    @SerializedName("landing_company")
    private String landingCompany;

    public LandingCompanyRequest(String landingCompany){
        this.responseType = LandingCompanyResponse.class;
        this.landingCompany = landingCompany;
    }

    public String getLandingCompany() {
        return landingCompany;
    }

    public void setLandingCompany(String landingCompany) {
        Validator.checkPattern("^\\w{2}$", landingCompany, "LandingCompany value does not match the regex pattern \\^\\w{2}$\\");
        this.landingCompany = landingCompany;
    }
}
