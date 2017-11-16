package com.binary.api;

import com.binary.api.models.requests.AuthorizeRequest;
import com.binary.api.models.requests.PaymentAgentTransferRequest;
import com.binary.api.models.responses.AuthorizeResponse;
import com.binary.api.models.responses.PaymentAgentTransferResponse;
import com.binary.api.models.responses.ResponseBase;
import io.reactivex.observers.TestObserver;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/15/2017
 */
public class PaymentAgentTransferTest extends TestBase {

    @Test
    public void invalidTransferTest() throws Exception {

        AuthorizeRequest authRequest = new AuthorizeRequest(properties.getProperty("CR_PAYMENTS"));
        PaymentAgentTransferRequest request = new PaymentAgentTransferRequest();
        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        request.setTransferTo("CR100001");
        request.setAmount(new BigDecimal("1000"));
        request.setCurrency("USD");

        this.api.sendRequest(authRequest)
                .subscribe( o -> {
                    AuthorizeResponse auth = (AuthorizeResponse) o;
                    assertNotEquals(auth.getAuthorize(), null);

                    this.api.sendRequest(request)
                            .subscribe(testObserver);
                });

        testObserver.await(10, TimeUnit.SECONDS);

        PaymentAgentTransferResponse response = (PaymentAgentTransferResponse) testObserver.values().get(0);

        assertEquals(response.getType(), "paymentagent_transfer");
        assertEquals(response.getError().getCode(), "PaymentAgentTransferError");
        assertEquals(response.getError().getMessage(), "You are not authorized for transfers via payment agents.");
    }
}
