package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/3/2017
 */
public class SubMarket {

    @SerializedName("name")
    private String name;

    @SerializedName("symbols")
    private List<Underlying> symbols;

    public String getName() {
        return name;
    }

    public List<Underlying> getUnderlyings() {
        return symbols;
    }
}
