package com.binary.api.models.responses;

import com.binary.api.models.requests.EmailVerificationRequest;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>EmailVerificationResponse</h1>
 *
 * <h2>Verify Email Receive</h2>
 * <p>Verify Email Receive</p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/3/2017
 */
public class EmailVerificationResponse extends ResponseBase<EmailVerificationRequest> {

    /**
     * 1 for success (secure code has been sent to the email address)
     */
    @SerializedName("verify_email")
    private int VerifyEmail;

    public int getVerifyEmail() {
        return VerifyEmail;
    }
}
