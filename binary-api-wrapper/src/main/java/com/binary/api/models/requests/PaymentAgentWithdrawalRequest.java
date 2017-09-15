package com.binary.api.models.requests;

import com.binary.api.models.responses.PaymentAgentWithdrawalResponse;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

/**
 * <h1>PaymentAgentWithdrawalRequest</h1>
 *
 * <h2>Payment Agent Withdrawal Request</h2>
 * <p>Initiate a withdrawal to an approved Payment Agent.</p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/15/2017
 */
public class PaymentAgentWithdrawalRequest extends RequestBase {

    @SerializedName("paymentagent_withdraw")
    private final int paymentAgentWithdraw = 1;

    /**
     * The payment agent loginid received from the paymentagent_list call
     */
    @SerializedName("paymentagent_loginid")
    private String loginId;

    /**
     * Currency
     */
    @SerializedName("currency")
    private String currency;

    /**
     * Amount
     */
    @SerializedName("amount")
    private BigDecimal amount;

    /**
     * Email verification code (received from a verify_email call, which must be done first)
     */
    @SerializedName("verification_code")
    private String verificationCode;

    /**
     * Optional field for remarks about the withdraw. Only letters, numbers, space, period, comma, - ' are allowed.
     */
    @SerializedName("description")
    private String description;

    /**
     * If 1, just do validation
     */
    @SerializedName("dry_run")
    private Integer dryRun;

    public PaymentAgentWithdrawalRequest() {
        this.responseType = PaymentAgentWithdrawalResponse.class;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getDryRun() {
        return dryRun == 1 ? true : false;
    }

    public void setDryRun(boolean dryRun) {
        this.dryRun = dryRun ? 1 : 0;
    }
}
