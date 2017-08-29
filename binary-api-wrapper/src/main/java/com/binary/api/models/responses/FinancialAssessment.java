package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/29/2017
 */
public class FinancialAssessment {

    /**
     * Total score based on client's answer for financial assessment
     */
    @SerializedName("score")
    @Nullable
    private Integer score;

    /**
     * The anticipated account turnover
     */
    @SerializedName("account_turnover")
    private String accountTurnover;

    /**
     * Forex trading frequency
     */
    @SerializedName("forex_trading_frequency")
    private String forexTradingFrequency;

    /**
     * Forex trading experience
     */
    @SerializedName("forex_trading_experience")
    private String forexTradingExperience;

    /**
     * Indices trading frequency
     */
    @SerializedName("indices_trading_frequency")
    private String indicesTradingFrequency;

    /**
     * Indices trading experience
     */
    @SerializedName("indices_trading_experience")
    private String indicesTradingExcperience;

    /**
     * Commodities trading frequency
     */
    @SerializedName("commodities_trading_frequency")
    private String commoditiesTradingFrequency;

    /**
     * Commodities trading experience
     */
    @SerializedName("commodities_trading_experience")
    private String commoditiesTradingExperience;

    /**
     * Stocks trading experience
     */
    @SerializedName("stocks_trading_experience")
    private String stocksTradingExperience;

    /**
     * Stocks trading frequency
     */
    @SerializedName("stocks_trading_frequency")
    private String stocksTradingFrequency;

    /**
     * Binary options or other financial derivatives trading frequency
     */
    @SerializedName("other_derivatives_trading_frequency")
    private String otherDerivativesTradingFrequency;

    /**
     * Binary options or other financial derivatives trading experience
     */
    @SerializedName("other_derivatives_trading_experience")
    private String otherDerivativesTradingExperience;

    /**
     * Other financial instruments trading frequency
     */
    @SerializedName("other_instruments_trading_frequency")
    private String otherInstrumentsTradingFrequency;

    /**
     * Other financial instruments trading experience
     */
    @SerializedName("other_instruments_trading_experience")
    private String otherInstrumentsTradingExperience;

    /**
     * Industry of Employment
     */
    @SerializedName("employment_industry")
    private String employmentIndustry;

    /**
     * Level of Education
     */
    @SerializedName("education_level")
    private String educationLevel;

    /**
     * Income Source
     */
    @SerializedName("income_source")
    private String incomeSource;

    /**
     * Net Annual Income
     */
    @SerializedName("net_income")
    private String netIncome;

    /**
     * Estimated Net Worth
     */
    @SerializedName("estimated_worth")
    private String estimatedWorth;

    /**
     * Occupation
     */
    @SerializedName("occupation")
    private String occupation;

    /**
     * Employment Status
     */
    @SerializedName("employment_status")
    private String employmentStatus;

    /**
     * Source of wealth
     */
    @SerializedName("source_of_wealth")
    private String sourceOfWealth;

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getAccountTurnover() {
        return accountTurnover;
    }

    public void setAccountTurnover(String accountTurnover) {
        this.accountTurnover = accountTurnover;
    }

    public String getForexTradingFrequency() {
        return forexTradingFrequency;
    }

    public void setForexTradingFrequency(String forexTradingFrequency) {
        this.forexTradingFrequency = forexTradingFrequency;
    }

    public String getForexTradingExperience() {
        return forexTradingExperience;
    }

    public void setForexTradingExperience(String forexTradingExperience) {
        this.forexTradingExperience = forexTradingExperience;
    }

    public String getIndicesTradingFrequency() {
        return indicesTradingFrequency;
    }

    public void setIndicesTradingFrequency(String indicesTradingFrequency) {
        this.indicesTradingFrequency = indicesTradingFrequency;
    }

    public String getIndicesTradingExcperience() {
        return indicesTradingExcperience;
    }

    public void setIndicesTradingExcperience(String indicesTradingExcperience) {
        this.indicesTradingExcperience = indicesTradingExcperience;
    }

    public String getCommoditiesTradingFrequency() {
        return commoditiesTradingFrequency;
    }

    public void setCommoditiesTradingFrequency(String commoditiesTradingFrequency) {
        this.commoditiesTradingFrequency = commoditiesTradingFrequency;
    }

    public String getCommoditiesTradingExperience() {
        return commoditiesTradingExperience;
    }

    public void setCommoditiesTradingExperience(String commoditiesTradingExperience) {
        this.commoditiesTradingExperience = commoditiesTradingExperience;
    }

    public String getStocksTradingExperience() {
        return stocksTradingExperience;
    }

    public void setStocksTradingExperience(String stocksTradingExperience) {
        this.stocksTradingExperience = stocksTradingExperience;
    }

    public String getStocksTradingFrequency() {
        return stocksTradingFrequency;
    }

    public void setStocksTradingFrequency(String stocksTradingFrequency) {
        this.stocksTradingFrequency = stocksTradingFrequency;
    }

    public String getOtherDerivativesTradingFrequency() {
        return otherDerivativesTradingFrequency;
    }

    public void setOtherDerivativesTradingFrequency(String otherDerivativesTradingFrequency) {
        this.otherDerivativesTradingFrequency = otherDerivativesTradingFrequency;
    }

    public String getOtherDerivativesTradingExperience() {
        return otherDerivativesTradingExperience;
    }

    public void setOtherDerivativesTradingExperience(String otherDerivativesTradingExperience) {
        this.otherDerivativesTradingExperience = otherDerivativesTradingExperience;
    }

    public String getOtherInstrumentsTradingFrequency() {
        return otherInstrumentsTradingFrequency;
    }

    public void setOtherInstrumentsTradingFrequency(String otherInstrumentsTradingFrequency) {
        this.otherInstrumentsTradingFrequency = otherInstrumentsTradingFrequency;
    }

    public String getOtherInstrumentsTradingExperience() {
        return otherInstrumentsTradingExperience;
    }

    public void setOtherInstrumentsTradingExperience(String otherInstrumentsTradingExperience) {
        this.otherInstrumentsTradingExperience = otherInstrumentsTradingExperience;
    }

    public String getEmploymentIndustry() {
        return employmentIndustry;
    }

    public void setEmploymentIndustry(String employmentIndustry) {
        this.employmentIndustry = employmentIndustry;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getIncomeSource() {
        return incomeSource;
    }

    public void setIncomeSource(String incomeSource) {
        this.incomeSource = incomeSource;
    }

    public String getNetIncome() {
        return netIncome;
    }

    public void setNetIncome(String netIncome) {
        this.netIncome = netIncome;
    }

    public String getEstimatedWorth() {
        return estimatedWorth;
    }

    public void setEstimatedWorth(String estimatedWorth) {
        this.estimatedWorth = estimatedWorth;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public String getSourceOfWealth() {
        return sourceOfWealth;
    }

    public void setSourceOfWealth(String sourceOfWealth) {
        this.sourceOfWealth = sourceOfWealth;
    }
}
