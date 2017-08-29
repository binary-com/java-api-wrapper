package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

/**
 * <h1>AccountSettings</h1>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/4/2017
 */
public class AccountSettings {

    /**
     * User Email
     */
    @SerializedName("email")
    private String email;

    /**
     * User Country
     */
    @SerializedName("country")
    @Nullable
    private String country;

    /**
     * 2-letter country code ISO standard
     */
    @SerializedName("country_code")
    @Nullable
    private String countryCode;

    /**
     * Salutation (note: not set for virtual-money accounts)
     */
    @SerializedName("salutation")
    @Nullable
    private String salutation;

    /**
     * First name (note: not set for virtual-money accounts)
     */
    @SerializedName("first_name")
    @Nullable
    private String firstName;

    /**
     * Last name (note: not set for virtual-money accounts)
     */
    @SerializedName("last_name")
    @Nullable
    private String lastName;

    /**
     * Epoch of user's birthday (note: not set for virtual-money accounts)
     */
    @SerializedName("date_of_birth")
    @Nullable
    private Integer dateOfBirth;

    /**
     * Address line 1 (note: not set for virtual-money accounts)
     */
    @SerializedName("address_line_1")
    @Nullable
    private String firstAddressLine;

    /**
     * Address line 2 (note: not set for virtual-money accounts)
     */
    @SerializedName("address_line_2")
    @Nullable
    private String secondAddressLine;

    /**
     * City (note: not set for virtual-money accounts)
     */
    @SerializedName("address_city")
    @Nullable
    private String addressCity;

    /**
     * State (note: not set for virtual-money accounts)
     */
    @SerializedName("address_state")
    @Nullable
    private String addressState;

    /**
     * Post Code (note: not set for virtual-money accounts)
     */
    @SerializedName("address_postcode")
    @Nullable
    private String addressPostcode;

    /**
     * Telephone (note: not set for virtual-money accounts)
     */
    @SerializedName("phone")
    @Nullable
    private String phone;

    /**
     * Boolean value 1 or 0, indicating whether is payment agent (note: not applicable for virtual money accounts)
     */
    @SerializedName("is_authenticated_payment_agent")
    private int isAuthenticatedPaymentAgent;

    /**
     * Boolean value 1 or 0, indicating permission to use email address for any contact which may include marketing
     */
    @SerializedName("email_consent")
    private int emailConsent;

    /**
     * Boolean value 1 or 0, indicating permission to allow others to follow your trades.
     * Note: not applicable for Virtual account. Only allow for real money account.
     */
    @SerializedName("allow_copier")
    private int allowCopier;

    /**
     * Latest terms and conditions version accepted by client
     */
    @SerializedName("client_tnc_status")
    @Nullable
    private String clientTNCStatus;

    /**
     * Place of birth, 2-letter country code.
     */
    @SerializedName("place_of_birth")
    @Nullable
    private String placeOfBirth;

    /**
     * Residence for tax purpose. Comma separated iso country code if multiple jurisdictions.
     * Only applicable for real money account.
     */
    @SerializedName("tax_residence")
    @Nullable
    private String taxResidence;

    /**
     * Tax identification number. Only applicable for real money account.
     */
    @SerializedName("tax_identification_number")
    @Nullable
    private String taxIdentificationNumber;

    /**
     * Purpose and reason for requesting the account opening. Only applicable for real money account.
     */
    @SerializedName("account_opening_reason")
    @Nullable
    private String accountOpeningReason;

    /**
     * Japan real money account status, only applicable for Japan virtual money account client.
     */
    @SerializedName("jp_account_status")
    @Nullable
    private JPAccountStatus jpAccountStatus;

    /**
     * Japan real money client settings, only applicable for Japan real money account client.
     */
    @SerializedName("jp_settings")
    @Nullable
    private JPSettings jpSettings;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
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

    public Integer getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Integer dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressState() {
        return addressState;
    }

    public void setAddressState(String addressState) {
        this.addressState = addressState;
    }

    public String getAddressPostcode() {
        return addressPostcode;
    }

    public void setAddressPostcode(String addressPostcode) {
        this.addressPostcode = addressPostcode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isAuthenticatedPaymentAgent() {
        return isAuthenticatedPaymentAgent == 1 ? true : false;
    }

    public void setIsAuthenticatedPaymentAgent(boolean isAuthenticatedPaymentAgent) {
        this.isAuthenticatedPaymentAgent = isAuthenticatedPaymentAgent ? 1 : 0;
    }

    public boolean getEmailConsent() {
        return emailConsent == 1 ? true : false;
    }

    public void setEmailConsent(boolean emailConsent) {
        this.emailConsent = emailConsent ? 1 : 0;
    }

    public boolean getAllowCopier() {
        return allowCopier == 1 ? true : false;
    }

    public void setAllowCopier(boolean allowCopier) {
        this.allowCopier = allowCopier ? 1 : 0;
    }

    public String getClientTNCStatus() {
        return clientTNCStatus;
    }

    public void setClientTNCStatus(String clientTNCStatus) {
        this.clientTNCStatus = clientTNCStatus;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
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

    public void setAccountOpeningReason(String accountOpeningReason) {
        this.accountOpeningReason = accountOpeningReason;
    }

    public JPAccountStatus getJpAccountStatus() {
        return jpAccountStatus;
    }

    public void setJpAccountStatus(JPAccountStatus jpAccountStatus) {
        this.jpAccountStatus = jpAccountStatus;
    }

    public JPSettings getJpSettings() {
        return jpSettings;
    }

    public void setJpSettings(JPSettings jpSettings) {
        this.jpSettings = jpSettings;
    }
}
