package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;
import com.sun.org.apache.bcel.internal.generic.StackInstruction;

import java.math.BigDecimal;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/2/2017
 */
public class PaymentAgent {

    @SerializedName("currencies")
    private String currencies;

    @SerializedName("deposit_commission")
    private String depositCommission;

    @SerializedName("email")
    private String email;

    @SerializedName("further_information")
    private String furtherInformation;

    @SerializedName("max_withdrawal")
    private BigDecimal maxWithdrawal;

    @SerializedName("min_withdrawal")
    private BigDecimal minWithdrawal;

    @SerializedName("name")
    private String name;

    @SerializedName("paymentagent_loginid")
    private String paymentAgentLoginId;

    @SerializedName("summary")
    private String summary;

    @SerializedName("supported_banks")
    private String supportedBanks;

    @SerializedName("telephone")
    private String telephone;

    @SerializedName("url")
    private String url;

    @SerializedName("withdrawal_commission")
    private String withdrawalCommission;

    public String getCurrencies() {
        return currencies;
    }

    public String getDepositCommission() {
        return depositCommission;
    }

    public String getEmail() {
        return email;
    }

    public String getFurtherInformation() {
        return furtherInformation;
    }

    public BigDecimal getMaxWithdrawal() {
        return maxWithdrawal;
    }

    public BigDecimal getMinWithdrawal() {
        return minWithdrawal;
    }

    public String getName() {
        return name;
    }

    public String getPaymentAgentLoginId() {
        return paymentAgentLoginId;
    }

    public String getSummary() {
        return summary;
    }

    public String getSupportedBanks() {
        return supportedBanks;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getUrl() {
        return url;
    }

    public String getWithdrawalCommission() {
        return withdrawalCommission;
    }
}
