package com.binary.api.models.requests;

import com.binary.api.models.responses.SetSelfExclusionSettingsResponse;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/12/2017
 */
public class SetSelfExclusionSettingsRequest extends RequestBase {

    @SerializedName("set_self_exclusion")
    private final int setSelfExclusion = 1;

    /**
     * Maximum account cash balance
     */
    @SerializedName("max_balance")
    private BigDecimal maxBalance;

    /**
     * Daily turnover limit
     */
    @SerializedName("max_turnover")
    private BigDecimal maxTurnover;

    /**
     * Daily limit on losses
     */
    @SerializedName("max_losses")
    private BigDecimal maxLosses;

    /**
     * 7-day turnover limit
     */
    @SerializedName("max_7day_turnover")
    private BigDecimal maxSevenDayTurnover;

    /**
     * 7-day limit on losses
     */
    @SerializedName("max_7day_losses")
    private BigDecimal maxSevenDayLosses;

    /**
     * 30-day turnover limit
     */
    @SerializedName("max_30day_turnover")
    private BigDecimal maxThirtyDayTurnover;

    /**
     * 30-day limit on losses
     */
    @SerializedName("max_30day_losses")
    private BigDecimal maxThirtyDayLosses;

    /**
     * Maximum number of open positions
     */
    @SerializedName("max_open_bets")
    private Integer maxOpenBets;

    /**
     * Session duration limit, in minutes
     */
    @SerializedName("session_duration_limit")
    private Integer sessionDurationLimit;

    /**
     * Exclude me from the website until
     */
    @SerializedName("exclude_until")
    private String excludeUntil;

    /**
     * Exclude me from the website until (epoch time)
     */
    @SerializedName("timeout_until")
    private Long timeoutUntil;

    public SetSelfExclusionSettingsRequest(){
        this.responseType = SetSelfExclusionSettingsResponse.class;
    }

    public BigDecimal getMaxBalance() {
        return maxBalance;
    }

    public void setMaxBalance(BigDecimal maxBalance) {
        this.maxBalance = maxBalance;
    }

    public BigDecimal getMaxTurnover() {
        return maxTurnover;
    }

    public void setMaxTurnover(BigDecimal maxTurnover) {
        this.maxTurnover = maxTurnover;
    }

    public BigDecimal getMaxLosses() {
        return maxLosses;
    }

    public void setMaxLosses(BigDecimal maxLosses) {
        this.maxLosses = maxLosses;
    }

    public BigDecimal getMaxSevenDayTurnover() {
        return maxSevenDayTurnover;
    }

    public void setMaxSevenDayTurnover(BigDecimal maxSevenDayTurnover) {
        this.maxSevenDayTurnover = maxSevenDayTurnover;
    }

    public BigDecimal getMaxSevenDayLosses() {
        return maxSevenDayLosses;
    }

    public void setMaxSevenDayLosses(BigDecimal maxSevenDayLosses) {
        this.maxSevenDayLosses = maxSevenDayLosses;
    }

    public BigDecimal getMaxThirtyDayTurnover() {
        return maxThirtyDayTurnover;
    }

    public void setMaxThirtyDayTurnover(BigDecimal maxThirtyDayTurnover) {
        this.maxThirtyDayTurnover = maxThirtyDayTurnover;
    }

    public BigDecimal getMaxThirtyDayLosses() {
        return maxThirtyDayLosses;
    }

    public void setMaxThirtyDayLosses(BigDecimal maxThirtyDayLosses) {
        this.maxThirtyDayLosses = maxThirtyDayLosses;
    }

    public Integer getMaxOpenBets() {
        return maxOpenBets;
    }

    public void setMaxOpenBets(Integer maxOpenBets) {
        this.maxOpenBets = maxOpenBets;
    }

    public Integer getSessionDurationLimit() {
        return sessionDurationLimit;
    }

    public void setSessionDurationLimit(Integer sessionDurationLimit) {
        this.sessionDurationLimit = sessionDurationLimit;
    }

    public String getExcludeUntil() {
        return excludeUntil;
    }

    public void setExcludeUntil(String excludeUntil) {
        this.excludeUntil = excludeUntil;
    }

    public Long getTimeoutUntil() {
        return timeoutUntil;
    }

    public void setTimeoutUntil(Long timeoutUntil) {
        this.timeoutUntil = timeoutUntil;
    }
}
