package com.binary.api.models.requests;

import com.binary.api.models.responses.ResidenceListResponce;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>ResidenceListRequest</h1>
 *
 * <h2>Residence List Send</h2>
 * <p>
 *     This call returns a list of countries and 2-letter country codes, suitable for populating the account opening form.
 * </p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/2/2017
 */
public class ResidenceListRequest extends RequestBase {

    @SerializedName("residence_list")
    private final int residentList = 1;

    public ResidenceListRequest(){
        this.responseType = ResidenceListResponce.class;
    }
}
