package com.binary.api.models.requests;

import com.binary.api.models.enums.Scopes;
import com.binary.api.models.responses.ApplicationRegistrationResponse;
import com.binary.api.models.responses.ApplicationUpdateResponse;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/27/2017
 */
public class ApplicationUpdateRequest extends RequestBase {

    @SerializedName("app_update")
    private Long applicationId;

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

    private ApplicationUpdateRequest() {
        this.responseType = ApplicationUpdateResponse.class;
    }

    public ApplicationUpdateRequest(Long applicationId, String name, List<Scopes> scopes, String redirectUri) {
        this();
        this.setApplicationId(applicationId);
        this.setName(name);
        this.setScopes(scopes);
        this.setRedirectUri(redirectUri);
    }

    public ApplicationUpdateRequest(Long applicationId, String name, List<Scopes> scopes, String homepageUrl,
                                          String githubUrl, String appStoreUrl, String googlePlayUrl,
                                          String redirectUri, String verificationUri,
                                          BigDecimal appMarkupPercentage) {
        this();
        this.setApplicationId(applicationId);
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

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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
        this.homepageUrl = homepageUrl;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public void setGithubUrl(String githubUrl) {
        this.githubUrl = githubUrl;
    }

    public String getAppStoreUrl() {
        return appStoreUrl;
    }

    public void setAppStoreUrl(String appStoreUrl) {
        this.appStoreUrl = appStoreUrl;
    }

    public String getGooglePlayUrl() {
        return googlePlayUrl;
    }

    public void setGooglePlayUrl(String googlePlayUrl) {
        this.googlePlayUrl = googlePlayUrl;
    }

    public String getRedirectUri() {
        return redirectUri;
    }

    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    public String getVerificationUri() {
        return verificationUri;
    }

    public void setVerificationUri(String verificationUri) {
        this.verificationUri = verificationUri;
    }

    public BigDecimal getAppMarkupPercentage() {
        return appMarkupPercentage;
    }

    public void setAppMarkupPercentage(BigDecimal appMarkupPercentage) {
        this.appMarkupPercentage = appMarkupPercentage;
    }
}
