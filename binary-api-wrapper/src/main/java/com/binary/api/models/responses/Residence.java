package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/2/2017
 */
public class Residence {

    /**
     * 2-letter country code
     */
    @SerializedName("value")
    private String value;

    /**
     * Country full name
     */
    @SerializedName("text")
    private String text;

    /**
     * IDD code of country
     */
    @SerializedName("phone_idd")
    @Nullable
    private String phoneIDD;

    public String getValue() {
        return value;
    }

    public String getText() {
        return text;
    }

    public String getPhoneIDD() {
        return phoneIDD;
    }
}
