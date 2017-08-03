package com.binary.api;

import com.binary.api.models.enums.TickStyles;
import com.binary.api.models.requests.TickHistoryRequest;
import com.binary.api.models.responses.ResponseBase;
import com.binary.api.models.responses.TickHistoryResponse;
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
public class TickHistoryTest {
    private ApiWrapper api;
    @Before
    public void setup() throws Exception{
        this.api = ApiWrapper.build("10");
    }

    @Test
    public void getTickHistory() throws Exception {
        TickHistoryRequest request = new TickHistoryRequest("R_50", "latest");
        TestObserver<ResponseBase> testObserver = new TestObserver<>();
        request.setCount(10);

        this.api.sendRequest(request)
                .subscribe(testObserver);

        testObserver.await(10, TimeUnit.SECONDS);

        TickHistoryResponse response = (TickHistoryResponse) testObserver.values().get(0);

        assertEquals(response.getType(), "history");
        assertEquals(response.getError(), null);
        assertTrue(response.getHistory().getPrices().size() == response.getHistory().getTimes().size());
    }

    @Test
    public void getCandles() throws Exception {
        TickHistoryRequest request = new TickHistoryRequest("R_50", "latest");
        TestObserver<ResponseBase> testObserver = new TestObserver<>();
        request.setStyle(TickStyles.CANDLES);

        this.api.sendRequest(request)
                .subscribe(testObserver);

        testObserver.await(10, TimeUnit.SECONDS);

        TickHistoryResponse response = (TickHistoryResponse) testObserver.values().get(0);

        assertEquals(response.getType(), "candles");
        assertEquals(response.getError(), null);
        assertTrue(response.getCandles().size() > 0);
    }

    // TODO Test subscribe for TickHistory in both styles (Candles, Tick)
}
