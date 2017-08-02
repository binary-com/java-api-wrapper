package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/1/2017
 */
public class Contract {

    /**
     * Type of market (forex, indices, ...)
     */
    @SerializedName("market")
    private String market;

    /**
     * Type of contract (example: asian up)
     */
    @SerializedName("contract_display")
    private String contractsDisplay;

    /**
     * Maximum contract duration (example: 10)
     */
    @SerializedName("max_contract_duration")
    private String maxContractDuration;

    @SerializedName("max_historical_pricer_duration")
    @Nullable
    private String maxHistoricalPricerDuration;
    /**
     * Category of barrier (example: asian)
     */
    @SerializedName("barrier_category")
    private String barrierCategory;

    /**
     * Maximum payout (example: 10000)
     */
    @SerializedName("payout_limit")
    private BigDecimal payoutLimit;

    /**
     * Type of submarket (example: major_pairs)
     */
    @SerializedName("submarket")
    private String subMarket;

    /**
     * Name of exchange (example: EURONEXT)
     */
    @SerializedName("exchange_name")
    private String exchangeName;

    /**
     * Category of the contract (example: Asians)
     */
    @SerializedName("contract_category_display")
    private String contractCategoryDisplay;

    /**
     * Type of contract (example: ASIANU)
     */
    @SerializedName("contract_type")
    private String contractType;

    /**
     * Minimum contract duration (example: 5)
     */
    @SerializedName("min_contract_duration")
    private String minContractDuration;

    @SerializedName("min_historical_pricer_duration")
    @Nullable
    private String minHistoricalPricerDuration;

    /**
     * Type of sentiment (example: up)
     */
    @SerializedName("sentiment")
    private String sentiment;

    /**
     * Barriers (example: 0)
     */
    @SerializedName("barrier")
    private BigDecimal barrier;

    /**
     * Category of contract (example: asian)
     */
    @SerializedName("contract_category")
    private String contractCategory;

    /**
     * Start Type (example: spot)
     */
    @SerializedName("start_type")
    private String startType;

    /**
     * Expiry Type (example: tick)
     */
    @SerializedName("expiry_type")
    private String expiryType;

    /**
     * Symbol code (example: R_50)
     */
    @SerializedName("underlying_symbol")
    private String underlyingSymbol;

    /**
     * Array of returned forward starting options
     */
    @SerializedName("forward_starting_options")
    @Nullable
    private ForwardStartingOption[] forwardStartingOptions;

    /**
     * Array of available barriers for a predefined trading period (only return if region set to 'japan')
     */
    @SerializedName("available_barriers")
    @Nullable
    private BigDecimal[][] availableBarriers;

    /**
     * Array of barriers already expired (only return if region set to 'japan')
     */
    @SerializedName("expired_barriers")
    @Nullable
    private BigDecimal[][] expiredBarriers;

    /**
     * A hash of predefined trading period (only return if region set to 'japan')
     */
    @SerializedName("trading_period")
    @Nullable
    private TradingPeriod tradingPeriod;

    @SerializedName("last_digit_range")
    @Nullable
    private int[] lastDigitRange;

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getContractsDisplay() {
        return contractsDisplay;
    }

    public void setContractsDisplay(String contractsDisplay) {
        this.contractsDisplay = contractsDisplay;
    }

    public String getMaxContractDuration() {
        return maxContractDuration;
    }

    public void setMaxContractDuration(String maxContractDuration) {
        this.maxContractDuration = maxContractDuration;
    }

    public String getBarrierCategory() {
        return barrierCategory;
    }

    public void setBarrierCategory(String barrierCategory) {
        this.barrierCategory = barrierCategory;
    }

    public BigDecimal getPayoutLimit() {
        return payoutLimit;
    }

    public void setPayoutLimit(BigDecimal payoutLimit) {
        this.payoutLimit = payoutLimit;
    }

    public String getSubMarket() {
        return subMarket;
    }

    public void setSubMarket(String subMarket) {
        this.subMarket = subMarket;
    }

    public String getExchangeName() {
        return exchangeName;
    }

    public void setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
    }

    public String getContractCategoryDisplay() {
        return contractCategoryDisplay;
    }

    public void setContractCategoryDisplay(String contractCategoryDisplay) {
        this.contractCategoryDisplay = contractCategoryDisplay;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String getMinContractDuration() {
        return minContractDuration;
    }

    public void setMinContractDuration(String minContractDuration) {
        this.minContractDuration = minContractDuration;
    }

    public String getSentiment() {
        return sentiment;
    }

    public void setSentiment(String sentiment) {
        this.sentiment = sentiment;
    }

    public BigDecimal getBarrier() {
        return barrier;
    }

    public void setBarrier(BigDecimal barrier) {
        this.barrier = barrier;
    }

    public String getContractCategory() {
        return contractCategory;
    }

    public void setContractCategory(String contractCategory) {
        this.contractCategory = contractCategory;
    }

    public String getStartType() {
        return startType;
    }

    public void setStartType(String startType) {
        this.startType = startType;
    }

    public String getExpiryType() {
        return expiryType;
    }

    public void setExpiryType(String expiryType) {
        this.expiryType = expiryType;
    }

    public String getUnderlyingSymbol() {
        return underlyingSymbol;
    }

    public void setUnderlyingSymbol(String underlyingSymbol) {
        this.underlyingSymbol = underlyingSymbol;
    }

    public ForwardStartingOption[] getForwardStartingOptions() {
        return forwardStartingOptions;
    }

    public void setForwardStartingOptions(ForwardStartingOption[] forwardStartingOptions) {
        this.forwardStartingOptions = forwardStartingOptions;
    }

    public BigDecimal[][] getAvailableBarriers() {
        return availableBarriers;
    }

    public void setAvailableBarriers(BigDecimal[][] availableBarriers) {
        this.availableBarriers = availableBarriers;
    }

    public BigDecimal[][] getExpiredBarriers() {
        return expiredBarriers;
    }

    public void setExpiredBarriers(BigDecimal[][] expiredBarriers) {
        this.expiredBarriers = expiredBarriers;
    }

    public TradingPeriod getTradingPeriod() {
        return tradingPeriod;
    }

    public void setTradingPeriod(TradingPeriod tradingPeriod) {
        this.tradingPeriod = tradingPeriod;
    }

    public int[] getLastDigitRange() {
        return lastDigitRange;
    }

    public void setLastDigitRange(int[] lastDigitRange) {
        this.lastDigitRange = lastDigitRange;
    }
}
