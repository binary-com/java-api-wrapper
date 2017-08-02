package com.binary.api.models.requests;

import com.binary.api.models.responses.PaymentAgentListResponse;
import com.binary.api.utils.Validator;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>PaymentAgentListRequest</h1>
 *
 * <h2>Payment Agent List Send</h2>
 *
 * <p>Will return a list of Payment Agents for a given country.
 * Payment agents allow Binary.com users to deposit and withdraw funds using local payment methods
 * that might not be available via the main Binary.com cashier system.</p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/2/2017
 */
public class PaymentAgentListRequest extends RequestBase {

    /**
     * Client country (2-letter country code).
     */
    @SerializedName("paymentagent_list")
    private String countryCode;

    public PaymentAgentListRequest(String countryCode) {
        this.responseType = PaymentAgentListResponse.class;
        this.setCountryCode(countryCode);
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        Validator.checkPattern("^\\w\\w$", countryCode,
                "Country Code does not match the regex pattern /^\\w\\w$/");
        this.countryCode = countryCode;
    }
}
