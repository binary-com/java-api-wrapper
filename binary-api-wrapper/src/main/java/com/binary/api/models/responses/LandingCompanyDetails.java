package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/2/2017
 */
public class LandingCompanyDetails {

    /**
     * Landing Company shortcode
     */
    @SerializedName("shortcode")
    private String shortCode;

    /**
     * Landing Company name
     */
    @SerializedName("name")
    private String name;

    /**
     * Landing Company address
     */
    @SerializedName("address")
    @Nullable
    private String[] address;

    /**
     * Landing Company country
     */
    @SerializedName("country")
    private String county;

    /**
     * Default currency of client accounts with this Landing Company
     */
    @SerializedName("legal_default_currency")
    private String legalDefaultCurrency;

    /**
     * Allowable currencies for accounts with this Landing Company
     */
    @SerializedName("legal_allowed_currencies")
    private String[] legalAllowedCurrencies;

    @SerializedName("legal_allowed_markets")
    private String[] legalAllowedMarkets;

    @SerializedName("legal_allowed_contract_categories")
    private String[] legalAllowedContractCategories;

    /**
     * Flag to indicate whether reality check is applicable for this Landing Company.
     * 1: applicable, 0: not applicable.
     * The Reality Check is a feature that gives a summary of the client's trades
     * and account balances on a regular basis throughout his session,
     * and is a regulatory requirement for certain Landing Companies.
     */
    @SerializedName("has_reality_check")
    private int hasRealityCheck;

    public String getShortCode() {
        return shortCode;
    }

    public String getName() {
        return name;
    }

    public String[] getAddress() {
        return address;
    }

    public String getCounty() {
        return county;
    }

    public String getLegalDefaultCurrency() {
        return legalDefaultCurrency;
    }

    public String[] getLegalAllowedCurrencies() {
        return legalAllowedCurrencies;
    }

    public String[] getLegalAllowedMarkets() {
        return legalAllowedMarkets;
    }

    public String[] getLegalAllowedContractCategories() {
        return legalAllowedContractCategories;
    }

    public int getHasRealityCheck() {
        return hasRealityCheck;
    }
}
