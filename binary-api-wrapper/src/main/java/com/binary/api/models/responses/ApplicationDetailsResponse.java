package com.binary.api.models.responses;

import com.binary.api.models.requests.ApplicationDetailsRequest;
import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

/**
 * <h1>ApplicationDetailsResponse</h1>
 *
 * <h2>App Get Receive</h2>
 * <p>A message with requested application</p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/27/2017
 */
public class ApplicationDetailsResponse extends ResponseBase<ApplicationDetailsRequest> {

    @SerializedName("app_get")
    @Nullable
    private Application application;

    public Application getApplication() {
        return application;
    }
}
