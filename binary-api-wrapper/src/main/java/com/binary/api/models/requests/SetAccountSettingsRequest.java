package com.binary.api.models.requests;

import com.binary.api.models.enums.AccountOpeningReasons;
import com.binary.api.models.responses.SetAccountSettingsResponse;
import com.google.gson.annotations.SerializedName;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/13/2017
 */
public class SetAccountSettingsRequest extends RequestBase {

    @SerializedName("set_settings")
    private final int setSettings = 1;

    /**
     * Note: not applicable for virtual account. Required field for real money account.
     */
    @SerializedName("address_line_1")
    private String firstLineAddress;

    /**
     * Note: not applicable for virtual account. Required field for real money account.
     */
    @SerializedName("address_line_2")
    private String secondLineAddress;

    /**
     * Note: not applicable for virtual account. Required field for real money account.
     */
    @SerializedName("address_city")
    private String city;

    /**
     * Note: not applicable for virtual account. Required field for real money account.
     */
    @SerializedName("address_state")
    private String state;

    /**
     * Note: not applicable for virtual account. Required field for real money account.
     */
    @SerializedName("address_postcode")
    private String postcode;

    /**
     * Note: not applicable for virtual account. Required field for real money account.
     */
    @SerializedName("phone")
    private String phone;

    /**
     * 2-letter country code. Note: not applicable for real money account.
     * Only allow for Virtual account without residence set.
     */
    @SerializedName("residence")
    private String residence;

    /**
     * Boolean value 1 or 0, indicating permission to use email address for any contact which may include marketing
     */
    @SerializedName("email_consent")
    private Integer emailConsent;

    /**
     * Place of birth, 2-letter country code.
     */
    @SerializedName("place_of_birth")
    private String placeOfBirth;

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
     * Purpose and reason for requesting the account opening.
     * Only applicable for real money account. Required for clients that have not set it yet. Can only be set once.
     */
    @SerializedName("account_opening_reason")
    private String accountOpeningReason;

    /**
     * Boolean value 1 or 0, indicating permission to allow others to follow your trades.
     * Note: not applicable for Virtual account. Only allow for real money account.
     */
    @SerializedName("allow_copiers")
    private Integer allowCopiers;

    /**
     * Japan real money client settings, only applicable for Japan real money account client.
     */
    @SerializedName("jp_settings")
    private JapanAccountSetting japanAccountSetting;

    public SetAccountSettingsRequest() {
        this.responseType = SetAccountSettingsResponse.class;
    }

    public String getFirstLineAddress() {
        return firstLineAddress;
    }

    public void setFirstLineAddress(String firstLineAddress) {
        this.firstLineAddress = firstLineAddress;
    }

    public String getSecondLineAddress() {
        return secondLineAddress;
    }

    public void setSecondLineAddress(String secondLineAddress) {
        this.secondLineAddress = secondLineAddress;
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

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public boolean getEmailConsent() {
        return emailConsent == 1 ? true : false;
    }

    public void setEmailConsent(boolean emailConsent) {
        this.emailConsent = emailConsent ? 1 : 0;
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

    public void setAccountOpeningReason(AccountOpeningReasons accountOpeningReason) {
        this.accountOpeningReason = accountOpeningReason.toString();
    }

    public boolean getAllowCopiers() {
        return allowCopiers == 1 ? true : false;
    }

    public void setAllowCopiers(boolean allowCopiers) {
        this.allowCopiers = allowCopiers ? 1 : 0;
    }

    public JapanAccountSetting getJapanAccountSetting() {
        return japanAccountSetting;
    }

    public void setJapanAccountSetting(JapanAccountSetting japanAccountSetting) {
        this.japanAccountSetting = japanAccountSetting;
    }
}
