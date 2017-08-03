package com.binary.api.models.requests;

import com.binary.api.models.enums.EmailVerificationReasons;
import com.binary.api.models.responses.EmailVerificationResponse;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>EmailVerificationRequest</h1>
 *
 * <h2>Verify Email Send</h2>
 * <p>Verify an email address before new account signup.
 * The system will send an email to the address containing a security code to verify the address.</p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/3/2017
 */
public class EmailVerificationRequest extends RequestBase {

    /**
     * Email address to be verified
     */
    @SerializedName("verify_email")
    private String email;

    /**
     * Purpose of the email verification call
     */
    @SerializedName("type")
    private String type;

    public EmailVerificationRequest() {
        this.responseType = EmailVerificationResponse.class;
    }

    public EmailVerificationRequest(String email, EmailVerificationReasons reason) {
        this();
        this.setEmail(email);
        this.setType(reason);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(EmailVerificationReasons type) {
        this.type = type.toString().toLowerCase();
    }
}