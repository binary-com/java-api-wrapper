package com.binary.api.models.requests;

import com.binary.api.models.responses.WebsiteStatusResponse;
import com.binary.api.utils.Validator;
import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;
import okhttp3.WebSocket;

/**
 * <h1>WebsiteStatusRequest</h1>
 *
 * <h2>Server Status request</h2>
 * <p>Request server status</p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/3/2017
 */
public class WebsiteStatusRequest extends RequestBase {

    @SerializedName("website_status")
    private final int websiteStatus = 1;

    @SerializedName("subscribe")
    @Nullable
    private Integer subscribe;

    public WebsiteStatusRequest() {
        this.responseType = WebsiteStatusResponse.class;
    }

    public WebsiteStatusRequest(Integer subscribe){
        this();
    }

    public Integer getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(Integer subscribe) {
        Validator.checkPattern("^(1|0)$", subscribe.toString(),
                "Subscribe does not match the regex pattern /^(1|0)$/");
        this.subscribe = subscribe;
    }
}
