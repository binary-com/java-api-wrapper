package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 7/31/2017
 */
public class AssetIndex {
    private String symbol;
    private String symbolDisplayName;
    List<ContractInfo> contracts = new ArrayList<>();

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbolDisplayName() {
        return symbolDisplayName;
    }

    public void setSymbolDisplayName(String symbolDisplayName) {
        this.symbolDisplayName = symbolDisplayName;
    }

    public void addContract(ContractInfo contract) {
        this.contracts.add(contract);
    }

    public List<ContractInfo> getContracts() {
        return this.contracts;
    }
}
