package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/3/2017
 */
public class History {

    @SerializedName("times")
    private List<Integer> times;

    @SerializedName("prices")
    private List<BigDecimal> prices;

    public List<Integer> getTimes() {
        return times;
    }

    public List<BigDecimal> getPrices() {
        return prices;
    }
}
