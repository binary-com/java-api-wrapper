package com.binary.api.models.requests;

import com.binary.api.models.enums.CashierTypes;
import com.binary.api.models.responses.CashierPasswordResponse;
import com.google.gson.annotations.SerializedName;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/14/2017
 */
public class CashierPasswordRequest extends RequestBase {

    /**
     * if neither lock_password nor unlock_password is passed, we'll just return the status for cashier
     */
    @SerializedName("cashier_password")
    private final String password = "1";

    /**
     * old password to unlock cashier, required for unlock
     * (length within 6-25 chars, accepts any printable ASCII character)
     */
    @SerializedName("unlock_password")
    private String unlockPassword;

    /**
     * new password to lock cashier, required for lock (length within 6-25 chars, accepts any printable ASCII character)
     */
    @SerializedName("lock_password")
    private String lockPassword;

    public CashierPasswordRequest() {
        this.responseType = CashierPasswordResponse.class;
    }

    public String getUnlockPassword() {
        return unlockPassword;
    }

    public void setUnlockPassword(String unlockPassword) {
        this.unlockPassword = unlockPassword;
    }

    public String getLockPassword() {
        return lockPassword;
    }

    public void setLockPassword(String lockPassword) {
        this.lockPassword = lockPassword;
    }
}
