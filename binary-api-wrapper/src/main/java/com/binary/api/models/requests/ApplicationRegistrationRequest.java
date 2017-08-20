package com.binary.api.models.requests;

import com.binary.api.models.enums.Scopes;
import com.binary.api.models.responses.Application;
import com.binary.api.models.responses.ApplicationRegistrationResponse;
import com.binary.api.utils.Validator;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <h1>ApplicationRegistrationRequest</h1>
 *
 * <h2>Application Register Send</h2>
 *<p>
 *     Register a new OAuth application
 *</p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/9/2017
 */
public class ApplicationRegistrationRequest extends RequestBase {

    /**
     * Must be 1
     *
     */
    @SerializedName("app_register")
    private final int appRegister = 1;

    /**
     * Application name
     *
     */
    @SerializedName("name")
    private String name;

    @SerializedName("scopes")
    private List<String> scopes = null;

    /**
     * Application's homepage
     *
     */
    @SerializedName("homepage")
    private String homepageUrl;

    /**
     * Application's GitHub page (for open-source projects)
     *
     */
    @SerializedName("github")
    private String githubUrl;

    /**
     * Application's App Store URL (if applicable)
     *
     */
    @SerializedName("appstore")
    private String appStoreUrl;

    /**
     * Application's Google Play URL (if applicable)
     *
     */
    @SerializedName("googleplay")
    private String googlePlayUrl;

    /**
     * Application redirect_uri
     *
     */
    @SerializedName("redirect_uri")
    private String redirectUri;

    /**
     * Application verification_uri
     *
     */
    @SerializedName("verification_uri")
    private String verificationUri;

    /**
     * Markup to be added to contract prices (as a percentage of contract payout). Min: 0, Max: 5
     *
     */
    @SerializedName("app_markup_percentage")
    private BigDecimal appMarkupPercentage;

    private ApplicationRegistrationRequest() {
        this.responseType = ApplicationRegistrationResponse.class;
    }

    public ApplicationRegistrationRequest(String name, List<Scopes> scopes, String redirectUri) {
        this();
        this.setName(name);
        this.setScopes(scopes);
        this.setRedirectUri(redirectUri);
    }

    public ApplicationRegistrationRequest(String name, List<Scopes> scopes, String homepageUrl,
                                          String githubUrl, String appStoreUrl, String googlePlayUrl,
                                          String redirectUri, String verificationUri,
                                          BigDecimal appMarkupPercentage) {
        this();
        this.setName(name);
        this.setScopes(scopes);
        this.setHomepageUrl(homepageUrl);
        this.setGithubUrl(githubUrl);
        this.setAppStoreUrl(appStoreUrl);
        this.setGooglePlayUrl(googlePlayUrl);
        this.setRedirectUri(redirectUri);
        this.setVerificationUri(verificationUri);
        this.setAppMarkupPercentage(appMarkupPercentage);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Validator.checkPattern("^[\\w\\s-]{1,48}$", name,
                "Name does not match the regex pattern /^[\\w\\s-]{1,48}$/");
        this.name = name;
    }

    public List<String> getScopes() {
        return scopes;
    }

    public void setScopes(List<Scopes> scopes) {
        this.scopes = scopes.stream().map(Object::toString).collect(Collectors.toList());
    }

    public String getHomepageUrl() {
        return homepageUrl;
    }

    public void setHomepageUrl(String homepageUrl) {
        Validator.checkPattern("^https?://[0-9a-zA-Z\\.-]+[\\%\\/\\w \\.-]*$", homepageUrl,
                "Homepage Url does not match the regex pattern /^https?://[0-9a-zA-Z\\.-]+[\\%\\/\\w \\.-]*$/");
        this.homepageUrl = homepageUrl;
    }

    public String getGithubUrl() {
        Validator.checkPattern("^https?://[0-9a-zA-Z\\.-]+[\\%\\/\\w \\.-]*$", githubUrl,
                "Github Url does not match the regex pattern /^https?://[0-9a-zA-Z\\.-]+[\\%\\/\\w \\.-]*$/");
        return githubUrl;
    }

    public void setGithubUrl(String githubUrl) {
        Validator.checkPattern("^https?://[0-9a-zA-Z\\.-]+[\\%\\/\\w \\.-]*$", githubUrl,
                "Github Url does not match the regex pattern /^https?://[0-9a-zA-Z\\.-]+[\\%\\/\\w \\.-]*$/");
        this.githubUrl = githubUrl;
    }

    public String getAppStoreUrl() {
        return appStoreUrl;
    }

    public void setAppStoreUrl(String appStoreUrl) {
        Validator.checkPattern("^https?://[0-9a-zA-Z\\.-]+[\\%\\/\\w \\.-]*$", appStoreUrl,
                "AppStore Url does not match the regex pattern /^https?://[0-9a-zA-Z\\.-]+[\\%\\/\\w \\.-]*$/");
        this.appStoreUrl = appStoreUrl;
    }

    public String getGooglePlayUrl() {
        return googlePlayUrl;
    }

    public void setGooglePlayUrl(String googlePlayUrl) {
        Validator.checkPattern("^https?://[0-9a-zA-Z\\.-]+[\\%\\/\\w \\.-]*$", googlePlayUrl,
                "GooglePlay Url does not match the regex pattern /^https?://[0-9a-zA-Z\\.-]+[\\%\\/\\w \\.-]*$/");
        this.googlePlayUrl = googlePlayUrl;
    }

    public String getRedirectUri() {
        return redirectUri;
    }

    public void setRedirectUri(String redirectUri) {
        Validator.checkPattern("^https?://[0-9a-zA-Z\\.-]+[\\%\\/\\w \\.-]*$", redirectUri,
                "Redirect Uri does not match the regex pattern /^https?://[0-9a-zA-Z\\.-]+[\\%\\/\\w \\.-]*$/");
        this.redirectUri = redirectUri;
    }

    public String getVerificationUri() {
        return verificationUri;
    }

    public void setVerificationUri(String verificationUri) {
        Validator.checkPattern("^https?://[0-9a-zA-Z\\.-]+[\\%\\/\\w \\.-]*$", githubUrl,
                "Verification Uri does not match the regex pattern /^https?://[0-9a-zA-Z\\.-]+[\\%\\/\\w \\.-]*$/");
        this.verificationUri = verificationUri;
    }

    public BigDecimal getAppMarkupPercentage() {
        return appMarkupPercentage;
    }

    public void setAppMarkupPercentage(BigDecimal appMarkupPercentage) {
        Validator.checkPattern("^([0-4](\\.[0-9][0-9]?)?|5(\\.00?)?)$", appMarkupPercentage.toString(),
                "App Markup Percentage does not match the regex");
        this.appMarkupPercentage = appMarkupPercentage;
    }
}
