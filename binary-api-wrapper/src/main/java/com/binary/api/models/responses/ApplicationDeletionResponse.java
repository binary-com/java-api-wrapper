package com.binary.api.models.responses;

import com.binary.api.models.requests.ApplicationDeletionRequest;
import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/20/2017
 */
public class ApplicationDeletionResponse extends ResponseBase<ApplicationDeletionRequest> {

    @SerializedName("app_delete")
    @Nullable
    private Integer response;

    public boolean getResponse() {
        return response == 1 ? true : false;
    }
}
