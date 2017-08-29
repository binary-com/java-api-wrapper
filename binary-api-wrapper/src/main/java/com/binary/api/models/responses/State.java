package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/2/2017
 */
public class State {

    @SerializedName("value")
    private String value;

    @SerializedName("text")
    private String text;

    public String getText() {
        return text;
    }

    public String getValue() {

        return value;
    }
}
