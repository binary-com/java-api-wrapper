package com.binary.api.models.requests;

import com.binary.api.models.enums.BasisTypes;
import com.binary.api.models.enums.DurationUnits;
import com.binary.api.models.responses.PriceProposalResponse;
import com.binary.api.utils.Validator;
import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

import java.math.BigDecimal;

/**
 * <h1>PriceProposalRequest</h1>
 *
 * <h2>Get latest price for a specific contract</h2>
 * <p>Get latest price for a specific contract</p>
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/2/2017
 */
public class PriceProposalRequest extends RequestBase {

    @SerializedName("proposal")
    private final int proposal = 1;

    /**
     * 1 - to initiate a realtime stream of prices.
     * Note that tick trades, digit trades and less than 24 hours at-the-money contracts for
     * the following underlying symbols are not streamed: R_100 R_50 R_25 R_75 RDBULL RDBEAR
     * (this is because their price is constant).
     */
    @SerializedName("subscribe")
    @Nullable
    private Integer subscribe = null;

    /**
     * Proposed contract payout or stake value
     */
    @SerializedName("amount")
    private BigDecimal amount;

    /**
     * Indicate whether amount is 'payout' or 'stake'
     */
    @SerializedName("basis")
    private String basis;

    /**
     * A valid contract-type
     */
    @SerializedName("contract_type")
    private String contractType;

    /**
     * This can only be the account-holder's currency
     */
    @SerializedName("currency")
    private String currency;

    /**
     * For forward-starting contracts, epoch value of the starting time of the contract.
     */
    @SerializedName("date_start")
    @Nullable
    private Integer dateStart;

    /**
     * Epoch value of the expiry time of the contract. You must either specify date_expiry or duration.
     */
    @SerializedName("date_expiry")
    @Nullable
    private Integer dateExpiry;

    /**
     * Duration quantity
     */
    @SerializedName("duration")
    private int duration;

    /**
     * Duration unit is s(seconds), m(minutes), h(hours), d(days), t(ticks).
     * If this parameter is not set then duration will be counted as seconds.
     */
    @SerializedName("duration_unit")
    private String durationUnit;

    /**
     * Symbol code
     */
    @SerializedName("symbol")
    private String symbol;

    /**
     * Barrier for the contract (or last digit prediction for digit contracts).
     * Contracts less than 24 hours in duration would need a relative barrier (barriers which need +/-),
     * meaning that the entry spot would be adjusted accordingly with that amount to define a barrier.
     */
    @SerializedName("barrier")
    private String barrier;

    /**
     * Low barrier for the contract (for contracts with two barriers).
     * Contracts less than 24 hours in duration would need a relative barrier (barriers which need +/-),
     * meaning that the entry spot would be adjusted accordingly with that amount to define a barrier.
     */
    @SerializedName("barrier2")
    private String barrier2;

    /**
     * [For japan only] An epoch value of a predefined trading period start time
     */
    @SerializedName("trading_period_start")
    private String tradingPeriodStart;

    public PriceProposalRequest() {
        this.responseType = PriceProposalResponse.class;
    }

    public PriceProposalRequest(String symbol, BigDecimal amount, BasisTypes basis, String contractType,
                                String currency, int duration, DurationUnits durationUnit) {
        this();
        this.setSymbol(symbol);
        this.setAmount(amount);
        this.setBasis(basis);
        this.setContractType(contractType);
        this.setCurrency(currency);
        this.setDuration(duration);
        this.setDurationUnit(durationUnit);
    }

    public Integer getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(Integer subscribe) {
        this.subscribe = subscribe;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        Validator.checkPattern("^[0-9]+([.][0-9]+)?$", amount.toString(),
                "Amount does not match the regex pattern /^[0-9]+([.][0-9]+)?$/");
        this.amount = amount;
    }

    public String getBasis() {
        return basis;
    }

    public void setBasis(BasisTypes basis) {
        this.basis = basis.toString().toLowerCase();
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        Validator.checkPattern("^\\w{2,30}$", contractType,
                "ContractType does not match regex pattern /^\\w{2,30}$/");
        this.contractType = contractType;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        Validator.checkPattern("^[A-Z]{3}$", currency,
                "Currency does not match the regex pattern /^[A-Z]{3}$/");
        this.currency = currency;
    }

    public int getDateStart() {
        return dateStart;
    }

    public void setDateStart(int dateStart) {
        Validator.checkPattern("^\\d{1,10}$", Integer.toString(dateStart),
                "Date Start does not match the regex pattern /^\\d{1,10}$/");
        this.dateStart = dateStart;
    }

    public int getDateExpiry() {
        return dateExpiry;
    }

    public void setDateExpiry(int dateExpiry) {
        Validator.checkPattern("^\\d{1,10}$", Integer.toString(dateStart),
                "Date Expiry does not match the regex pattern /^\\d{1,10}$/");
        this.dateExpiry = dateExpiry;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDurationUnit() {
        return durationUnit;
    }

    public void setDurationUnit(DurationUnits durationUnit) {
        this.durationUnit = durationUnit.toString().toLowerCase().substring(0, 1);
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        Validator.checkPattern("^\\w{2,30}$", symbol,
                "Symbol does not match the regex pattern /^\\w{2,30}$/");
        this.symbol = symbol;
    }

    public String getBarrier() {
        return barrier;
    }

    public void setBarrier(String barrier) {
        Validator.checkPattern("^[+-]?\\d+\\.?\\d*$", barrier,
                "Barrier does not match the regex pattern /^[+-]?\\d+\\.?\\d*$/");
        this.barrier = barrier;
    }

    public String getBarrier2() {
        return barrier2;
    }

    public void setBarrier2(String barrier2) {
        Validator.checkPattern("^[+-]?\\d+\\.?\\d*$", barrier,
                "Barrier2 does not match the regex pattern /^[+-]?\\d+\\.?\\d*$/");
        this.barrier2 = barrier2;
    }

    public String getTradingPeriodStart() {
        return tradingPeriodStart;
    }

    public void setTradingPeriodStart(String tradingPeriodStart) {
        this.tradingPeriodStart = tradingPeriodStart;
    }
}
