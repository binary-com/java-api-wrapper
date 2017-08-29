package com.binary.api.models.responses;

import com.binary.api.models.enums.JPStatus;
import com.google.gson.annotations.SerializedName;
import com.sun.org.apache.bcel.internal.generic.StackInstruction;
import io.reactivex.annotations.Nullable;

/**
 * <h1>JPAccountStatus</h1>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/4/2017
 */
public class JPAccountStatus {

    /**
     * Status of Japan real money account opening, any of the above.
     */
    @SerializedName("status")
    private String status;

    /**
     * Optional field. When status equals 'jp_knowledge_test_fail', this shows last knowledge test taken time in epoch.
     */
    @SerializedName("last_test_epoch")
    @Nullable
    private Integer lastTestEpoch;

    /**
     * Optional field. When status equals 'jp_knowledge_test_pending' or 'jp_knowledge_test_fail',
     * this shows next available knowledge test time in epoch.
     */
    @SerializedName("next_test_epoch")
    @Nullable
    private Integer nextTextEpoch;

    public String getStatus() {
        return status;
    }

    public void setStatus(JPStatus status) {
        this.status = status.toString();
    }

    public Integer getLastTestEpoch() {
        return lastTestEpoch;
    }

    public void setLastTestEpoch(Integer lastTestEpoch) {
        this.lastTestEpoch = lastTestEpoch;
    }

    public Integer getNextTextEpoch() {
        return nextTextEpoch;
    }

    public void setNextTextEpoch(Integer nextTextEpoch) {
        this.nextTextEpoch = nextTextEpoch;
    }
}
