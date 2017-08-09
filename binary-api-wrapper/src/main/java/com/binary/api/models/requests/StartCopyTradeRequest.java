package com.binary.api.models.requests;

import com.binary.api.models.responses.StartCopyTradeResponse;
import com.binary.api.utils.Validator;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.List;

/**
 * <h1>StartCopyTradeRequest</h1>
 *
 * <h2>Copy Start Send</h2>
 * <p>
 *     Start copy trader bets
 * </p>
 *
 *
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/9/2017
 */
public class StartCopyTradeRequest extends RequestBase {

    /**
     * API tokens identifying the accounts of trader which will be used to copy trades
     *
     */
    @SerializedName("copy_start")
    private String traderToken;

    /**
     * Optional field, used to set minimal trade stake to be copied
     *
     */
    @SerializedName("min_trade_stake")
    private BigDecimal minTradeStake;

    /**
     * Optional field, used to set maximum trade stake to be copied
     *
     */
    @SerializedName("max_trade_stake")
    private BigDecimal maxTradeStake;

    /**
     * Optional field, used to set assets to be copied. E.x ["frxUSDJPY", "R_50"]
     *
     */
    @SerializedName("assets")
    private List<String> assets;

    /**
     * Optional field, used to set trade types to be copied. E.x ["CALL", "PUT"]
     *
     */
    @SerializedName("trade_types")
    private List<String> tradeTypes;

    private StartCopyTradeRequest() {
        this.responseType = StartCopyTradeResponse.class;
    }

    public StartCopyTradeRequest(String traderToken) {
        this();
        this.setTraderToken(traderToken);
    }

    public String getTraderToken() {
        return traderToken;
    }

    public void setTraderToken(String traderToken) {
        Validator.checkPattern("^[\\w\\s-]{15,32}$", traderToken,
                "Trader Token does not match the regex pattern /^[\\w\\s-]{15,32}$/");
        this.traderToken = traderToken;
    }

    public BigDecimal getMinTradeStake() {
        return minTradeStake;
    }

    public void setMinTradeStake(BigDecimal minTradeStake) {
        this.minTradeStake = minTradeStake;
    }

    public BigDecimal getMaxTradeStake() {
        return maxTradeStake;
    }

    public void setMaxTradeStake(BigDecimal maxTradeStake) {
        this.maxTradeStake = maxTradeStake;
    }

    public List<String> getAssets() {
        return assets;
    }

    public void setAssets(List<String> assets) {
        this.assets = assets;
    }

    public List<String> getTradeTypes() {
        return tradeTypes;
    }

    public void setTradeTypes(List<String> tradeTypes) {
        this.tradeTypes = tradeTypes;
    }
}
