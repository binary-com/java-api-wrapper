package com.binary.api.models.requests;

import com.binary.api.models.responses.ApplicationDeletionResponse;
import com.binary.api.utils.Validator;
import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

/**
 * <h1>ApplicationDeletionRequest</h1>
 *
 * <h2>App Delete Send</h2>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/20/2017
 */
public class ApplicationDeletionRequest extends RequestBase {

    /**
     * Application app_id
     */
    @SerializedName("app_delete")
    @Nullable
    private Long appId;

    public ApplicationDeletionRequest(Long appId) {
        this.responseType = ApplicationDeletionResponse.class;
        this.setAppId(appId);
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        Validator.checkPattern("^\\d{1,20}$", appId.toString(), "Applicaiton ID does not match the regex pattern /^\\d{1,20}$/");
        this.appId = appId;
    }
}
