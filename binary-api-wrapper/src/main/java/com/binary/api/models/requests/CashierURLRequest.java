package com.binary.api.models.requests;

import com.binary.api.models.enums.CashierProviders;
import com.binary.api.models.enums.CashierTypes;
import com.binary.api.models.responses.CashierURLResponse;
import com.google.gson.annotations.SerializedName;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/14/2017
 */
public class CashierURLRequest extends RequestBase {

    /**
     * either deposit or withdraw, default to deposit
     */
    @SerializedName("cashier")
    private String cashier;

    /**
     * Note only doughflow is supported currently, epg is only for test.
     */
    @SerializedName("provider")
    private String provider;

    /**
     * Email verification code (received from a verify_email call, which must be done first)
     */
    @SerializedName("verification_code")
    private String verificationCode;

    public CashierURLRequest(CashierTypes type) {
        this.responseType = CashierURLResponse.class;
        this.setCashier(type);
    }

    public String getCashier() {
        return cashier;
    }

    public void setCashier(CashierTypes cashier) {
        this.cashier = cashier.toString();
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(CashierProviders provider) {
        this.provider = provider.toString();
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }
}
