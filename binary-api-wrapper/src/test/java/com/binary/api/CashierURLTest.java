package com.binary.api;

import com.binary.api.models.enums.CashierTypes;
import com.binary.api.models.requests.AuthorizeRequest;
import com.binary.api.models.requests.CashierURLRequest;
import com.binary.api.models.responses.AuthorizeResponse;
import com.binary.api.models.responses.CashierURLResponse;
import com.binary.api.models.responses.ResponseBase;
import io.reactivex.observers.TestObserver;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/14/2017
 */
public class CashierURLTest extends TestBase {

    @Test
    public void getCashierURLTest() throws Exception {

        AuthorizeRequest authRequest = new AuthorizeRequest(properties.getProperty("CR_PAYMENTS"));
        CashierURLRequest request = new CashierURLRequest(CashierTypes.DEPOSIT);
        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        this.api.sendRequest(authRequest)
                .subscribe( o -> {
                    AuthorizeResponse auth = (AuthorizeResponse) o;
                    assertNotEquals(auth.getAuthorize(), null);

                    this.api.sendRequest(request)
                            .subscribe(testObserver);
                });

        testObserver.await(10, TimeUnit.SECONDS);

        CashierURLResponse response = (CashierURLResponse) testObserver.values().get(0);

        assertEquals(response.getType(), "cashier");
        assertEquals(response.getError(), null);
        assertNotEquals(response.getCashierURL(), null);
    }
}
