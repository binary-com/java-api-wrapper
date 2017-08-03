package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/3/2017
 */
public class Candle {

    /**
     * It is an epoch value
     */
    @SerializedName("epoch")
    private Integer epoch;

    /**
     * It is the open price value for the given time
     */
    @SerializedName("open")
    private BigDecimal open;

    /**
     * It is the high price value for the given time
     */
    @SerializedName("high")
    private BigDecimal high;

    /**
     * It is the low price value for the given time
     */
    @SerializedName("low")
    private BigDecimal low;

    /**
     * It is the close price value for the given time
     */
    @SerializedName("close")
    private BigDecimal close;

    public Integer getEpoch() {
        return epoch;
    }

    public BigDecimal getOpen() {
        return open;
    }

    public BigDecimal getHigh() {
        return high;
    }

    public BigDecimal getLow() {
        return low;
    }

    public BigDecimal getClose() {
        return close;
    }
}
