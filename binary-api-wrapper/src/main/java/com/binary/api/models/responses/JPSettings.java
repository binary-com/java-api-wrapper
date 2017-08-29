package com.binary.api.models.responses;

import com.binary.api.models.enums.*;
import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

import java.math.BigDecimal;

/**
 * <h1>JPSettings</h1>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/4/2017
 */
public class JPSettings {

    /**
     * Male (m) or female (f) (note: only set for Japan real-money accounts)
     */
    @SerializedName("gender")
    private String gender;

    /**
     * Occupation (note: only set for Japan real-money accounts)
     */
    @SerializedName("occupation")
    private String occupation;

    /**
     * Annual income (note: only set for Japan real-money accounts)
     */
    @SerializedName("annual_income")
    private String annualIncome;

    /**
     * Financial asset (note: only set for Japan real-money accounts)
     */
    @SerializedName("financial_asset")
    private String financialAsset;

    /**
     * Daily limit on losses in JPY (note: only set for Japan real-money accounts)
     */
    @SerializedName("daily_loss_limit")
    private BigDecimal daily_loss_limit;

    /**
     * Equities trading experience (note: only set for Japan real-money accounts)
     */
    @SerializedName("trading_experience_equities")
    private String tradingExperienceEquities;

    /**
     * Commodities trading experience (note: only set for Japan real-money accounts)
     */
    @SerializedName("trading_experience_commodities")
    private String tradingExperienceCommodities;

    /**
     * Foreign currency deposit trading experience (note: only set for Japan real-money accounts)
     */
    @SerializedName("trading_experience_foreign_currency_deposit")
    private String tradingExperienceForeignCurrencyDeposit;

    /**
     * Margin FX trading experience (note: only set for Japan real-money accounts)
     */
    @SerializedName("trading_experience_margin_fx")
    private String tradingExperienceMarginFX;

    /**
     * Investment trust trading experience (note: only set for Japan real-money accounts)
     */
    @SerializedName("trading_experience_investment_trust")
    private String tradingExperienceInvestmentTrust;

    /**
     * Public and corporation bond trading experience (note: only set for Japan real-money accounts)
     */
    @SerializedName("trading_experience_public_bond")
    private String tradingExperiencePublicBond;

    /**
     * OTC Derivative (Option) trading experience (note: only set for Japan real-money accounts)
     */
    @SerializedName("trading_experience_option_trading")
    private String tradingExperienceOptionTrading;

    /**
     * Trading purpose (note: only set for Japan real-money accounts)
     */
    @SerializedName("trading_purpose")
    private String tradingPurpose;

    /**
     * Classification of assets requiring hedge
     * (note: only set for Japan real-money accounts, if 'Hedging' is selected for 'Trading purpose')
     */
    @SerializedName("hedge_asset")
    @Nullable
    private String hedgeAsset;

    /**
     * Hedge asset amount in JPY
     * (note: only set for Japan real-money accounts, if 'Hedging' is selected for 'Trading purpose')
     */
    @SerializedName("hedge_asset_amount")
    @Nullable
    private BigDecimal hedgeAssetAmount;

    public String getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender.toString();
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(JPOccupations occupation) {
        this.occupation = occupation.toString();
    }

    public String getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(JPAnnualIncomes annualIncome) {
        this.annualIncome = annualIncome.toString();
    }

    public String getFinancialAsset() {
        return financialAsset;
    }

    public void setFinancialAsset(JPAnnualIncomes financialAsset) {
        this.financialAsset = financialAsset.toString();
    }

    public BigDecimal getDaily_loss_limit() {
        return daily_loss_limit;
    }

    public void setDaily_loss_limit(BigDecimal daily_loss_limit) {
        this.daily_loss_limit = daily_loss_limit;
    }

    public String getTradingExperienceEquities() {
        return tradingExperienceEquities;
    }

    public void setTradingExperienceEquities(JPTradingExperiences tradingExperienceEquities) {
        this.tradingExperienceEquities = tradingExperienceEquities.toString();
    }

    public String getTradingExperienceCommodities() {
        return tradingExperienceCommodities;
    }

    public void setTradingExperienceCommodities(JPTradingExperiences tradingExperienceCommodities) {
        this.tradingExperienceCommodities = tradingExperienceCommodities.toString();
    }

    public String getTradingExperienceForeignCurrencyDeposit() {
        return tradingExperienceForeignCurrencyDeposit;
    }

    public void setTradingExperienceForeignCurrencyDeposit(JPTradingExperiences tradingExperienceForeignCurrencyDeposit) {
        this.tradingExperienceForeignCurrencyDeposit = tradingExperienceForeignCurrencyDeposit.toString();
    }

    public String getTradingExperienceMarginFX() {
        return tradingExperienceMarginFX;
    }

    public void setTradingExperienceMarginFX(JPTradingExperiences tradingExperienceMarginFX) {
        this.tradingExperienceMarginFX = tradingExperienceMarginFX.toString();
    }

    public String getTradingExperienceInvestmentTrust() {
        return tradingExperienceInvestmentTrust;
    }

    public void setTradingExperienceInvestmentTrust(JPTradingExperiences tradingExperienceInvestmentTrust) {
        this.tradingExperienceInvestmentTrust = tradingExperienceInvestmentTrust.toString();
    }

    public String getTradingExperiencePublicBond() {
        return tradingExperiencePublicBond;
    }

    public void setTradingExperiencePublicBond(JPTradingExperiences tradingExperiencePublicBond) {
        this.tradingExperiencePublicBond = tradingExperiencePublicBond.toString();
    }

    public String getTradingExperienceOptionTrading() {
        return tradingExperienceOptionTrading;
    }

    public void setTradingExperienceOptionTrading(JPTradingExperiences tradingExperienceOptionTrading) {
        this.tradingExperienceOptionTrading = tradingExperienceOptionTrading.toString();
    }

    public String getTradingPurpose() {
        return tradingPurpose;
    }

    public void setTradingPurpose(JPTradingPurposes tradingPurpose) {
        this.tradingPurpose = tradingPurpose.toString();
    }

    public String getHedgeAsset() {
        return hedgeAsset;
    }

    public void setHedgeAsset(String hedgeAsset) {
        this.hedgeAsset = hedgeAsset;
    }

    public BigDecimal getHedgeAssetAmount() {
        return hedgeAssetAmount;
    }

    public void setHedgeAssetAmount(BigDecimal hedgeAssetAmount) {
        this.hedgeAssetAmount = hedgeAssetAmount;
    }
}
