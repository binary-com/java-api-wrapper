package com.binary.api;

import com.binary.api.models.requests.AuthorizeRequest;
import com.binary.api.models.requests.PaymentAgentWithdrawalRequest;
import com.binary.api.models.responses.AuthorizeResponse;
import com.binary.api.models.responses.PaymentAgentWithdrawalResponse;
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
public class PaymentAgentWithdrawalTest extends TestBase {

    @Test
    public void invalidWithdrawalTest() throws Exception {

        AuthorizeRequest authRequest = new AuthorizeRequest(properties.getProperty("CR_PAYMENTS"));
        PaymentAgentWithdrawalRequest request = new PaymentAgentWithdrawalRequest();
        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        request.setAmount(new BigDecimal(1000));
        request.setLoginId("CR494048");
        request.setCurrency("USD");
        request.setVerificationCode("1234qwer");

        this.api.sendRequest(authRequest)
                .subscribe( o -> {
                    AuthorizeResponse auth = (AuthorizeResponse) o;
                    assertNotEquals(auth.getAuthorize(), null);

                    this.api.sendRequest(request)
                            .subscribe(testObserver);
                });

        testObserver.await(10, TimeUnit.SECONDS);

        PaymentAgentWithdrawalResponse response = (PaymentAgentWithdrawalResponse) testObserver.values().get(0);

        assertEquals(response.getType(), "paymentagent_withdraw");
        assertEquals(response.getError().getCode(), "InvalidToken");
    }
}
