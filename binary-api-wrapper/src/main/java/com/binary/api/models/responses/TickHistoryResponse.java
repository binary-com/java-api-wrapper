package com.binary.api.models.responses;

import com.binary.api.models.requests.TickHistoryRequest;
import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

import java.util.List;

/**
 * <h1>TickHistoryResponse</h1>
 *
 * <h2>Tick History Response</h2>
 * <p>Historic tick data for a single symbol</p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/3/2017
 */
public class TickHistoryResponse extends ResponseBase<TickHistoryRequest> {

    /**
     * Historic tick data for a given symbol
     */
    @SerializedName("history")
    @Nullable
    private History history;

    /**
     * Array of OHLC (open/high/low/close) price values for the given time (only for style='candles')
     */
    @SerializedName("candles")
    @Nullable
    private List<Candle> candles;

    public History getHistory() {
        return history;
    }

    public List<Candle> getCandles() {
        return candles;
    }
}
