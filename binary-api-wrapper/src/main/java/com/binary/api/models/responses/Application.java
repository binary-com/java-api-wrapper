package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/9/2017
 */
public class Application {

    /**
     * Application name
     *
     */
    @SerializedName("name")
    private String name;

    @SerializedName("app_id")
    private Long applicationId;

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

    public String getName() {
        return name;
    }

    public Long getApplicationId() {
        return applicationId;
    }

    public String getHomepageUrl() {
        return homepageUrl;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public String getAppStoreUrl() {
        return appStoreUrl;
    }

    public String getGooglePlayUrl() {
        return googlePlayUrl;
    }

    public String getRedirectUri() {
        return redirectUri;
    }

    public String getVerificationUri() {
        return verificationUri;
    }

    public BigDecimal getAppMarkupPercentage() {
        return appMarkupPercentage;
    }
}
