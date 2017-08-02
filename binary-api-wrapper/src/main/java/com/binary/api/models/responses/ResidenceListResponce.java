package com.binary.api.models.responses;

import com.binary.api.models.requests.ResidenceListRequest;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * <h1>ResidenceListResponse</h1>
 *
 * <h2>Residence List Receive</h2>
 * <p>A message with Residence List</p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/2/2017
 */
public class ResidenceListResponce extends ResponseBase<ResidenceListRequest> {

    /**
     * List of countries for account opening
     */
    @SerializedName("residence_list")
    private List<Residence> residenceList;

    public List<Residence> getResidenceList() {
        return residenceList;
    }
}
