package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/7/2017
 */
public class LoginHistory {

    /**
     * Epoch time of the activity
     */
    @SerializedName("time")
    private int time;

    /**
     * Type of action. Example: login, logout
     */
    @SerializedName("action")
    private String action;

    /**
     * Provides details about browser, device used during login or logout
     */
    @SerializedName("environment")
    private String evironment;

    /**
     * Status of activity: 1 - success, 0 - failure
     */
    @SerializedName("status")
    private int status;

    public int getTime() {
        return time;
    }

    public String getAction() {
        return action;
    }

    public String getEvironment() {
        return evironment;
    }

    public boolean getStatus() {
        return status == 1 ? true : false;
    }
}
