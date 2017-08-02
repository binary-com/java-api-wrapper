package com.binary.api;

import com.binary.api.models.requests.PayoutCurrenciesRequest;
import com.binary.api.models.responses.PayoutCurrenciesResponse;
import com.binary.api.models.responses.ResponseBase;
import io.reactivex.observers.TestObserver;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/2/2017
 */
public class PayoutCurrenciesTest {
    private ApiWrapper api;
    @Before
    public void setup() throws Exception{
        this.api = ApiWrapper.build("10");
    }

    @Test
    public void getPayoutCurrenciesTest() throws Exception {
        PayoutCurrenciesRequest request = new PayoutCurrenciesRequest();
        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        this.api.sendRequest(request)
                .subscribe(testObserver);

        testObserver.await(10, TimeUnit.SECONDS);

        PayoutCurrenciesResponse response = (PayoutCurrenciesResponse) testObserver.values().get(0);

        assertEquals(response.getType(), "payout_currencies");
        assertEquals(response.getError(), null);
        assertNotEquals(response.getPayoutCurrencies(), null);
    }
}
