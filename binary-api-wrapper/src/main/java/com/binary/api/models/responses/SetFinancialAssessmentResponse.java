package com.binary.api.models.responses;

import com.binary.api.models.requests.SetFinancialAssessmentRequest;
import com.google.gson.annotations.SerializedName;

import java.util.Map;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/10/2017
 */
public class SetFinancialAssessmentResponse extends ResponseBase<SetFinancialAssessmentRequest> {

    @SerializedName("set_financial_assessment")
    private Map<String, Integer> result;

    public Map<String, Integer> getResult() {
        return result;
    }
}
