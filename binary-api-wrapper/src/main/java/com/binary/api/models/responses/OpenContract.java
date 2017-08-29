package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/8/2017
 */
public class OpenContract {

    /**
     * High barrier of the contract (if any). Example: 42.123
     */
    @SerializedName("high_barrier")
    private BigDecimal highBarrier;

    /**
     * Low barrier of the contract (if any). Example: 40.132
     */
    @SerializedName("low_barrier")
    private BigDecimal lowBarrier;

    /**
     * Barrier of the contract (if any). Example: 42.123
     */
    @SerializedName("barrier")
    private BigDecimal barrier;

    /**
     * The number of barriers a contract has. Example: 2
     */
    @SerializedName("barrier_count")
    private Integer barrierCount;

    /**
     * Price at which the contract could be sold back to Binary.com. Example: 5.14
     */
    @SerializedName("bid_price")
    private BigDecimal bidPrice;

    /**
     * Binary.com internal contract identifier
     */
    @SerializedName("contract_id")
    private Long contractId;

    /**
     * Contract type, for example CALL, PUT
     */
    @SerializedName("contract_type")
    private String contractType;

    /**
     * Example: USD
     */
    @SerializedName("currency")
    private String currency;

    /**
     * Spot value if we have license to stream this symbol. Example: 9874.52
     */
    @SerializedName("current_spot")
    private BigDecimal currentSpot;

    /**
     * Example: 1439999052
     */
    @SerializedName("current_spot_time")
    private Long currentSpotTime;

    /**
     * Example: 9874.52
     */
    @SerializedName("entry_spot")
    private Long entrySpot;

    /**
     * Expiry date (epoch) of the Contract. Example: 1446629000.
     * Please note that it is not applicable for tick trade contracts.
     */
    @SerializedName("expiry_date")
    private Long expiryDate;

    /**
     * Settlement date (epoch) of the contract. Example: 1446629000
     */
    @SerializedName("date_setelment")
    private Long dateSetelment;

    /**
     * Start date (epoch) of the contract. Example: 1446629000
     */
    @SerializedName("date_start")
    private Long dateStart;

    /**
     * A stream id that can be used to cancel this stream using the Forget request.
     * Example: 1d6651e7d599bce6c54bd71a8283e579
     */
    @SerializedName("id")
    private String id;

    /**
     * Whether the contract is expired or not. Boolean value 1 or 0
     */
    @SerializedName("is_expired")
    private int isExpired;

    /**
     * Whether the contract is settleable or not. Boolean value 1 or 0
     */
    @SerializedName("is_settleable")
    private int isSettleable;

    /**
     * Whether the contract is forward-starting or not. Boolean value 1 or 0
     */
    @SerializedName("is_forward_starting")
    private int isFrowardStarting;

    /**
     * Whether the contract is an intraday contract. Boolean value 1 or 0
     */
    @SerializedName("is_intraday")
    private int isIntraday;

    /**
     * Whether the contract expiry price will depend on the path of the market
     * (e.g. One Touch contract). Boolean value 1 or 0
     */
    @SerializedName("is_path_dependent")
    private int isPathDependent;

    /**
     * Whether the contract can be sold back to Binary.com. Boolean value 1 or 0
     */
    @SerializedName("is_valid_to_sell")
    private int isValidToSell;

    /**
     * Text description of the contract purchased,
     * Example: Win payout if Volatility 100 Index is strictly higher than entry spot at 10 minutes after contract start time.
     */
    @SerializedName("longcode")
    private String longCode;

    /**
     * Payout value of the contract. Example: 10.50
     */
    @SerializedName("payout")
    private BigDecimal payout;

    /**
     * Coded description of the contract purchased, Example: CALL_R_100_90_1446704187_1446704787_S0P_0
     */
    @SerializedName("shortcode")
    private String shortCode;

    /**
     * Example: 5.14, same as ask_price
     */
    @SerializedName("display_value")
    private BigDecimal displayValue;

    /**
     * Example: BSESENSEX30
     */
    @SerializedName("underlying")
    private String underlying;

    /**
     * display_name
     */
    @SerializedName("display_name")
    private String displayName;

    /**
     * This is the entry spot of the contract.
     * For contracts starting immediately it is the next tick after the start time.
     * For forward-starting contracts it is the spot at the start time. Example: 86.630.
     */
    @SerializedName("entry_tick")
    private BigDecimal entryTick;

    /**
     * This is the epoch time of the entry tick. Example: 1446629000
     */
    @SerializedName("entry_tick_time")
    private Long entryTickTime;

    /**
     * This is the latest spot value at the end time of the contract. Example: 86.810
     */
    @SerializedName("exit_tick")
    private BigDecimal exitTick;

    /**
     * This is the epoch time of the exit tick.
     * Note that since certain instruments don't tick every second, the exit tick time may be a few seconds before the end time. Example: 1446629000
     */
    @SerializedName("exit_tick_time")
    private Long exitTickTime;

    /**
     * Only for tick trades, number of ticks
     */
    @SerializedName("tick_count")
    private Integer tickCount;

    /**
     * Error message if validation fails
     */
    @SerializedName("validation_error")
    private String validationError;

    /**
     * Price at which contract was sold, only available when contract has been sold.
     */
    @SerializedName("sell_price")
    private BigDecimal sellPrice;

    /**
     * Price at which contract was purchased
     */
    @SerializedName("buy_price")
    private BigDecimal buyPrice;

    /**
     * Epoch of purchase time, will be same as date_start for all contracts except forward starting contracts.
     */
    @SerializedName("purchase_time")
    private Long purchaseTime;

    /**
     * Epoch time of when the contract was sold (only present for contracts already sold)
     */
    @SerializedName("sell_time")
    private Long sellTime;

    /**
     * Latest spot value at the sell time. Example: 86.630 (only present for contracts already sold)
     */
    @SerializedName("sell_spot")
    private BigDecimal sellSpot;

    /**
     * Epoch time of the sell spot.
     * Note that since certain underlyings don't tick every second, the sell spot time may be a few seconds before the sell time.
     * Example: 1446629000 (only present for contracts already sold)
     */
    @SerializedName("sell_spot_time")
    private Long sellSpotTime;

    /**
     * Every contract has buy and sell transaction ids,
     * i.e. when you purchase a contract we associate it with buy transaction id,
     * and if contract is already sold we associate that with sell transaction id.
     */
    @SerializedName("transaction_ids")
    private Map<String, Long> transactionIds;

    public BigDecimal getHighBarrier() {
        return highBarrier;
    }

    public BigDecimal getLowBarrier() {
        return lowBarrier;
    }

    public BigDecimal getBarrier() {
        return barrier;
    }

    public Integer getBarrierCount() {
        return barrierCount;
    }

    public BigDecimal getBidPrice() {
        return bidPrice;
    }

    public Long getContractId() {
        return contractId;
    }

    public String getContractType() {
        return contractType;
    }

    public String getCurrency() {
        return currency;
    }

    public BigDecimal getCurrentSpot() {
        return currentSpot;
    }

    public Long getCurrentSpotTime() {
        return currentSpotTime;
    }

    public Long getEntrySpot() {
        return entrySpot;
    }

    public Long getExpiryDate() {
        return expiryDate;
    }

    public Long getDateSetelment() {
        return dateSetelment;
    }

    public Long getDateStart() {
        return dateStart;
    }

    public String getId() {
        return id;
    }

    public boolean isExpired() {
        return isExpired == 1 ? true : false;
    }

    public boolean isSettleable() {
        return isSettleable == 1 ? true : false;
    }

    public boolean isFrowardStarting() {
        return isFrowardStarting == 1 ? true : false;
    }

    public boolean isIntraday() {
        return isIntraday == 1 ? true : false;
    }

    public boolean isPathDependent() {
        return isPathDependent == 1 ? true : false;
    }

    public boolean isValidToSell() {
        return isValidToSell ==  1 ? true : false;
    }

    public String getLongCode() {
        return longCode;
    }

    public BigDecimal getPayout() {
        return payout;
    }

    public String getShortCode() {
        return shortCode;
    }

    public BigDecimal getDisplayValue() {
        return displayValue;
    }

    public String getUnderlying() {
        return underlying;
    }

    public String getDisplayName() {
        return displayName;
    }

    public BigDecimal getEntryTick() {
        return entryTick;
    }

    public Long getEntryTickTime() {
        return entryTickTime;
    }

    public BigDecimal getExitTick() {
        return exitTick;
    }

    public Long getExitTickTime() {
        return exitTickTime;
    }

    public Integer getTickCount() {
        return tickCount;
    }

    public String getValidationError() {
        return validationError;
    }

    public BigDecimal getSellPrice() {
        return sellPrice;
    }

    public BigDecimal getBuyPrice() {
        return buyPrice;
    }

    public Long getPurchaseTime() {
        return purchaseTime;
    }

    public Long getSellTime() {
        return sellTime;
    }

    public BigDecimal getSellSpot() {
        return sellSpot;
    }

    public Long getSellSpotTime() {
        return sellSpotTime;
    }

    public Map<String, Long> getTransactionIds() {
        return transactionIds;
    }
}
