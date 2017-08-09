package com.binary.api.models.requests;

import com.binary.api.models.responses.TopUpVirtualMoneyAccountResponse;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>TopUpVirtualMoneyAccountRequest</h1>
 *
 * <h2>Top Up Virtual Request</h2>
 * <p>
 *     When a virtual-money's account balance becomes low, it can be topped up using this call.
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/9/2017
 */
public class TopUpVirtualMoneyAccountRequest extends RequestBase {

    @SerializedName("topup_virtual")
    private final int topUpVirtual = 1;

    public TopUpVirtualMoneyAccountRequest() {
        this.responseType = TopUpVirtualMoneyAccountResponse.class;
    }
}
