package com.binary.api.models.responses;

import com.binary.api.models.requests.ApiTokenManagementRequest;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * <h1>ApiTokenManagementResponse</h1>
 *
 * <h2>API Token Response</h2>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/9/2017
 */
public class ApiTokenManagementResponse extends ResponseBase<ApiTokenManagementRequest> {

    /**
     * Api Token
     */
    @SerializedName("api_token")
    private ApiTokenResult apiTokenResult;

    public ApiTokenResult getApiTokenResult() {
        return apiTokenResult;
    }

    public class ApiTokenResult {

        /**
         * API tokens
         */
        @SerializedName("tokens")
        private List<ApiToken> tokens;

        /**
         * Token created.
         */
        @SerializedName("new_token")
        private Integer isTokenCreated;

        /**
         * Token Deleted
         */
        @SerializedName("delete_token")
        private Integer isTokenDeleted;

        @SerializedName("sub_account")
        private String subAccount;

        public List<ApiToken> getTokens() {
            return tokens;
        }

        public boolean isTokenCreated() {
            return isTokenCreated == 1 ? true : false;
        }

        public boolean isTokenDeleted() {
            return isTokenDeleted == 1 ? true : false;
        }

        public String getSubAccount() {
            return subAccount;
        }
    }
}
