package com.binary.api.models.responses;

import com.binary.api.models.requests.CashierURLRequest;
import com.google.gson.annotations.SerializedName;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/14/2017
 */
public class CashierURLResponse extends ResponseBase<CashierURLRequest> {

    /**
     * cashier url,
     * Note possible error codes: ASK_TNC_APPROVAL (API tnc_approval), ASK_AUTHENTICATE,
     * ASK_UK_FUNDS_PROTECTION (API tnc_approval), ASK_CURRENCY (API set_account_currency),
     * ASK_EMAIL_VERIFY (verify_email), ASK_FIX_DETAILS (API set_settings)
     */
    @SerializedName("cashier")
    private String cashierURL;

    public String getCashierURL() {
        return cashierURL;
    }
}
