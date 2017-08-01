package com.binary.api.models.requests;

import com.binary.api.models.responses.AssetIndexResponse;
import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

/**
 * <h1>AssetIndexRequest</h1>
 *
 * <h2>Asset Index Send</h2>
 * <p>Retrieve the Asset Index: a list of all available markets and a summary of the contracts available thereupon.</p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 7/31/2017
 */
public class AssetIndexRequest extends RequestBase {

    @SerializedName("asset_index")
    private final int assetIndex = 1;

    /**
     * Optional landing company field. If specified, will return only the markets
     * and contracts that this landing company can trade.
     */
    @SerializedName("landing_company")
    @Nullable
    private String landingCompany;

    public AssetIndexRequest(){
        this.responseType = AssetIndexResponse.class;
    }

    public AssetIndexRequest(String landingCompany) {
        this();
        this.landingCompany = landingCompany;
    }

    /**
     * {@link AssetIndexRequest#landingCompany}
     */
    public String getLandingCompany() {
        return landingCompany;
    }

    /**
     * {@link AssetIndexRequest#landingCompany}
     * @param landingCompany
     */
    public void setLandingCompany(String landingCompany) {
        this.landingCompany = landingCompany;
    }
}
