package com.binary.api.models.responses;

import com.binary.api.models.requests.AssetIndexRequest;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 7/31/2017
 */
public class AssetIndexResponse extends ResponseBase<AssetIndexRequest> {

    @SerializedName("asset_index")
    private AssetIndex[] assetIndex;

    public AssetIndex[] getAssetIndex() {
        return assetIndex;
    }

    public void setAssetIndex(AssetIndex[] assetIndex) {
        this.assetIndex = assetIndex;
    }
}
