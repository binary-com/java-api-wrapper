package com.binary.api.models.requests;

import com.binary.api.models.enums.BasisTypes;
import com.binary.api.models.enums.DurationUnits;
import com.binary.api.utils.Validator;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/8/2017
 */
public class BuyContractParameters {

    /**
     * Proposed payout or stake value
     *
     */
    @SerializedName("amount")
    private BigDecimal amount;

    /**
     * Indicate whether amount is 'payout' or 'stake'
     *
     */
    @SerializedName("basis")
    private String basis;

    /**
     * A valid contract-type
     *
     */
    @SerializedName("contract_type")
    private String contractType;

    /**
     * This can only be the account-holder's currency
     *
     */
    @SerializedName("currency")
    private String currency;

    /**
     * For forward-starting contracts, epoch value of the starting time of the contract.
     *
     */
    @SerializedName("date_start")
    private Long dateStart;

    /**
     * Epoch value of the expiry time of the contract. You must either specify date_expiry or duration.
     *
     */
    @SerializedName("date_expiry")
    private Long dateExpiry;

    /**
     * Duration quantity
     *
     */
    @SerializedName("duration")
    private Integer duration;

    /**
     * Duration unit is s(seconds), m(minutes), h(hours), d(days), t(ticks)
     */
    @SerializedName("duration_unit")
    private String durationUnit;

    /**
     * Symbol code
     *
     */
    @SerializedName("symbol")
    private String symbol;

    /**
     * Barrier for the contract (or last digit prediction for digit contracts). Contracts less than 24 hours in duration would need a relative barrier (barriers which need +/-), meaning that the entry spot would be adjusted accordingly with that amount to define a barrier.
     *
     */
    @SerializedName("barrier")
    private String barrier;

    /**
     * Low barrier for the contract (for contracts with two barriers). Contracts less than 24 hours in duration would need a relative barrier (barriers which need +/-), meaning that the entry spot would be adjusted accordingly with that amount to define a barrier.
     *
     */
    @SerializedName("barrier2")
    private String barrier2;

    /**
     * [For japan only] An epoch value of a predefined trading period start time
     *
     */
    @SerializedName("trading_period_start")
    private Long tradingPeriodStart;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getBasis() {
        return basis;
    }

    public void setBasis(BasisTypes basis) {
        this.basis = basis.toString();
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        Validator.checkPattern("^\\w{2,30}$", contractType,
                "Contract Type does not match the regex pattern /^\\w{2,30}$/");
        this.contractType = contractType;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        Validator.checkPattern("^[A-Z]{3}$", contractType,
                "Currency does not match the regex pattern /^[A-Z]{3}$/");
        this.currency = currency;
    }

    public Long getDateStart() {
        return dateStart;
    }

    public void setDateStart(Long dateStart) {
        this.dateStart = dateStart;
    }

    public Long getDateExpiry() {
        return dateExpiry;
    }

    public void setDateExpiry(Long dateExpiry) {
        this.dateExpiry = dateExpiry;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getDurationUnit() {
        return durationUnit;
    }

    public void setDurationUnit(DurationUnits durationUnit) {
        this.durationUnit = durationUnit.toString();
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        Validator.checkPattern("^\\w{2,30}", contractType,
                "Symbol does not match the regex pattern /^\\w{2,30}/");
        this.symbol = symbol;
    }

    public String getBarrier() {
        return barrier;
    }

    public void setBarrier(String barrier) {
        Validator.checkPattern("^[+-]?\\d+\\.?\\d*$", contractType,
                "Barrier does not match the regex pattern /^[+-]?\\d+\\.?\\d*$/");
        this.barrier = barrier;
    }

    public String getBarrier2() {
        return barrier2;
    }

    public void setBarrier2(String barrier2) {
        Validator.checkPattern("^[+-]?\\d+\\.?\\d*$", contractType,
                "Barrier2 does not match the regex pattern /^[+-]?\\d+\\.?\\d*$/");
        this.barrier2 = barrier2;
    }

    public Long getTradingPeriodStart() {
        return tradingPeriodStart;
    }

    public void setTradingPeriodStart(Long tradingPeriodStart) {
        this.tradingPeriodStart = tradingPeriodStart;
    }
}
