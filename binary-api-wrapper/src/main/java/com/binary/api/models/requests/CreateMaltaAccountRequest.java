package com.binary.api.models.requests;

import com.binary.api.models.enums.*;
import com.binary.api.models.responses.CreateMaltaAccountResponse;
import com.binary.api.utils.Validator;
import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

/**
 * <h1>CreateMaltaAccountRequest</h1>
 *
 * <h2>Create maltainvest account Send</h2>
 * <p>
 *     This call opens a new real-money account with the 'maltainvest' Landing Company.
 *     Note: you must be authenticated to Binary (Europe) Ltd or virtual-money account to call this function.
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/31/2017
 */
public class CreateMaltaAccountRequest extends RequestBase {

    @SerializedName("new_account_maltainvest")
    private final int newAccountMaltaInvest = 1;

    /**
     * Accept any value in enum list.
     */
    @SerializedName("salutation")
    private String salutation;

    /**
     * Within 2-30 characters, use only letters, spaces, hyphens, full-stops or apostrophes.
     */
    @SerializedName("first_name")
    private String firstName;

    /**
     * Within 2-30 characters, use only letters, spaces, hyphens, full-stops or apostrophes.
     */
    @SerializedName("last_name")
    private String lastName;

    /**
     * Date of birth format: yyyy-mm-dd.
     */
    @SerializedName("data_of_birth")
    private String dateOfBirth;

    /**
     * 2-letter country code, possible value receive from residence_list call.
     */
    @SerializedName("residence")
    private String residence;

    /**
     * Place of birth, 2-letter country code.
     */
    private String placeOfBirth;

    /**
     * Within 70 characters.
     */
    @SerializedName("address_line_1")
    private String firstAddressLine;

    /**
     * Optional field, within 70 characters.
     */
    @SerializedName("address_line_2")
    @Nullable
    private String secondAddressLine;

    /**
     * Within 35 characters
     */
    @SerializedName("address_city")
    private String city;

    /**
     * Optional field, possible value receive from states_list call.
     */
    @SerializedName("address_state")
    @Nullable
    private String state;

    /**
     * Optional field, within 20 characters and may not contain '+'.
     */
    @SerializedName("address_postcode")
    @Nullable
    private String postcode;

    /**
     * Within 6-35 digits, allowing '+' in front, numbers or space.
     */
    @SerializedName("phone")
    private String phone;

    /**
     * Accept any value in enum list.
     */
    @SerializedName("secret_question")
    private String secretQuestion;

    /**
     * Answer to secret question, within 4-50 characters.
     */
    @SerializedName("secret_answer")
    private String secretAnswer;

    /**
     * Affiliate token, within 32 characters.
     */
    @SerializedName("affiliate_token")
    @Nullable
    private String affiliateToken;

    /**
     * Residence for tax purpose. Comma separated iso country code if multiple jurisdictions.
     * Only applicable for real money account. Required for maltainvest landing company.
     */
    @SerializedName("tax_residence")
    private String taxResidence;

    /**
     * Tax identification number. Only applicable for real money account. Required for maltainvest landing company.
     */
    @SerializedName("tax_identification_number")
    private String taxIdentificationNumber;

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
     * Binary options or other financial derivatives trading frequency
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
     * Purpose and reason for requesting the account opening
     */
    @SerializedName("account_opening_reason")
    private String accountOpeningReason;

    /**
     * The anticipated account turnover
     */
    @SerializedName("account_turnover")
    private String accountTurnover;

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

    /**
     * Show whether client has accepted risk disclaimer, boolean value 1 or 0
     */
    @SerializedName("accept_risk")
    private Integer acceptRisk;

    public CreateMaltaAccountRequest() {
        this.responseType = CreateMaltaAccountResponse.class;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(Salutation salutation) {
        this.salutation = salutation.toString();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getFirstAddressLine() {
        return firstAddressLine;
    }

    public void setFirstAddressLine(String firstAddressLine) {
        this.firstAddressLine = firstAddressLine;
    }

    public String getSecondAddressLine() {
        return secondAddressLine;
    }

    public void setSecondAddressLine(String secondAddressLine) {
        this.secondAddressLine = secondAddressLine;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSecretQuestion() {
        return secretQuestion;
    }

    public void setSecretQuestion(SecretQuestions secretQuestion) {
        this.secretQuestion = secretQuestion.toString();
    }

    public String getSecretAnswer() {
        return secretAnswer;
    }

    public void setSecretAnswer(String secretAnswer) {
        this.secretAnswer = secretAnswer;
    }

    public String getAffiliateToken() {
        return affiliateToken;
    }

    public void setAffiliateToken(String affiliateToken) {
        this.affiliateToken = affiliateToken;
    }

    public String getTaxResidence() {
        return taxResidence;
    }

    public void setTaxResidence(String taxResidence) {
        this.taxResidence = taxResidence;
    }

    public String getTaxIdentificationNumber() {
        return taxIdentificationNumber;
    }

    public void setTaxIdentificationNumber(String taxIdentificationNumber) {
        this.taxIdentificationNumber = taxIdentificationNumber;
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

    public String getAccountOpeningReason() {
        return accountOpeningReason;
    }

    public void setAccountOpeningReason(AccountOpeningReasons accountOpeningReason) {
        this.accountOpeningReason = accountOpeningReason.toString();
    }

    public String getAccountTurnover() {
        return accountTurnover;
    }

    public void setAccountTurnover(TurnoverRanges accountTurnover) {
        this.accountTurnover = accountTurnover.toString();
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

    public void setEstimatedWorth(WorthRanges estimatedWorth) {
        this.estimatedWorth = estimatedWorth.toString();
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

    public boolean getAcceptRisk() {
        return acceptRisk == 1 ? true : false;
    }

    public void setAcceptRisk(Boolean acceptRisk) {
        this.acceptRisk = acceptRisk ? 1 : 0;
    }
}
