package com.binary.api.models.requests;

import com.binary.api.models.responses.TickResponse;
import com.google.gson.annotations.SerializedName;

/**
 * Created by morteza on 7/19/2017.
 */

public class TickRequest extends RequestBase{

    public TickRequest(){
        this.responseType = TickResponse.class;
    }

    public TickRequest(String symbol) {
        this();
        this.symbol = symbol;
    }

    public TickRequest(String symbol, Boolean subscribe){
        this(symbol);
        this.subscribe = subscribe? 1: null;
    }

    @SerializedName("ticks")
    private String symbol;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
