package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

import java.math.BigDecimal;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/7/2017
 */
public class PortfolioTransaction {

    /**
     * Binary.com internal contract identifier number (to be used in a Price Proposal - Open Contract API call)
     */
    @SerializedName("contract_id")
    private Long contractId;

    /**
     * It is the transaction id. Every contract (buy or sell) and every payment has a unique id. Example: 10867502908
     */
    @SerializedName("transaction_id")
    private Long transactionId;

    /**
     * Epoch of purchase time
     */
    @SerializedName("time")
    private long time;

    /**
     * Symbol code
     */
    @SerializedName("symbol")
    private String symbol;

    /**
     * Payout price
     */
    @SerializedName("payout")
    private BigDecimal payout;

    /**
     * Buy price
     */
    @SerializedName("buy_price")
    private BigDecimal buyPrice;

    /**
     * Epoch of start date
     */
    @SerializedName("date_start")
    private long dateStart;

    /**
     * Epoch of expiry time
     */
    @SerializedName("expiry_time")
    private long expiryTime;

    /**
     * Contract type
     */
    @SerializedName("contract_type")
    private String contractType;

    /**
     * Contract currency
     */
    @SerializedName("contract_currency")
    private String currency;

    /**
     * Contract description
     */
    @SerializedName("longcode")
    private String longCode;

    /**
     * Id of an app from where this contract was purchased. For example, it's 1 for binary.com.
     */
    @SerializedName("app_id")
    @Nullable
    private Integer appId;

    public Long getContractId() {
        return contractId;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public long getTime() {
        return time;
    }

    public String getSymbol() {
        return symbol;
    }

    public BigDecimal getPayout() {
        return payout;
    }

    public BigDecimal getBuyPrice() {
        return buyPrice;
    }

    public long getDateStart() {
        return dateStart;
    }

    public long getExpiryTime() {
        return expiryTime;
    }

    public String getContractType() {
        return contractType;
    }

    public String getCurrency() {
        return currency;
    }

    public String getLongCode() {
        return longCode;
    }

    public Integer getAppId() {
        return appId;
    }
}
