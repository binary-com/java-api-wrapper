package com.binary.api.models.responses;

import com.binary.api.models.requests.PaymentAgentListRequest;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/2/2017
 */
public class PaymentAgentListResponse extends ResponseBase<PaymentAgentListRequest> {

    /**
     * Payment Agent List
     */
    @SerializedName("paymentagent_list")
    private PaymentAgentList paymentAgentList;

    public PaymentAgentList getPaymentAgentList() {
        return paymentAgentList;
    }

    public class PaymentAgentList {
        @SerializedName("available_countries")
        private List<List<String>> availableCountries;

        @SerializedName("list")
        private List<PaymentAgent> paymentAgents;

        public List<List<String>> getAvailableCountries() {
            return availableCountries;
        }

        public List<PaymentAgent> getPaymentAgents() {
            return paymentAgents;
        }
    }
}
