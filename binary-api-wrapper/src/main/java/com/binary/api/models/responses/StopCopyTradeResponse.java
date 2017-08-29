package com.binary.api.models.responses;

import com.binary.api.models.requests.StopCopyTradeRequest;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>StopCopyTradeResponse</h1>
 *
 * <h2>Copy Stop Receive</h2>
 * <p>
 *     A message with results is received
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/9/2017
 */
public class StopCopyTradeResponse extends ResponseBase<StopCopyTradeRequest> {

    /**
     * Copy stopping confirmation. Returns 1 is success.
     */
    @SerializedName("copy_stop")
    private Integer result;

    public Integer getResult() {
        return result;
    }
}
