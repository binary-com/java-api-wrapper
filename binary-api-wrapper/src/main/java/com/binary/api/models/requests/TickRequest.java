package com.binary.api.models.requests;

import com.binary.api.models.responses.TickResponse;
import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

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

    /**
     * If set to 1, will send updates whenever the price changes
     */
    @SerializedName("subscribe")
    @Nullable
    private Integer subscribe = null;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Integer getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(Integer subscribe) {
        this.subscribe = subscribe;
    }
}
