package com.binary.api.models.requests;

import com.binary.api.models.enums.AccountOpeningReasons;
import com.binary.api.models.enums.Salutation;
import com.binary.api.models.enums.SecretQuestions;
import com.binary.api.models.enums.TurnoverRanges;
import com.binary.api.models.responses.CreateRealAccountResponse;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>CreateRealAccountRequest</h1>
 *
 * <h2>Create real account Send</h2>
 * <p>
 *     This call opens a new real-money account.
 *     Note: you must be authenticated to a virtual-money account to call this function.
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/3/2017
 */
public class CreateRealAccountRequest extends RequestBase {

    @SerializedName("new_account_real")
    private final int newAccountReal = 1;

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
    @SerializedName("date_of_birth")
    private String dateOfBirth;

    /**
     * 2-letter country code, possible value receive from residence_list call.
     */
    @SerializedName("residence")
    private String residence;

    /**
     * Place of birth, 2-letter country code.
     */
    @SerializedName("place_of_birth")
    private String placeOfBirth;

    /**
     * First line of address
     */
    @SerializedName("address_line_1")
    private String firstAddressLine;

    /**
     * Optional field, within 70 characters.
     */
    @SerializedName("address_line_2")
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
    private String state;

    /**
     * Optional field, within 20 characters and may not contain '+'.
     */
    @SerializedName("address_postcode")
    private String postcode;

    /**
     * Within 6-35 digits, allowing '+' in front, numbers or space.
     */
    @SerializedName("phone")
    private String phone;

    /**
     * Accept any value in enum list.
     * Required for new account and existing client details will be used if client open another account.
     */
    @SerializedName("secret_question")
    private String secretQuestion;

    /**
     * Answer to secret question, within 4-50 characters.
     * Required for new account and existing client details will be used if client open another account.
     */
    @SerializedName("secret_answer")
    private String secretAnswer;

    /**
     * Affiliate token, within 32 characters.
     */
    @SerializedName("affiliate_token")
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
     * Optional field to set currency of the account.
     * List of supported currencies can be acquired with 'payout_currencies' call
     */
    @SerializedName("currency")
    private String currency;

    public CreateRealAccountRequest() {
        this.responseType = CreateRealAccountResponse.class;
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

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
