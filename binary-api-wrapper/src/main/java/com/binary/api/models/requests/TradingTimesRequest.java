package com.binary.api.models.requests;

import com.binary.api.models.responses.TradingTimesResponse;
import com.binary.api.utils.Validator;
import com.google.gson.annotations.SerializedName;

/**
 * <h1>TradingTimesRequest</h1>
 *
 * <h2>Trading Times Send</h2>
 * <p>Receive a list of marketing opening times for a given date</p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/3/2017
 */
public class TradingTimesRequest extends RequestBase {

    /**
     * Trading date in yyyy-mm-dd format (or use 'today' for trading times for today's date).
     */
    @SerializedName("trading_times")
    private String tradingDate;

    public TradingTimesRequest() {
        this.setResponseType(TradingTimesResponse.class);
    }

    public TradingTimesRequest(String tradingDate) {
        this();
        this.setTradingDate(tradingDate);
    }

    public String getTradingDate() {
        return tradingDate;
    }

    public void setTradingDate(String tradingDate) {
        Validator.checkPattern("^(\\d{4}-\\d{1,2}-\\d{1,2}|today)$", tradingDate,
                "Trading Date does not match the regex pattern /^(\\d{4}-\\d{1,2}-\\d{1,2}|today)$/");
        this.tradingDate = tradingDate;
    }
}
