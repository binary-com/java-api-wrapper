package com.binary.api;

import com.binary.api.models.requests.AuthorizeRequest;
import com.binary.api.models.requests.BuyContractForMultipleAccountsRequest;
import com.binary.api.models.requests.BuyContractParameters;
import com.binary.api.models.requests.BuyContractRequest;
import com.binary.api.models.responses.AuthorizeResponse;
import com.binary.api.models.responses.BuyContractForMultipleAccountsResponse;
import com.binary.api.models.responses.BuyContractResponse;
import com.binary.api.models.responses.ResponseBase;
import com.google.gson.Gson;
import io.reactivex.observers.TestObserver;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/8/2017
 */
public class BuyContractTest extends TestBase {

    @Test
    public void buyContractTest() throws Exception {

        AuthorizeRequest authRequest = new AuthorizeRequest(properties.getProperty("VRTC_TRADE"));
        BuyContractRequest request = new BuyContractRequest(new BigDecimal("0.35"), getParameters());
        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        this.api.sendRequest(authRequest)
                .subscribe( o -> {
                    AuthorizeResponse auth = (AuthorizeResponse) o;
                    assertNotEquals(auth.getAuthorize(), null);

                    this.api.sendRequest(request)
                            .subscribe(testObserver);
                });

        testObserver.await(5, TimeUnit.SECONDS);

        BuyContractResponse response = (BuyContractResponse) testObserver.values().get(0);

        assertEquals(response.getType(), "buy");
        assertEquals(response.getError(), null);
        assertNotEquals(response.getBuyReceipt(), null);
        assertEquals(response.getBuyReceipt().getBuyPrice(), request.getPrice());
    }

    @Test
    public void buyContractForMultipleAccountsTest() throws Exception {

        AuthorizeRequest authRequest = new AuthorizeRequest(properties.getProperty("VRTC_TRADE"));

        List<String> tokens = new ArrayList<>();
        tokens.add(properties.getProperty("VRTC_TRADE"));
        BuyContractForMultipleAccountsRequest request = new BuyContractForMultipleAccountsRequest(
                new BigDecimal("0.35"), getParameters(),
                tokens);

        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        this.api.sendRequest(authRequest)
                .subscribe( o -> {
                    AuthorizeResponse auth = (AuthorizeResponse) o;
                    assertNotEquals(auth.getAuthorize(), null);

                    this.api.sendRequest(request)
                            .subscribe(testObserver);
                });

        testObserver.await(5, TimeUnit.SECONDS);

        BuyContractForMultipleAccountsResponse response =
                (BuyContractForMultipleAccountsResponse) testObserver.values().get(0);

        assertEquals(response.getType(), "buy_contract_for_multiple_accounts");
        assertEquals(response.getError(), null);
        assertNotEquals(response.getMassBuyContractResult(), null);
        assertTrue(response.getMassBuyContractResult().getResult().size() > 0);
    }



    private BuyContractParameters getParameters() {
        String json = "{\n" +
                "  \"amount\": \"0.35\",\n" +
                "  \"basis\": \"stake\",\n" +
                "  \"contract_type\": \"CALL\",\n" +
                "  \"currency\": \"USD\",\n" +
                "  \"duration\": \"5\",\n" +
                "  \"duration_unit\": \"t\",\n" +
                "  \"symbol\": \"R_100\"\n" +
                "}";

        Gson gson = new Gson();
        return gson.fromJson(json, BuyContractParameters.class);
    }
}
