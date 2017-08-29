package com.binary.api.models.requests;

import com.binary.api.models.responses.Balance;
import com.binary.api.models.responses.BalanceResponse;
import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

/**
 * <h1>BalanceRequest</h1>
 *
 * <h2>Balance Send</h2>
 * <p>Get user account balance</p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/4/2017
 */
public class BalanceRequest extends RequestBase {

    @SerializedName("balance")
    private final int balance = 1;

    /**
     * Optional field, used to pass data through the websocket, which may be retrieved via the echo_req output field.
     */
    @SerializedName("subscribe")
    @Nullable
    private Integer subscribe;

    public BalanceRequest() {
        this.responseType = BalanceResponse.class;
    }

    public BalanceRequest(boolean subscribe){
        this();
        this.setSubscribe(subscribe);
    }

    public boolean getSubscribe() {
        return subscribe == 1 ? true : false;
    }

    public void setSubscribe(boolean subscribe) {
        this.subscribe = subscribe ? 1 : null;
    }
}
