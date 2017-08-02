package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

import java.math.BigDecimal;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/1/2017
 */
public class ContractForSymbol {
    /**
     * Array of available contracts details
     */
    @SerializedName("available")
    private Contract[] available;

    /**
     * Symbol's next market-close time as an epoch value
     */
    @SerializedName("close")
    @Nullable
    private Integer close;

    /**
     * Symbol's next market-open time as an epoch value
     */
    @SerializedName("open")
    @Nullable
    private Integer open;

    /**
     * Count of contracts available
     */
    @SerializedName("hit_count")
    private int hitCount;

    /**
     * Current spot price for this underlying
     */
    @SerializedName("spot")
    @Nullable
    private BigDecimal spot;

    /**
     * Indicates the feed license for symbol, for example whether its realtime or delayed
     */
    @SerializedName("feed_license")
    private String feedLicense;

    public Contract[] getAvailable() {
        return available;
    }

    public void setAvailable(Contract[] available) {
        this.available = available;
    }

    public Integer getClose() {
        return close;
    }

    public void setClose(Integer close) {
        this.close = close;
    }

    public Integer getOpen() {
        return open;
    }

    public void setOpen(Integer open) {
        this.open = open;
    }

    public int getHitCount() {
        return hitCount;
    }

    public void setHitCount(int hitCount) {
        this.hitCount = hitCount;
    }

    public BigDecimal getSpot() {
        return spot;
    }

    public void setSpot(BigDecimal spot) {
        this.spot = spot;
    }

    public String getFeedLicense() {
        return feedLicense;
    }

    public void setFeedLicense(String feedLicense) {
        this.feedLicense = feedLicense;
    }
}
