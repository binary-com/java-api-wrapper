package com.binary.api.models.responses;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 7/31/2017
 */
public class ContractInfo {
    private String contractSymbol;
    private String contractDisplayName;
    private String minDuration;
    private String maxDuration;

    public String getContractSymbol() {
        return contractSymbol;
    }

    public void setContractSymbol(String contractSymbol) {
        this.contractSymbol = contractSymbol;
    }

    public String getContractDisplayName() {
        return contractDisplayName;
    }

    public void setContractDisplayName(String contractDisplayName) {
        this.contractDisplayName = contractDisplayName;
    }

    public String getMinDuration() {
        return minDuration;
    }

    public void setMinDuration(String minDuration) {
        this.minDuration = minDuration;
    }

    public String getMaxDuration() {
        return maxDuration;
    }

    public void setMaxDuration(String maxDuration) {
        this.maxDuration = maxDuration;
    }
}
