package com.binary.api.models.responses;

import com.binary.api.models.requests.StartCopyTradeRequest;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>StartCopyTradeResponse</h1>
 *
 * <h2>Copy Start Receive</h2>
 * <p>
 *     A message with results is received
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/9/2017
 */
public class StartCopyTradeResponse extends ResponseBase<StartCopyTradeRequest> {

    /**
     * Copy start confirmation. Returns 1 is success.
     */
    @SerializedName("copy_start")
    private Integer result;

    public Integer getResult() {
        return result;
    }
}
