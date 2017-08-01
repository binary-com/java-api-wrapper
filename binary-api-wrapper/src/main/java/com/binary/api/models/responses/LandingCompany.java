package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

/**
 * <h1>Landing Company</h1>
 *
 * <h2>Landing Company Receive</h2>
 * <p>Returns the Landing Company for clients of a given country.</p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/1/2017
 */
public class LandingCompany {

    /**
     * Country code
     */
    @SerializedName("id")
    private String id;

    /**
     * Country name
     */
    @SerializedName("name")
    private String name;

    /**
     * Landing Company for gaming contracts (Volatility Indices)
     */
    @SerializedName("gaming_company")
    @Nullable
    private Company gamingCompany;

    /**
     * Landing Company for financial contracts (all except Volatility Indices)
     */
    @SerializedName("financial_company")
    @Nullable
    private Company financialCompany;

    /**
     * Landing Company for MT5 gaming contracts (Volatility Indices)
     */
    @SerializedName("mt_gaming_company")
    @Nullable
    private Company mtGamingCompany;

    /**
     * Landing Company for MT5 financial contracts (all except Volatility Indices)
     */
    @SerializedName("mt_financial_company")
    @Nullable
    private Company mtFinancialCompany;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getGamingCompany() {
        return gamingCompany;
    }

    public void setGamingCompany(Company gamingCompany) {
        this.gamingCompany = gamingCompany;
    }

    public Company getFinancialCompany() {
        return financialCompany;
    }

    public void setFinancialCompany(Company financialCompany) {
        this.financialCompany = financialCompany;
    }

    public Company getMtGamingCompany() {
        return mtGamingCompany;
    }

    public void setMtGamingCompany(Company mtGamingCompany) {
        this.mtGamingCompany = mtGamingCompany;
    }

    public Company getMtFinancialCompany() {
        return mtFinancialCompany;
    }

    public void setMtFinancialCompany(Company mtFinancialCompany) {
        this.mtFinancialCompany = mtFinancialCompany;
    }
}
