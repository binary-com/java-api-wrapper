package com.binary.api.models.responses;

import com.binary.api.models.requests.CashierPasswordRequest;
import com.google.gson.annotations.SerializedName;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/14/2017
 */
public class CashierPasswordResponse extends  ResponseBase<CashierPasswordRequest> {

    @SerializedName("cashier_password")
    private Integer lock;

    public boolean isLock() {
        return lock == 1 ? true : false;
    }
}
