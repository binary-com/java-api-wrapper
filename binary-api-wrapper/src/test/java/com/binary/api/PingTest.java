package com.binary.api;

import com.binary.api.models.requests.PingRequest;
import com.binary.api.models.responses.PingResponse;
import com.binary.api.models.responses.ResponseBase;
import io.reactivex.observers.TestObserver;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/2/2017
 */
public class PingTest {
    private ApiWrapper api;
    @Before
    public void setup() throws Exception{
        this.api = ApiWrapper.build("10");
    }

    @Test
    public void pingTest() throws Exception {
        PingRequest request = new PingRequest();
        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        this.api.sendRequest(request)
                .subscribe(testObserver);

        testObserver.await(10, TimeUnit.SECONDS);

        PingResponse response = (PingResponse) testObserver.values().get(0);

        assertEquals(response.getType(), "ping");
        assertEquals(response.getError(), null);
        assertEquals(response.getPing(), "pong");
    }
}
