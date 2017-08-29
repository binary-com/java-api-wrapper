package com.binary.api;

import com.binary.api.models.requests.AuthorizeRequest;
import com.binary.api.models.requests.SellContractForMultipleAccountsRequest;
import com.binary.api.models.requests.SellContractRequest;
import com.binary.api.models.requests.SellExpiredContractsRequest;
import com.binary.api.models.responses.*;
import com.google.gson.Gson;
import io.reactivex.observers.TestObserver;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/9/2017
 */
public class SellContractTest extends TestBase {

    // FIXME Test it through websocket instead of static data
    @Test
    public void sellContractForMultipleAccounts() throws Exception {
        Gson gson = new Gson();
        SellContractForMultipleAccountsRequest request = gson.fromJson(getMassJsonRequest(),
                SellContractForMultipleAccountsRequest.class);
        SellContractForMultipleAccountsResponse response = gson.fromJson(getMassJsonResult(),
                SellContractForMultipleAccountsResponse.class);

        assertEquals(request.getPrice(), response.getRequest().getPrice());
    }

    @Test
    public void failedSellContractTest() throws Exception {
        AuthorizeRequest authRequest = new AuthorizeRequest(properties.getProperty("CR_TRADE"));
        SellContractRequest request = new SellContractRequest(11542203588L, new BigDecimal("50"));
        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        this.api.sendRequest(authRequest)
                .subscribe( o -> {
                    AuthorizeResponse auth = (AuthorizeResponse) o;
                    assertNotEquals(auth.getAuthorize(), null);

                    this.api.sendRequest(request)
                            .subscribe(testObserver);
                });

        testObserver.await(5, TimeUnit.SECONDS);

        SellContractResponse response = (SellContractResponse) testObserver.values().get(0);

        assertEquals(response.getType(), "sell");
        assertNotEquals(response.getError(), null);
        assertEquals(response.getError().getCode(), "InvalidSellContractProposal");
    }

    @Test
    public void sellExpiredContractTest() throws Exception {
        AuthorizeRequest authRequest = new AuthorizeRequest(properties.getProperty("CR_TRADE"));
        SellExpiredContractsRequest request = new SellExpiredContractsRequest();
        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        this.api.sendRequest(authRequest)
                .subscribe( o -> {
                    AuthorizeResponse auth = (AuthorizeResponse) o;
                    assertNotEquals(auth.getAuthorize(), null);

                    this.api.sendRequest(request)
                            .subscribe(testObserver);
                });

        testObserver.await(5, TimeUnit.SECONDS);

        SellExpiredContractsResponse response = (SellExpiredContractsResponse) testObserver.values().get(0);

        assertEquals(response.getType(), "sell_expired");
        assertEquals(response.getError(), null);
        assertTrue(response.getResult() >= new Integer(0));
    }

    private String getMassJsonRequest() {
        return "{\n" +
                "  \"sell_contract_for_multiple_accounts\": 1,\n" +
                "  \"shortcode\": \"CALL_R_100_0.66_1502244892_1502245012_S0P_0\",\n" +
                "  \"tokens\": [\n" +
                "    \"yyvDHKC9cl6eErL\",\n" +
                "    \"JUBibibkebiuwbeCNEc\"\n" +
                "  ],\n" +
                "  \"price\": 0.35\n" +
                "}";
    }

    private String getMassJsonResult() {
        return "{\n" +
                "  \"echo_req\": {\n" +
                "    \"price\": 0.35,\n" +
                "    \"sell_contract_for_multiple_accounts\": 1,\n" +
                "    \"shortcode\": \"CALL_R_100_0.66_1502244892_1502245012_S0P_0\",\n" +
                "    \"tokens\": [\n" +
                "      \"yyvDHKC9cl6eErL\",\n" +
                "      \"JUBibibkebiuwbeCNEc\"\n" +
                "    ]\n" +
                "  },\n" +
                "  \"msg_type\": \"sell_contract_for_multiple_accounts\",\n" +
                "  \"sell_contract_for_multiple_accounts\": {\n" +
                "    \"result\": [\n" +
                "      {\n" +
                "        \"balance_after\": \"9997.92\",\n" +
                "        \"contract_id\": \"16752745128\",\n" +
                "        \"reference_id\": \"33427748228\",\n" +
                "        \"sell_price\": \"0.49\",\n" +
                "        \"sell_time\": \"2017-08-09 02:15:42\",\n" +
                "        \"transaction_id\": \"33427792408\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"code\": \"InvalidToken\",\n" +
                "        \"message_to_client\": {},\n" +
                "        \"token\": \"JUBibibkebiuwbeCNEc\"\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "}";
    }
}
