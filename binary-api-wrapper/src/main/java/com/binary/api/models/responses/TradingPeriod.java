package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/1/2017
 */
public class TradingPeriod {
    @SerializedName("date_start")
    private DateStructure dateStart;

    @SerializedName("date_expiry")
    private DateStructure dateExpiry;

    @SerializedName("duration")
    private String duration;

    public DateStructure getDateStart() {
        return dateStart;
    }

    public void setDateStart(DateStructure dateStart) {
        this.dateStart = dateStart;
    }

    public DateStructure getDateExpiry() {
        return dateExpiry;
    }

    public void setDateExpiry(DateStructure dateExpiry) {
        this.dateExpiry = dateExpiry;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
