package com.binary.api;

import com.binary.api.models.requests.AuthorizeRequest;
import com.binary.api.models.requests.BuyContractParameters;
import com.binary.api.models.requests.BuyContractRequest;
import com.binary.api.models.responses.AuthorizeResponse;
import com.binary.api.models.responses.BuyContractResponse;
import com.binary.api.models.responses.ResponseBase;
import com.google.gson.Gson;
import io.reactivex.observers.TestObserver;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

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
