package com.binary.api.models.responses;

import com.binary.api.models.requests.GetFinancialAssessmentRequest;
import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

/**
 * <h1>GetFinancialAssessmentResponse</h1>
 *
 * <h2>Get financial assessment details</h2>
 * <p>
 *     This call gets the financial assessment details of client's account.
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/29/2017
 */
public class GetFinancialAssessmentResponse extends ResponseBase<GetFinancialAssessmentRequest> {

    /**
     * Client's financial asessment details
     */
    @SerializedName("get_financial_assessment")
    @Nullable
    private FinancialAssessment financialAssessment;

    public FinancialAssessment getFinancialAssessment() {
        return financialAssessment;
    }
}
