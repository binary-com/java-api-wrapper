package com.binary.api.models.requests;

import com.binary.api.models.responses.ApplicationListResponse;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>ApplicationListRequest</h1>
 *
 * <h2>App List Send</h2>
 * <p>List all my OAuth application</p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/24/2017
 */
public class ApplicationListRequest extends RequestBase {

    @SerializedName("app_list")
    private final int appList = 1;

    public ApplicationListRequest() {
        this.responseType = ApplicationListResponse.class;
    }

    public int getAppList() {
        return appList;
    }
}
