package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/1/2017
 */
public class Company {

    /**
     * Landing Company short code
     */
    @SerializedName("shortcode")
    private String shortCode;

    /**
     * Landing Company legal name
     */
    @SerializedName("name")
    private String name;

    /**
     * Landing Company address
     */
    @SerializedName("address")
    private List<String> address;

    /**
     * Landing Company country of incorporation
     */
    @SerializedName("country")
    private String country;

    /**
     * Default account currency
     */
    @SerializedName("legal_default_currency")
    private String legalDefaultCurrency;

    /**
     * Allowable currencies
     */
    @SerializedName("legal_allowed_currencies")
    private List<String> legalAllowedCurrencies;

    /**
     * Allowable markets
     */
    @SerializedName("legal_allowed_markets")
    private List<String> legalAllowedMarkets;

    /**
     * Allowed contract types
     */
    @SerializedName("legal_allowed_contract_categories")
    private List<String> legalAllowedContractCategories;

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLegalDefaultCurrency() {
        return legalDefaultCurrency;
    }

    public void setLegalDefaultCurrency(String legalDefaultCurrency) {
        this.legalDefaultCurrency = legalDefaultCurrency;
    }

    public List<String> getLegalAllowedCurrencies() {
        return legalAllowedCurrencies;
    }

    public void setLegalAllowedCurrencies(List<String> legalAllowedCurrencies) {
        this.legalAllowedCurrencies = legalAllowedCurrencies;
    }

    public List<String> getLegalAllowedMarkets() {
        return legalAllowedMarkets;
    }

    public void setLegalAllowedMarkets(List<String> legalAllowedMarkets) {
        this.legalAllowedMarkets = legalAllowedMarkets;
    }

    public List<String> getLegalAllowedContractCategories() {
        return legalAllowedContractCategories;
    }

    public void setLegalAllowedContractCategories(List<String> legalAllowedContractCategories) {
        this.legalAllowedContractCategories = legalAllowedContractCategories;
    }
}
