package com.binary.api.models.requests;

import com.binary.api.models.enums.TickStyles;
import com.binary.api.models.responses.TickHistoryResponse;
import com.binary.api.utils.Validator;
import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

/**
 * <h1>TickHistoryRequest</h1>
 *
 * <h2>Tick History Request</h2>
 * <p>Get historic tick data for a given symbol name</p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/3/2017
 */
public class TickHistoryRequest extends RequestBase {

    /**
     * Short symbol name
     */
    @SerializedName("ticks_history")
    private String symbol;

    /**
     * Epoch value representing the end-datetime of the ticks.
     * If non-numeric value (e.g. "latest", the end-datetime will be the latest available timestamp.
     */
    @SerializedName("end")
    private String end;

    /**
     * Epoch value representing the start-datetime of the ticks (For styles: 'ticks', it will default to 1 day ago.
     * For styles: 'candle', it will default to 1 day ago if count or granularity is undef )
     */
    @SerializedName("start")
    @Nullable
    private Integer start;

    /**
     * An upper limit on ticks to receive (default: 5000)
     */
    @SerializedName("count")
    @Nullable
    private Integer count;

    /**
     * The tick-output style: must be one of 'ticks' or 'candles' (default: 'ticks')
     */
    @SerializedName("style")
    @Nullable
    private String style;

    /**
     * Provide for style: 'candles'. Candle time-dimension width setting.
     * Allowed values 60, 120, 180, 300, 600, 900, 1800, 3600, 7200, 14400, 28800, 86400 (default: '60').
     */
    @SerializedName("granularity")
    @Nullable
    private Integer granularity;

    /**
     * If market is closed at the end time, or license limit is before end time, then move interval backwards.
     */
    @SerializedName("adjust_start_time")
    @Nullable
    private Integer adjustStartTime;

    /**
     * If set to 1, will send updates whenever the price changes
     */
    @SerializedName("subscribe")
    @Nullable
    private Integer subscribe;

    public TickHistoryRequest(String symbol, String end){
        this.responseType = TickHistoryResponse.class;
        this.setSymbol(symbol);
        this.setEnd(end);
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        Validator.checkPattern("^\\w{2,30}$", symbol,
                "Symbol does not match the regex pattern /^\\w{2,30}$/");
        this.symbol = symbol;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        Validator.checkPattern("^(latest|\\d{1,10})$", end,
                "End does not match the regex pattern /^(latest|\\d{1,10})$/");
        this.end = end;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        Validator.checkPattern("^\\d{1,10}$", start.toString(),
                "Start does not match the regex pattern /^\\d{1,10}$/");
        this.start = start;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(TickStyles style) {
        this.style = style.toString().toLowerCase();
    }

    public Integer getGranularity() {
        return granularity;
    }

    public void setGranularity(Integer granularity) {
        this.granularity = granularity;
    }

    public Integer getAdjustStartTime() {
        return adjustStartTime;
    }

    public void setAdjustStartTime(Integer adjustStartTime) {
        Validator.checkPattern("^1?$", adjustStartTime.toString(),
                "AdjustStartTime does not match the regex /^1?$/");
        this.adjustStartTime = adjustStartTime;
    }

    public Integer getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(Integer subscribe) {
        Validator.checkPattern("^1?$", subscribe.toString(),
                "Subscribe does not match the regex /^1?$/");
        this.subscribe = subscribe;
    }
}
