package com.binary.api.models.responses;

import com.binary.api.models.requests.TradingTimesRequest;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * <h1>TradingTimesResponse</h1>
 *
 * <h2>Trading Times Receive</h2>
 * <p>A message with Trading Times</p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/3/2017
 */
public class TradingTimesResponse extends ResponseBase<TradingTimesRequest> {

    /**
     * The trading times structure is a hierarchy as follows: Market -> SubMarket -> Underlyings
     */
    @SerializedName("trading_times")
    private TradingTimes tradingTimes;

    public TradingTimes getTradingTimes() {
        return tradingTimes;
    }


    public class TradingTimes {

        @SerializedName("markets")
        private List<Market> markets;

        public List<Market> getMarkets() {
            return markets;
        }
    }
}
