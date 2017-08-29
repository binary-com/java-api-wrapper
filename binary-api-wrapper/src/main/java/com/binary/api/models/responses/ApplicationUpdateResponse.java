package com.binary.api.models.responses;

import com.binary.api.models.requests.ApplicationUpdateRequest;
import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/27/2017
 */
public class ApplicationUpdateResponse extends ResponseBase<ApplicationUpdateRequest> {

    @SerializedName("app_update")
    @Nullable
    private Application application;

    public Application getApplication() {
        return application;
    }
}
