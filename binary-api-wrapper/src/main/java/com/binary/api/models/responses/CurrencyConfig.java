package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/3/2017
 */
public class CurrencyConfig {

    @SerializedName("fractional_digits")
    private int fractionalDigits;

    @SerializedName("type")
    private String type;

    public int getFractionalDigits() {
        return fractionalDigits;
    }

    public String getType() {
        return type;
    }
}
