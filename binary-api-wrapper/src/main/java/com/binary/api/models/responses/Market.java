package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/3/2017
 */
public class Market {

    @SerializedName("name")
    private String name;

    @SerializedName("submarkets")
    private List<SubMarket> subMarkets;

    public String getName() {
        return name;
    }

    public List<SubMarket> getSubMarkets() {
        return subMarkets;
    }
}
