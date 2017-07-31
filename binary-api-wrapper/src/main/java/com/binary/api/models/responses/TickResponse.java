package com.binary.api.models.responses;

import com.binary.api.models.requests.TickRequest;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by morteza on 7/19/2017.
 */

public class TickResponse extends ResponseBase<TickRequest> {
    @SerializedName("tick")
    @Expose
    private
    Tick tick;

    public Tick getTick() {
        return tick;
    }

    public void setTick(Tick tick) {
        this.tick = tick;
    }
}
