package com.binary.api.models.requests;

import com.binary.api.models.responses.ContractsForSymbolResponse;
import com.binary.api.utils.Validator;
import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/1/2017
 */
public class ContractsForSymbolRequest extends RequestBase {

    /**
     * The short symbol name
     */
    @SerializedName("contracts_for")
    private String symbol;

    /**
     * Currency for the contracts stake and payout. Optional field, defaults to USD if not passed in.
     */
    @SerializedName("currency")
    @Nullable
    private String currency;

    /**
     * Set to 'multi_barrier' to get a list of contracts with predefined trading windows and barriers for a given symbol.
     * Default to 'basic'
     */
    @SerializedName("product_type")
    @Nullable
    private String productType;

    /**
     * Optional landing_company field. Set to a specific landing company
     * if you want to get a list of contracts for a specific landing company. Default to costarica.

     */
    @SerializedName("landing_company")
    @Nullable
    private String landingCompany;

    public ContractsForSymbolRequest(String symbol) {
        this.symbol = symbol;
        this.responseType = ContractsForSymbolResponse.class;
    }

    public ContractsForSymbolRequest(String symbol, String landingCompany){
        this(symbol);
        this.landingCompany = landingCompany;
    }

    public ContractsForSymbolRequest(String symbol, String landingCompany, String currency){
        this(symbol, landingCompany);
        this.currency = currency;
    }

    public ContractsForSymbolRequest(String symbol, String landingCompany, String currency, String productType){
        this(symbol, landingCompany, currency);
        this.productType = productType;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        Validator.checkPattern("^\\w{2,30}$", symbol,"Symbol does not match the regex pattern \\^\\w{2,30}$\\");
        this.symbol = symbol;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        Validator.checkPattern("^[A-Z]{3}$", symbol,"Currency does not match the regex pattern \\^[A-Z]{3}$\\");
        this.currency = currency;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        Validator.checkPattern("^(basic|multi_barrier)$", symbol,"ProductType does not match the regex pattern \\^[A-Z]{3}$\\");
        this.productType = productType;
    }

    public String getLandingCompany() {
        return landingCompany;
    }

    public void setLandingCompany(String landingCompany) {
        this.landingCompany = landingCompany;
    }
}
