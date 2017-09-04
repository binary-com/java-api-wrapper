package com.binary.api.models.requests;

import com.binary.api.models.responses.TNCApprovalResponse;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>TNCApprovalRequest</h1>
 *
 * <h2>T&C Approval Send</h2>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/4/2017
 */
public class TNCApprovalRequest extends RequestBase {

    @SerializedName("tnc_approval")
    private final int tcApproval = 1;

    /**
     * for ASK_UK_FUNDS_PROTECTION in cashier
     */
    @SerializedName("ukgc_funds_protection")
    private Integer askUKFundsProtection;

    public TNCApprovalRequest() {
        this.responseType = TNCApprovalResponse.class;
    }

    public Integer getAskUKFundsProtection() {
        return askUKFundsProtection;
    }

    public void setAskUKFundsProtection(Integer askUKFundsProtection) {
        this.askUKFundsProtection = askUKFundsProtection;
    }
}
