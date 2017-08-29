package com.binary.api;

import com.binary.api.models.requests.TradingTimesRequest;
import com.binary.api.models.responses.ResponseBase;
import com.binary.api.models.responses.TradingTimesResponse;
import io.reactivex.observers.TestObserver;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/3/2017
 */
public class TradingTimesTest {
    private ApiWrapper api;
    @Before
    public void setup() throws Exception{
        this.api = ApiWrapper.build("10");
    }

    @Test
    public void getTradingTimesTest() throws Exception {
        TradingTimesRequest request = new TradingTimesRequest("2017-08-03");
        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        this.api.sendRequest(request)
                .subscribe(testObserver);

        testObserver.await(10, TimeUnit.SECONDS);

        TradingTimesResponse response = (TradingTimesResponse) testObserver.values().get(0);

        assertEquals(response.getType(), "trading_times");
        assertEquals(response.getError(), null);
        assertNotEquals(response.getTradingTimes(), null);
        assertTrue(response.getTradingTimes().getMarkets().size() > 0);
    }
}
