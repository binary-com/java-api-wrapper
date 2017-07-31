package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

import java.math.BigDecimal;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 7/31/2017
 */
public class ActiveSymbol {
    /**
     * intraday_interval_minutes
     */
    @SerializedName("symbol")
    private String symbol;

    /**
     * Intraday interval minutes
     */
    @SerializedName("intraday_interval_minutes")
    private int intradayIntervalMinutes;

    /**
     * Symbol type (forex, commodities, etc)
     */
    @SerializedName("symbol_type")
    private String symbolType;

    /**
     * 1 or 0 - whether the market is currently open or closed
     */
    @SerializedName("exchange_is_open")
    @Nullable
    private Integer isExhcangeOpen;

    /**
     * Exchange name (for underlyings listed on a Stock Exchange)
     */
    @SerializedName("exchange_name")
    private String exchangeName;

    /**
     * Exchange name (for underlyings listed on a Stock Exchange)
     */
    @SerializedName("delay_amount")
    private int delayAmount;

    /**
     * Display name
     */
    @SerializedName("display_name")
    private String displayName;

    /**
     * Latest spot price of the underlying
     */
    @SerializedName("spot")
    @Nullable
    private Integer spot;

    /**
     * Latest spot epoch time
     */
    @SerializedName("spot_time")
    private String spotTime;

    /**
     * 1 indicates that trading is currently suspended
     */
    @SerializedName("is_trading_suspended")
    @Nullable
    private Integer isTradingSuspended;

    /**
     * For stocks and stock indices, the underlying currency for that instrument
     */
    @SerializedName("quoted_currency_symbole")
    private String quotedCurrencySymbol;

    /**
     * Number of seconds elapsed since the last spot price
     */
    @SerializedName("spot_age")
    private String spotAge;

    /**
     * Market category (forex, indices etc)
     */
    @SerializedName("market")
    private String market;

    /**
     * Translated market name
     */
    @SerializedName("market_display_name")
    private String marketDisplayName;

    /**
     * Submarket name
     */
    @SerializedName("submarket")
    private String subMarket;

    /**
     * Translated submarket name
     */
    @SerializedName("submarket_display_name")
    private String subMarketDisplayName;

    /**
     * Pip size (i.e. minimum fluctuation amount)
     */
    @SerializedName("pip")
    private BigDecimal pip;

    /**
     * {@link ActiveSymbol#symbol}
     */
    public String getSymbol() {

        return symbol;
    }

    /**
     * {@link ActiveSymbol#symbol}
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     * {@link ActiveSymbol#intradayIntervalMinutes}
     */
    public int getIntradayIntervalMinutes() {
        return intradayIntervalMinutes;
    }

    /**
     * {@link ActiveSymbol#intradayIntervalMinutes}
     */
    public void setIntradayIntervalMinutes(int intradayIntervalMinutes) {
        this.intradayIntervalMinutes = intradayIntervalMinutes;
    }

    /**
     * {@link ActiveSymbol#symbolType}
     */
    public String getSymbolType() {
        return symbolType;
    }

    /**
     * {@link ActiveSymbol#symbolType}
     */
    public void setSymbolType(String symbolType) {
        this.symbolType = symbolType;
    }

    /**
     * {@link ActiveSymbol#isExhcangeOpen}
     */
    public Integer getIsExhcangeOpen() {
        return isExhcangeOpen;
    }

    /**
     * {@link ActiveSymbol#isExhcangeOpen}
     */
    public void setIsExhcangeOpen(Integer isExhcangeOpen) {
        this.isExhcangeOpen = isExhcangeOpen;
    }

    /**
     * {@link ActiveSymbol#exchangeName}
     */
    public String getExchangeName() {
        return exchangeName;
    }

    /**
     * {@link ActiveSymbol#exchangeName}
     */
    public void setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
    }

    /**
     * {@link ActiveSymbol#delayAmount}
     */
    public int getDelayAmount() {
        return delayAmount;
    }

    /**
     * {@link ActiveSymbol#delayAmount}
     */
    public void setDelayAmount(int delayAmount) {
        this.delayAmount = delayAmount;
    }

    /**
     * {@link ActiveSymbol#displayName}
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * {@link ActiveSymbol#displayName}
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * {@link ActiveSymbol#spot}
     */
    public Integer getSpot() {
        return spot;
    }

    /**
     * {@link ActiveSymbol#spot}
     */
    public void setSpot(Integer spot) {
        this.spot = spot;
    }

    /**
     * {@link ActiveSymbol#spotTime}
     */
    public String getSpotTime() {
        return spotTime;
    }

    /**
     * {@link ActiveSymbol#spotTime}
     */
    public void setSpotTime(String spotTime) {
        this.spotTime = spotTime;
    }

    /**
     * {@link ActiveSymbol#isTradingSuspended}
     */
    public Integer getIsTradingSuspended() {
        return isTradingSuspended;
    }

    /**
     * {@link ActiveSymbol#isTradingSuspended}
     */
    public void setIsTradingSuspended(Integer isTradingSuspended) {
        this.isTradingSuspended = isTradingSuspended;
    }

    /**
     * {@link ActiveSymbol#quotedCurrencySymbol}
     */
    public String getQuotedCurrencySymbol() {
        return quotedCurrencySymbol;
    }

    /**
     * {@link ActiveSymbol#quotedCurrencySymbol}
     */
    public void setQuotedCurrencySymbol(String quotedCurrencySymbol) {
        this.quotedCurrencySymbol = quotedCurrencySymbol;
    }

    /**
     * {@link ActiveSymbol#spotAge}
     */
    public String getSpotAge() {
        return spotAge;
    }

    /**
     * {@link ActiveSymbol#spotAge}
     */
    public void setSpotAge(String spotAge) {
        this.spotAge = spotAge;
    }

    /**
     * {@link ActiveSymbol#market}
     */
    public String getMarket() {
        return market;
    }

    /**
     * {@link ActiveSymbol#market}
     */
    public void setMarket(String market) {
        this.market = market;
    }

    /**
     * {@link ActiveSymbol#marketDisplayName}
     */
    public String getMarketDisplayName() {
        return marketDisplayName;
    }

    /**
     * {@link ActiveSymbol#marketDisplayName}
     */
    public void setMarketDisplayName(String marketDisplayName) {
        this.marketDisplayName = marketDisplayName;
    }

    /**
     * {@link ActiveSymbol#subMarket}
     */
    public String getSubMarket() {
        return subMarket;
    }

    /**
     * {@link ActiveSymbol#subMarket}
     */
    public void setSubMarket(String subMarket) {
        this.subMarket = subMarket;
    }

    /**
     * {@link ActiveSymbol#subMarketDisplayName}
     */
    public String getSubMarketDisplayName() {
        return subMarketDisplayName;
    }

    /**
     * {@link ActiveSymbol#subMarketDisplayName}
     */
    public void setSubMarketDisplayName(String subMarketDisplayName) {
        this.subMarketDisplayName = subMarketDisplayName;
    }

    /**
     * {@link ActiveSymbol#pip}
     */
    public BigDecimal getPip() {
        return pip;
    }

    /**
     * {@link ActiveSymbol#pip}
     */
    public void setPip(BigDecimal pip) {
        this.pip = pip;
    }
}
