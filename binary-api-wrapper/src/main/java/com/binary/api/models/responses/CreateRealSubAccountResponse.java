package com.binary.api.models.responses;

import com.binary.api.models.requests.CreateRealSubAccountRequest;
import com.google.gson.annotations.SerializedName;

import java.util.Map;

/**
 * <h1>CreateRealSubAccountResponse</h1>
 *
 * <h2>Create sub account receive</h2>
 * <p>
 *     Response for new sub account call
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/4/2017
 */
public class CreateRealSubAccountResponse extends ResponseBase<CreateRealSubAccountRequest> {

    @SerializedName("new_sub_account")
    private Map<String, String> account;

    public Map<String, String> getAccount() {
        return account;
    }
}
