package com.binary.api.models.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by morteza on 7/19/2017.
 */

public class Tick {
    @SerializedName("ask")
    @Expose
    String ask;

    @SerializedName("bid")
    @Expose
    String bid;

    @SerializedName("epoch")
    @Expose
    String epoch;

    @SerializedName("id")
    @Expose
    String id;

    @SerializedName("quote")
    @Expose
    String quote;

    @SerializedName("symbol")
    @Expose
    String symbol;

    public String getAsk(){
        return  this.ask;
    }

    public String getBid(){
        return this.bid;
    }

    public String getEpoch (){
        return this.epoch;
    }

    public String getId(){
        return this.id;
    }

    public String getQuote(){
        return this.quote;
    }

    public void setAsk(String ask) {
        this.ask = ask;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public void setEpoch(String epoch) {
        this.epoch = epoch;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
