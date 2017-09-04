package com.binary.api.models.responses;

import com.binary.api.models.requests.RevokeOauthApplicationRequest;
import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

/**
 * <h1>RevokeOauthApplicationResponse</h1>
 *
 * <h2>Revoke an OAuth App</h2>
 * <p>
 *     A message with revoking a used application
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/4/2017
 */
public class RevokeOauthApplicationResponse extends ResponseBase<RevokeOauthApplicationRequest> {

    @SerializedName("revoke_oauth_app")
    @Nullable
    private Integer result;

    public Integer getResult() {
        return result;
    }
}
