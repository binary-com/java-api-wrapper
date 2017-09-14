package com.binary.api.models.responses;

import com.binary.api.models.requests.SetAccountSettingsRequest;
import com.google.gson.annotations.SerializedName;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/14/2017
 */
public class SetAccountSettingsResponse extends ResponseBase<SetAccountSettingsRequest> {

    @SerializedName("set_settings")
    private Integer result;

    public Integer getResult() {
        return result;
    }
}
