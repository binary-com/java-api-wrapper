package com.binary.api.models.requests;

import com.binary.api.models.enums.*;
import com.binary.api.models.responses.SetFinancialAssessmentResponse;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>SetFinancialAssessmentRequest</h1>
 *
 * <h2>Save Financial assessment details send</h2>
 * <p>
 *     This call sets the financial assessement details based on the client's answers to analyse
 *     whether he possess the experience and knowledge to understand the risks involved with binary options trading.
 *     Not applicable for Japan landing company.
 * </p>
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/4/2017
 */
public class SetFinancialAssessmentRequest extends RequestBase {

    @SerializedName("set_financial_assessment")
    private final int setFinancialAssessment = 1;

    /**
     * Forex trading experience
     */
    @SerializedName("forex_trading_experience")
    private String forexTradingExperience;

    /**
     * Forex trading frequency
     */
    @SerializedName("forex_trading_frequency")
    private String forexTradingFrequency;

    /**
     * Indices trading experience
     */
    @SerializedName("indices_trading_experience")
    private String indicesTradingExperience;

    /**
     * Indices trading frequency
     */
    @SerializedName("indices_trading_frequency")
    private String indicesTradingFrequency;

    /**
     * Commodities trading experience
     */
    @SerializedName("commodities_trading_experience")
    private String commoditiesTradingExperience;

    /**
     * Commodities trading frequency
     */
    @SerializedName("commodities_trading_frequency")
    private String commoditiesTradingFrequency;

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
     * Binary options or other financial derivatives trading experience
     */
    @SerializedName("other_derivatives_trading_experience")
    private String otherDerivativesTradingExperience;

    /**
     * Binary options or other derivatives trading frequency
     */
    @SerializedName("other_derivatives_trading_frequency")
    private String otherDerivativesTradingFrequency;

    /**
     * Other financial instruments trading experience
     */
    @SerializedName("other_instruments_trading_experience")
    private String otherInstrumentsTradingExperience;

    /**
     * Other financial instruments trading frequency
     */
    @SerializedName("other_instruments_trading_frequency")
    private String otherInstrumentsTradingFrequency;

    /**
     * Industry of Employment
     */
    @SerializedName("employment_industry")
    private String employmentIndustry;

    /**
     * Level of education
     */
    @SerializedName("education_level")
    private String educationLevel;

    /**
     * Income source
     */
    @SerializedName("income_source")
    private String incomeSource;

    /**
     * Net annual income
     */
    @SerializedName("net_income")
    private String netIncome;

    /**
     * Estimated Net worth
     */
    @SerializedName("estimated_worth")
    private String estimatedWorth;

    /**
     * The anticipated account turnover
     */
    @SerializedName("account_turnover")
    private String accountTurnover;

    /**
     * Occupation
     */
    @SerializedName("occupation")
    private String occupation;

    /**
     * Employment status
     */
    @SerializedName("employment_status")
    private String employmentStatus;

    /**
     * Source of wealth
     */
    @SerializedName("source_of_wealth")
    private String sourceOfWealth;

    public SetFinancialAssessmentRequest() {
        this.responseType = SetFinancialAssessmentResponse.class;
    }

    public String getForexTradingExperience() {
        return forexTradingExperience;
    }

    public void setForexTradingExperience(ExperienceDuration forexTradingExperience) {
        this.forexTradingExperience = forexTradingExperience.toString();
    }

    public String getForexTradingFrequency() {
        return forexTradingFrequency;
    }

    public void setForexTradingFrequency(TradeFrequency forexTradingFrequency) {
        this.forexTradingFrequency = forexTradingFrequency.toString();
    }

    public String getIndicesTradingExperience() {
        return indicesTradingExperience;
    }

    public void setIndicesTradingExperience(ExperienceDuration indicesTradingExperience) {
        this.indicesTradingExperience = indicesTradingExperience.toString();
    }

    public String getIndicesTradingFrequency() {
        return indicesTradingFrequency;
    }

    public void setIndicesTradingFrequency(TradeFrequency indicesTradingFrequency) {
        this.indicesTradingFrequency = indicesTradingFrequency.toString();
    }

    public String getCommoditiesTradingExperience() {
        return commoditiesTradingExperience;
    }

    public void setCommoditiesTradingExperience(ExperienceDuration commoditiesTradingExperience) {
        this.commoditiesTradingExperience = commoditiesTradingExperience.toString();
    }

    public String getCommoditiesTradingFrequency() {
        return commoditiesTradingFrequency;
    }

    public void setCommoditiesTradingFrequency(TradeFrequency commoditiesTradingFrequency) {
        this.commoditiesTradingFrequency = commoditiesTradingFrequency.toString();
    }

    public String getStocksTradingExperience() {
        return stocksTradingExperience;
    }

    public void setStocksTradingExperience(ExperienceDuration stocksTradingExperience) {
        this.stocksTradingExperience = stocksTradingExperience.toString();
    }

    public String getStocksTradingFrequency() {
        return stocksTradingFrequency;
    }

    public void setStocksTradingFrequency(TradeFrequency stocksTradingFrequency) {
        this.stocksTradingFrequency = stocksTradingFrequency.toString();
    }

    public String getOtherDerivativesTradingExperience() {
        return otherDerivativesTradingExperience;
    }

    public void setOtherDerivativesTradingExperience(ExperienceDuration otherDerivativesTradingExperience) {
        this.otherDerivativesTradingExperience = otherDerivativesTradingExperience.toString();
    }

    public String getOtherDerivativesTradingFrequency() {
        return otherDerivativesTradingFrequency;
    }

    public void setOtherDerivativesTradingFrequency(TradeFrequency otherDerivativesTradingFrequency) {
        this.otherDerivativesTradingFrequency = otherDerivativesTradingFrequency.toString();
    }

    public String getOtherInstrumentsTradingExperience() {
        return otherInstrumentsTradingExperience;
    }

    public void setOtherInstrumentsTradingExperience(ExperienceDuration otherInstrumentsTradingExperience) {
        this.otherInstrumentsTradingExperience = otherInstrumentsTradingExperience.toString();
    }

    public String getOtherInstrumentsTradingFrequency() {
        return otherInstrumentsTradingFrequency;
    }

    public void setOtherInstrumentsTradingFrequency(TradeFrequency otherInstrumentsTradingFrequency) {
        this.otherInstrumentsTradingFrequency = otherInstrumentsTradingFrequency.toString();
    }

    public String getEmploymentIndustry() {
        return employmentIndustry;
    }

    public void setEmploymentIndustry(EmploymentIndustries employmentIndustry) {
        this.employmentIndustry = employmentIndustry.toString();
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(EducationLevels educationLevel) {
        this.educationLevel = educationLevel.toString();
    }

    public String getIncomeSource() {
        return incomeSource;
    }

    public void setIncomeSource(IncomeSources incomeSource) {
        this.incomeSource = incomeSource.toString();
    }

    public String getNetIncome() {
        return netIncome;
    }

    public void setNetIncome(TurnoverRanges netIncome) {
        this.netIncome = netIncome.toString();
    }

    public String getEstimatedWorth() {
        return estimatedWorth;
    }

    public void setEstimatedWorth(EstimatedWorth estimatedWorth) {
        this.estimatedWorth = estimatedWorth.toString();
    }

    public String getAccountTurnover() {
        return accountTurnover;
    }

    public void setAccountTurnover(TurnoverRanges accountTurnover) {
        this.accountTurnover = accountTurnover.toString();
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(Occupations occupation) {
        this.occupation = occupation.toString();
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(EmploymentStatuses employmentStatus) {
        this.employmentStatus = employmentStatus.toString();
    }

    public String getSourceOfWealth() {
        return sourceOfWealth;
    }

    public void setSourceOfWealth(WealthSources sourceOfWealth) {
        this.sourceOfWealth = sourceOfWealth.toString();
    }
}
