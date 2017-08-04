package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

import java.math.BigDecimal;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/4/2017
 */
public class Balance {

    /**
     * Balance amount
     */
    @SerializedName("balance")
    private BigDecimal balance;

    /**
     * Currency Example: USD
     */
    @SerializedName("currency")
    private String currency;

    /**
     * Client loginid Example: CR000000
     */
    @SerializedName("loginid")
    private String loginId;

    /**
     * A stream id that can be used to cancel this stream using the Forget request.
     * Example: 1d6651e7d599bce6c54bd71a8283e579
     */
    @SerializedName("id")
    @Nullable
    private String id;

    public BigDecimal getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public String getLoginId() {
        return loginId;
    }

    public String getId() {
        return id;
    }
}
