package com.binary.api.models.responses;

import com.binary.api.models.requests.PriceProposalRequest;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/2/2017
 */
public class Proposal {

    /**
     * Example: Win payout if Random 100 Index is strictly higher than entry spot at 15 minutes after contract start time.
     */
    @SerializedName("longcode")
    private String longCode;

    /**
     * Spot value (if there are no Exchange data-feed licensing restrictions for the underlying symbol).
     * Example: 9874.52
     */
    @SerializedName("spot")
    private BigDecimal spot;

    /**
     * Example: 1439999052
     */
    @SerializedName("spot_time")
    private int spotTime;

    /**
     * Example: 5.14
     */
    @SerializedName("ask_price")
    private BigDecimal askPrice;

    /**
     * Example: 5.14, same as ask_price
     */
    @SerializedName("display_value")
    private BigDecimal displayValue;

    /**
     * Example: 1439999053
     */
    @SerializedName("date_start")
    private int dateStart;

    /**
     * A stream id that can be used to cancel this stream using the Forget request. Example: 1d6651e7d599bce6c54bd71a8283e579
     */
    @SerializedName("id")
    private String id;

    /**
     * Example: 10
     */
    @SerializedName("payout")
    private BigDecimal payout;

    public String getLongCode() {
        return longCode;
    }

    public BigDecimal getSpot() {
        return spot;
    }

    public int getSpotTime() {
        return spotTime;
    }

    public BigDecimal getAskPrice() {
        return askPrice;
    }

    public BigDecimal getDisplayValue() {
        return displayValue;
    }

    public int getDateStart() {
        return dateStart;
    }

    public String getId() {
        return id;
    }

    public BigDecimal getPayout() {
        return payout;
    }
}
