package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/3/2017
 */
public class AccountLimits {

    /**
     * Maximum account cash balance
     */
    @SerializedName("account_balance")
    private BigDecimal accountBalance;

    /**
     * Maximum daily turnover
     */
    @SerializedName("daily_turnover")
    private BigDecimal dailyTurnover;

    /**
     * Maximum number of open positions
     */
    @SerializedName("open_positions")
    private int openPositions;

    /**
     * Maximum aggregate payouts on open positions
     */
    @SerializedName("payout")
    private BigDecimal payout;

    /**
     * Maximum aggregate payouts on open positions per symbol and contract type.
     * This limit can be exceeded up to the overall payout limit if there is no prior open position.
     */
    @SerializedName("payout_per_symbol_and_contract_type")
    private BigDecimal payoutPerSymbolAndContractType;

    /**
     * Lifetime withdrawal limit
     */
    @SerializedName("lifetime_limit")
    private BigDecimal lifetimeLimit;

    /**
     * Number of days for num_of_days_limit withdrawal limit
     */
    @SerializedName("num_of_days")
    private int numOfDays;

    /**
     * Withdrawal limit for num_of_days days
     */
    @SerializedName("num_of_days_limit")
    private int numOfDaysLimit;

    /**
     * Amount left to reach withdrawal limit
     */
    @SerializedName("remainder")
    private BigDecimal remainder;

    /**
     * Total withdrawal for num_of_days days
     */
    @SerializedName("withdrawal_for_x_days_monetary")
    private BigDecimal withdrawalForXDaysMonetary;

    /**
     * Total withdrawal since inception
     */
    @SerializedName("withdrawal_since_inception_monetary")
    private BigDecimal withdrawalSinceInceptionMonetary;

    /**
     * Markets Limits
     */
    @SerializedName("market_specific")
    private Map<String, List<MarketSpecific>> marketSpecific;

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public BigDecimal getDailyTurnover() {
        return dailyTurnover;
    }

    public int getOpenPositions() {
        return openPositions;
    }

    public BigDecimal getPayout() {
        return payout;
    }

    public BigDecimal getPayoutPerSymbolAndContractType() {
        return payoutPerSymbolAndContractType;
    }

    public BigDecimal getLifetimeLimit() {
        return lifetimeLimit;
    }

    public int getNumOfDays() {
        return numOfDays;
    }

    public int getNumOfDaysLimit() {
        return numOfDaysLimit;
    }

    public BigDecimal getRemainder() {
        return remainder;
    }

    public BigDecimal getWithdrawalForXDaysMonetary() {
        return withdrawalForXDaysMonetary;
    }

    public BigDecimal getWithdrawalSinceInceptionMonetary() {
        return withdrawalSinceInceptionMonetary;
    }

    public Map<String, List<MarketSpecific>> getMarketSpecific() {
        return marketSpecific;
    }
}
