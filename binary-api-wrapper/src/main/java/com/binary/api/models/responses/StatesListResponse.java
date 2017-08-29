package com.binary.api.models.responses;

import com.binary.api.models.requests.StatesListRequest;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * <h1>StatesListResponse</h1>
 *
 * <h2>States List Receive</h2>
 * <p>A message with States List</p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/2/2017
 */
public class StatesListResponse extends ResponseBase<StatesListRequest> {

    /**
     * List of states.
     */
    @SerializedName("states_list")
    private List<State> statesList;

    public List<State> getStatesList() {
        return statesList;
    }
}
