package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/3/2017
 */
public class ApiCallLimit {

    @SerializedName("applies_to")
    private String appliesTo;

    @SerializedName("max")
    @Nullable
    private Integer max;

    @SerializedName("hourly")
    @Nullable
    private Integer hourly;

    @SerializedName("minutely")
    private String minutely;

    public String getAppliesTo() {
        return appliesTo;
    }

    public Integer getMax() {
        return max;
    }

    public Integer getHourly() {
        return hourly;
    }

    public String getMinutely() {
        return minutely;
    }
}
