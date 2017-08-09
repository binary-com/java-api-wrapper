package com.binary.api.models.requests;

import com.binary.api.models.enums.Scopes;
import com.binary.api.models.responses.ApiTokenManagementResponse;
import com.binary.api.utils.Validator;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.ObjectConstructor;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <h1>ApiTokenManagementRequest</h1>
 *
 * <h2>API Token Request</h2>
 * <p>
 *     This call manages API tokens
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/9/2017
 */
public class ApiTokenManagementRequest extends RequestBase {

    @SerializedName("api_token")
    private final int apiToken = 1;

    /**
     * The name of the created token
     */
    @SerializedName("new_token")
    private String newToken;


    @SerializedName("new_token_scopes")
    private List<String> newTokenScopes;

    /**
     * Optional field, if you set this parameter during token creation,
     * then the token created will only work for the IP address that was used to create the token
     */
    @SerializedName("valid_for_current_ip_only")
    private int isValidForCurrentIpOnly;

    /**
     * The token to remove
     */
    @SerializedName("delete_token")
    private String deleteToken;

    /**
     * [For omnibus accounts only] Loginid of sub account.
     * If this field is present then it will create token for this sub account.
     */
    @SerializedName("sub_account")
    private String subAccount;

    public ApiTokenManagementRequest() {
        this.responseType = ApiTokenManagementResponse.class;
    }

    public ApiTokenManagementRequest(String newToken, List<Scopes> scopes) {
        this();
        this.setNewToken(newToken);
        this.setNewTokenScopes(scopes);
    }

    public ApiTokenManagementRequest(String newToken, List<Scopes> scopes, String subAccount) {
        this();
        this.setNewToken(newToken);
        this.setNewTokenScopes(scopes);
        this.setSubAccount(subAccount);
    }

    public ApiTokenManagementRequest(String deleteToken) {
        this();
        this.setDeleteToken(deleteToken);
    }

    public String getNewToken() {
        return newToken;
    }

    public void setNewToken(String newToken) {
        Validator.checkPattern("^[\\w\\s]+$", newToken,
                "New Token name does not match the regex pattern /^[\\w\\s]+$/");
        this.newToken = newToken;
    }

    public List<String> getNewTokenScopes() {
        return newTokenScopes;
    }

    public void setNewTokenScopes(List<Scopes> newTokenScopes) {
        this.newTokenScopes = newTokenScopes.stream().map(Object::toString).collect(Collectors.toList());
    }

    public int getIsValidForCurrentIpOnly() {
        return isValidForCurrentIpOnly;
    }

    public void setIsValidForCurrentIpOnly(int isValidForCurrentIpOnly) {
        this.isValidForCurrentIpOnly = isValidForCurrentIpOnly;
    }

    public String getDeleteToken() {
        return deleteToken;
    }

    public void setDeleteToken(String deleteToken) {
        this.deleteToken = deleteToken;
    }

    public String getSubAccount() {
        return subAccount;
    }

    public void setSubAccount(String subAccount) {
        this.subAccount = subAccount;
    }
}
