package com.binary.api.models.responses;

import com.binary.api.models.requests.ApplicationRegistrationRequest;
import com.google.gson.annotations.SerializedName;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/9/2017
 */
public class ApplicationRegistrationResponse extends ResponseBase<ApplicationRegistrationRequest> {

    @SerializedName("app_register")
    private Application registeredApplication;

    public Application getRegisteredApplication() {
        return registeredApplication;
    }
}
