package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

import java.math.BigDecimal;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/8/2017
 */
public class ProfitTableTransaction {

    /**
     * It is the transaction id. every contract (buy or sell) and every payment has a unique id. Example: 10867502908
     */
    @SerializedName("transaction_id")
    private String transactionId;

    /**
     * It is the contract id Example: 4867502908
     */
    @SerializedName("contract_id")
    private String contractId;

    /**
     * It is the purchase time of transaction
     */
    @SerializedName("purchase_time")
    private Long purchaseTime;

    /**
     * It is the sell time of transaction
     */
    @SerializedName("sell_time")
    @Nullable
    private Long sellTime;

    /**
     * Buy price
     */
    @SerializedName("buy_price")
    private BigDecimal buyPrice;

    /**
     * Sold price
     */
    @SerializedName("sell_price")
    private BigDecimal sellPrice;

    /**
     * The description of contract purchased if description is set to 1
     */
    @SerializedName("longcode")
    private String longCode;

    /**
     * Compact description of the contract purchased if description is set to 1
     */
    @SerializedName("shortcode")
    private String shortCode;

    /**
     * Payout price
     */
    @SerializedName("payout")
    private BigDecimal payout;

    /**
     * App id of app where this transaction was performed. For example, it's 1 for binary.com.
     */
    @SerializedName("app_id")
    @Nullable
    private Integer applicationId;

}
