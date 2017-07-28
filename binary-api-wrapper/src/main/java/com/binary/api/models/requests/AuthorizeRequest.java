package com.binary.api.models.requests;

import com.binary.api.models.responses.AuthorizeResponse;
import com.google.gson.annotations.SerializedName;

/**
 * Created by morteza on 7/28/2017.
 */
public class AuthorizeRequest extends RequestBase {
    @SerializedName("authorize")
    private String authorize;

    @SerializedName("add_to_login_history")
    private int addToLoginHistory;

    public AuthorizeRequest(){
        this.responseType = AuthorizeResponse.class;
    }
    public AuthorizeRequest(String token, boolean addToLoginHistoy){
        this();
        this.authorize = token;
        this.addToLoginHistory = addToLoginHistoy ? 1 : 0;
    }

    public String getAuthorize() {
        return authorize;
    }

    public void setAuthorize(String authorize) {
        this.authorize = authorize;
    }

    public int getAddToLoginHistory() {
        return addToLoginHistory;
    }

    public void setAddToLoginHistory(int addToLoginHistory) {
        this.addToLoginHistory = addToLoginHistory;
    }
}
