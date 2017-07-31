package com.binary.api.models.requests;

import com.binary.api.models.responses.ActiveSymbolResponse;
import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

/**
 * <h1>Active Symbol Request</h1>
 *
 * <h2>Request list of active symbols</h2>
 * <p>
 * Retrieve a list of all active symbols (underlying markets upon which contracts are available for trading).
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 7/31/2017
 */
public class ActiveSymbolRequest extends RequestBase {

    @SerializedName("active_symbols")
    private String activeSymbols;

    @SerializedName("landing_company")
    private String landingCompany;

    @SerializedName("product_type")
    @Nullable
    private String productType;

    public ActiveSymbolRequest(){
        this(false);
    }

    public ActiveSymbolRequest(boolean isFull){
        this.responseType = ActiveSymbolResponse.class;
        if(isFull) {
            this.activeSymbols = "Full";
        }
        else
        {
            this.activeSymbols = "brief";
        }
    }

    public ActiveSymbolRequest(boolean isFull, String landingCompany) {
        this(isFull);
        this.landingCompany = landingCompany;
    }

    public ActiveSymbolRequest(String landingCompany) {
        this();
        this.landingCompany = landingCompany;
    }

    public String getActiveSymbols() {
        return activeSymbols;
    }

    public void setActiveSymbols(String activeSymbols) {
        this.activeSymbols = activeSymbols;
    }

    public String getLandingCompany() {
        return landingCompany;
    }

    public void setLandingCompany(String landingCompany) {
        this.landingCompany = landingCompany;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }
}
