package com.binary.api.models.requests;

import com.binary.api.models.responses.StopCopyTradeResponse;
import com.binary.api.utils.Validator;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>StopCopyTradeRequest</h1>
 *
 * <h2>Copy Stop Send</h2>
 * <p>
 *     Stop copy trader bets
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/9/2017
 */
public class StopCopyTradeRequest extends RequestBase {

    /**
     * API tokens identifying the accounts which needs not to be copied
     */
    @SerializedName("copy_stop")
    private String traderToken;

    private StopCopyTradeRequest(){
        this.responseType = StopCopyTradeResponse.class;
    }

    public StopCopyTradeRequest(String traderToken) {
        this();
        this.setTraderToken(traderToken);
    }

    public String getTraderToken() {
        return traderToken;
    }

    public void setTraderToken(String traderToken) {
        Validator.checkPattern("^[\\w\\s-]{15,32}$", traderToken,
                "Trader Token does not match the regex pattern /^[\\w\\s-]{15,32}$/");
        this.traderToken = traderToken;
    }
}
