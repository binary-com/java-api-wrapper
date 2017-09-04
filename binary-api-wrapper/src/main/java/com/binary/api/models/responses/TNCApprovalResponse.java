package com.binary.api.models.responses;

import com.binary.api.models.requests.TNCApprovalRequest;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>TNCApprovalResponse</h1>
 *
 * <h2>T&C Approval Receive</h2>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/4/2017
 */
public class TNCApprovalResponse extends ResponseBase<TNCApprovalRequest> {

    @SerializedName("tnc_approval")
    private Integer result;

    public Integer getResult() {
        return result;
    }
}
