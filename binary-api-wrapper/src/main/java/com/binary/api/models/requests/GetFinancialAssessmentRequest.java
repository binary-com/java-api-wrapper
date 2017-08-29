package com.binary.api.models.requests;

import com.binary.api.models.responses.GetFinancialAssessmentResponse;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>GetFinancialAssessmentRequest</h1>
 *
 * <h2>Get financial assessment details</h2>
 * <p>
 *     This call gets the financial assessement details.
 *     The 'financial assessment' is a questionnaire that clients of certain Landing Companies need to complete,
 *     due to regulatory and KYC (know your client) requirements.
 *     Not applicable for Japan landing company.
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/29/2017
 */
public class GetFinancialAssessmentRequest extends RequestBase {

    @SerializedName("get_financial_assessment")
    private final int getFinancialAssessment = 1;

    public GetFinancialAssessmentRequest() {
        this.responseType = GetFinancialAssessmentResponse.class;
    }
}
