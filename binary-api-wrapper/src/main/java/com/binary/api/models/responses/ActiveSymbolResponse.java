package com.binary.api.models.responses;

import com.binary.api.models.requests.ActiveSymbolRequest;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>ActiveSymbolResponse</h1>
 *
 * <h2>Get list of active symbols Receive</h2>
 * <p>A message list of active symbols</p>
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 7/31/2017
 */
public class ActiveSymbolResponse extends ResponseBase<ActiveSymbolRequest> {

    /**
     * List of active symbols. Note: if the user is authenticated,
     * then only symbols allowed under his account will be returned.
     */
    @SerializedName("active_symbols")
    private ActiveSymbol[] activeSymbols;

    /**
     * {@link ActiveSymbolResponse#activeSymbols}
     */
    public ActiveSymbol[] getActiveSymbols() {
        return activeSymbols;
    }

    /**
     * {@link ActiveSymbolResponse#activeSymbols}
     */
    public void setActiveSymbols(ActiveSymbol[] activeSymbols) {
        this.activeSymbols = activeSymbols;
    }
}

