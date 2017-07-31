package com.binary.api.utils;

import com.binary.api.models.responses.AssetIndex;
import com.binary.api.models.responses.ContractInfo;
import com.google.gson.*;
import com.google.gson.annotations.JsonAdapter;

import java.lang.reflect.Type;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 7/31/2017
 */
public class AssetIndexDeserializer implements JsonDeserializer<AssetIndex> {
    @Override
    public AssetIndex deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        JsonArray jArray = (JsonArray) json;
        AssetIndex assetIndex = new AssetIndex();

        assetIndex.setSymbol(jArray.get(0).toString());
        assetIndex.setSymbolDisplayName(jArray.get(1).toString());
        JsonArray contracts = (JsonArray) jArray.get(2);

        for(int i=0; i < contracts.size(); i++){
            JsonArray contractInfo = (JsonArray) contracts.get(i);
            ContractInfo contract = new ContractInfo();

            contract.setContractSymbol(contractInfo.get(0).toString());
            contract.setContractDisplayName(contractInfo.get(1).toString());
            contract.setMinDuration(contractInfo.get(2).toString());
            contract.setMaxDuration(contractInfo.get(3).toString());

            assetIndex.addContract(contract);
        }
        return assetIndex;
    }
}
