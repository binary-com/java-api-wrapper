package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/7/2017
 */
public class OAuthApplication {

    /**
     * Application name
     */
    @SerializedName("name")
    private String name;

    /**
     * Application id
     */
    @SerializedName("app_id")
    private Integer applicationId;

    /**
     * Application last used
     */
    @SerializedName("last_used")
    @Nullable
    private String lastUsed;

    /**
     * Scopes
     */
    @SerializedName("scopes")
    private List<String> scopes;

    /**
     * Markup added to contract prices (as a percentage of contract payout)
     */
    @SerializedName("app_markup_percentage")
    private BigDecimal markupPercentage;

    public String getName() {
        return name;
    }

    public Integer getApplicationId() {
        return applicationId;
    }

    public String getLastUsed() {
        return lastUsed;
    }

    public List<String> getScopes() {
        return scopes;
    }

    public BigDecimal getMarkupPercentage() {
        return markupPercentage;
    }
}
