package com.binary.api.models.responses;

import com.binary.api.models.requests.TopUpVirtualMoneyAccountRequest;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.Map;

/**
 * <h1>TopUpVirtualMoneyAccountResponse</h1>
 *
 * <h2>Top Up Virtual Response</h2>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/9/2017
 */
public class TopUpVirtualMoneyAccountResponse extends ResponseBase<TopUpVirtualMoneyAccountRequest> {

    /**
     * Top Up Virtual Response
     */
    @SerializedName("topup_virtual")
    private Map<String, String> result;

    public String getCurrency() {
        return result.size() > 0 ? result.get("currency") : null;
    }

    public BigDecimal getAmount() {
        return result.size() > 0 ? new BigDecimal(result.get("amount")) : null;
    }
}
