package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

/**
 * Created by morteza on 7/28/2017.
 */
public class Authorize {
    @SerializedName("email")
    private String email;

    @SerializedName("currency")
    private String currency;

    @SerializedName("balance")
    private BigDecimal balance;

    @SerializedName("loginid")
    private String loginId;

    @SerializedName("is_virtual")
    private int isVirtual;

    @SerializedName("landing_company_name")
    private String landingCompanyName;

    @SerializedName("landing_company_fullname")
    private String landingCompanyFullName;

    @SerializedName("country")
    private String country;

    @SerializedName("fullname")
    private String fullName;

    @SerializedName("scopes")
    private String[] scopes;

    @SerializedName("allow_omnibus")
    private int allowOmnibus;

    @SerializedName("sub_accounts")
    private SubAccount[] subAccounts;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public int getIsVirtual() {
        return isVirtual;
    }

    public void setIsVirtual(int isVirtual) {
        this.isVirtual = isVirtual;
    }

    public String getLandingCompanyName() {
        return landingCompanyName;
    }

    public void setLandingCompanyName(String landingCompanyName) {
        this.landingCompanyName = landingCompanyName;
    }

    public String getLandingCompanyFullName() {
        return landingCompanyFullName;
    }

    public void setLandingCompanyFullName(String landingCompanyFullName) {
        this.landingCompanyFullName = landingCompanyFullName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String[] getScopes() {
        return scopes;
    }

    public void setScopes(String[] scopes) {
        this.scopes = scopes;
    }

    public int getAllowOmnibus() {
        return allowOmnibus;
    }

    public void setAllowOmnibus(int allowOmnibus) {
        this.allowOmnibus = allowOmnibus;
    }

    public SubAccount[] getSubAccounts() {
        return subAccounts;
    }

    public void setSubAccounts(SubAccount[] subAccounts) {
        this.subAccounts = subAccounts;
    }
}