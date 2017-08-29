package com.binary.api.models.requests;

import com.binary.api.models.responses.GetSelfExclusionResponse;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>GetSelfExclusionRequest</h1>
 *
 * <h2>Get User Self-Exclusion Send</h2>
 * <p>
 *     Binary.com allows users to exclude themselves from the website for certain periods of time,
 *     or to set limits on their trading activities.
 *     This facility is a regulatory requirement for certain Landing Companies.
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/4/2017
 */
public class GetSelfExclusionRequest extends RequestBase {

    @SerializedName("get_self_exclusion")
    private final int selfExclusion = 1;

    public GetSelfExclusionRequest() {
        this.responseType = GetSelfExclusionResponse.class;
    }
}
