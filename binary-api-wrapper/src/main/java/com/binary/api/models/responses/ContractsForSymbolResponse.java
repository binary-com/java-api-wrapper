package com.binary.api.models.responses;

import com.binary.api.models.requests.ContractsForSymbolRequest;
import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

import java.util.List;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/1/2017
 */
public class ContractsForSymbolResponse extends ResponseBase<ContractsForSymbolRequest> {

    @SerializedName("contracts_for")
    private ContractForSymbol contractsFor;

    public ContractForSymbol getContractsFor() {
        return contractsFor;
    }

    public void setContractsFor(ContractForSymbol contractsFor) {
        this.contractsFor = contractsFor;
    }
}
