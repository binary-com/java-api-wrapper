package com.binary.api.models.requests;

import com.binary.api.models.responses.NewVirtualAccountResponse;
import com.binary.api.utils.Validator;
import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

/**
 * <h1>NewVirtualAccountRequest</h1>
 *
 * <h2>Create virtual account Send</h2>
 * <p>Create a new virtual-money account</p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/2/2017
 */
public class NewVirtualAccountRequest extends RequestBase {

    @SerializedName("new_account_virtual")
    private final int newAccountVirtual = 1;

    /**
     * Email verification code (received from a verify_email call, which must be done first)
     */
    @SerializedName("verification_code")
    private String verficationCode;

    /**
     * Password (length within 6-25 chars, accepts any printable ASCII character)
     */
    @SerializedName("client_password")
    private String clientPassword;

    /**
     * 2-letter country code (value received from residence_list call)
     */
    @SerializedName("residence")
    private String residence;

    /**
     * Affiliate token, within 32 characters.
     */
    @SerializedName("affiliate_token")
    @Nullable
    private String affiliateToken;

    /**
     * Optional field to identify the source of traffic such as: search engine, newsletter, or other referral
     */
    @SerializedName("utm_source")
    @Nullable
    private String utmSource;

    /**
     * Optional field to identify the medium the link was used upon such as: email, CPC, or other methods of sharing
     */
    @SerializedName("utm_medium")
    @Nullable
    private String utmMedium;

    /**
     * Optional field to identify a specific product promotion or
     * strategic campaign such as a spring sale or other promotions
     */
    @SerializedName("utm_campaign")
    @Nullable
    private String utmCampaign;

    /**
     * Boolean value 1 or 0, indicating permission to use email address for any contact which may include marketing
     */
    @SerializedName("email_consent")
    @Nullable
    private Integer emailConsent;

    /**
     * (Google Click Identifier) to track source
     */
    @SerializedName("gclid_url")
    @Nullable
    private String googleClickId;

    public NewVirtualAccountRequest(String verficationCode, String clientPassword, String residence){
        this.responseType = NewVirtualAccountResponse.class;
        this.setVerficationCode(verficationCode);
        this.setClientPassword(clientPassword);
        this.setResidence(residence);
    }

    public int getNewAccountVirtual() {
        return newAccountVirtual;
    }

    public String getVerficationCode() {
        return verficationCode;
    }

    public void setVerficationCode(String verficationCode) {
        Validator.checkPattern("^\\w{8,128}$", verficationCode,
                "Verification Code does not match the regex pattern /^\\w{8,128}$/");
        this.verficationCode = verficationCode;
    }

    public String getClientPassword() {
        return clientPassword;
    }

    public void setClientPassword(String clientPassword) {
        Validator.checkPattern("^[ -~]{6,25}$", clientPassword,
                "Client Password does not match the regex pattern /^[ -~]{6,25}$/");
        this.clientPassword = clientPassword;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        Validator.checkPattern("^[a-z]{2}$", residence, "Residence does not match the regex pattern /^[a-z]{2}$/");
        this.residence = residence;
    }

    public String getAffiliateToken() {
        return affiliateToken;
    }

    public void setAffiliateToken(String affiliateToken) {
        Validator.checkPattern("^[\\w-]{0,32}$", affiliateToken,
                "Affiliate Token does not match the regex pattern /^[\\w-]{0,32}$/");
        this.affiliateToken = affiliateToken;
    }

    public String getUtmSource() {
        return utmSource;
    }

    public void setUtmSource(String utmSource) {
        Validator.checkPattern("^[a-zA-Z0-9\\s\\-\\.\\_]{0,100}$", utmSource,
                "UTM Source does not match the regex pattern /^[a-zA-Z0-9\\s\\-\\.\\_]{0,100}$/");
        this.utmSource = utmSource;
    }

    public String getUtmMedium() {
        return utmMedium;
    }

    public void setUtmMedium(String utmMedium) {
        Validator.checkPattern("^[a-zA-Z0-9\\s\\-\\.\\_]{0,100}$", utmMedium,
                "UTM Medium does not match the regex pattern /^[a-zA-Z0-9\\s\\-\\.\\_]{0,100}$/");
        this.utmMedium = utmMedium;
    }

    public String getUtmCampaign() {
        return utmCampaign;
    }

    public void setUtmCampaign(String utmCampaign) {
        Validator.checkPattern("^[a-zA-Z0-9\\s\\-\\.\\_]{0,100}$", utmCampaign,
                "UTM Campaign does not match the regex pattern /^[a-zA-Z0-9\\s\\-\\.\\_]{0,100}$/");
        this.utmCampaign = utmCampaign;
    }

    public Integer getEmailConsent() {
        return emailConsent;
    }

    public void setEmailConsent(Integer emailConsent) {
        Validator.checkPattern("^(0|1)$", emailConsent.toString(), "Email Conset doesn't match the regex patter /^(0|1)$/");
        this.emailConsent = emailConsent;
    }

    public String getGoogleClickId() {
        return googleClickId;
    }

    public void setGoogleClickId(String googleClickId) {
        Validator.checkPattern("^[a-zA-Z0-9\\s\\-\\.\\_]{0,100}$", googleClickId,
                "Google Click Identifier URL does not match the regex pattern /^[a-zA-Z0-9\\s\\-\\.\\_]{0,100}$/");
        this.googleClickId = googleClickId;
    }
}
