package com.binary.api.models.responses;

import com.binary.api.utils.Validator;
import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

import java.math.BigDecimal;

/**
 * <h1>SelfExclusion</h1>
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/4/2017
 */
public class SelfExclusion {

    /**
     * Maximum account cash balance
     */
    @SerializedName("max_balance")
    @Nullable
    private BigDecimal maxBalance;

    /**
     * Daily turnover limit
     */
    @SerializedName("max_turnover")
    @Nullable
    private BigDecimal maxTurnover;

    /**
     * Daily limit on losses
     */
    @SerializedName("max_losses")
    @Nullable
    private BigDecimal maxLosses;

    /**
     * 7-day turnover limit
     */
    @SerializedName("max_7day_turnover")
    @Nullable
    private BigDecimal maxSevenDayTurnover;

    /**
     * 7-day limit on losses
     */
    @SerializedName("max_7day_losses")
    @Nullable
    private BigDecimal maxSevenDayLosses;

    /**
     * 30-day turnover limit
     */
    @SerializedName("max_30day_turnover")
    @Nullable
    private BigDecimal maxThirtyDayTurnover;

    /**
     * 30-day limit on losses
     */
    @SerializedName("max_30day_losses")
    @Nullable
    private BigDecimal maxThirtydayLosses;

    /**
     * Maximum number of open positions
     */
    @SerializedName("max_open_bets")
    @Nullable
    private Integer maxOpenBets;

    /**
     * Session duration limit, in minutes
     */
    @SerializedName("session_duration_limit")
    @Nullable
    private Integer sessionDurationLimit;

    /**
     * Exclude me from the website until (date YYYY-MM-DD)
     */
    @SerializedName("exclude_until")
    @Nullable
    private String excludeUntil;

    /**
     * Exclude me from the website until (epoch time)
     */
    @SerializedName("timeout_until")
    @Nullable
    private Integer timeoutUntil;

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

    public BigDecimal getMaxThirtydayLosses() {
        return maxThirtydayLosses;
    }

    public void setMaxThirtydayLosses(BigDecimal maxThirtydayLosses) {
        this.maxThirtydayLosses = maxThirtydayLosses;
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
        Validator.checkPattern("^\\d{4}-\\d{2}-\\d{2}$", excludeUntil,
                "ExcludeUntil does not match the regex pattern /^\\d{4}-\\d{2}-\\d{2}$/");
        this.excludeUntil = excludeUntil;
    }

    public Integer getTimeoutUntil() {
        return timeoutUntil;
    }

    public void setTimeoutUntil(Integer timeoutUntil) {
        this.timeoutUntil = timeoutUntil;
    }
}
