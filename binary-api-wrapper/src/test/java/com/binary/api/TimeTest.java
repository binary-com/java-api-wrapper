package com.binary.api;

import com.binary.api.models.requests.TimeRequest;
import com.binary.api.models.responses.ResponseBase;
import com.binary.api.models.responses.TimeResponse;
import io.reactivex.observers.TestObserver;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/3/2017
 */
public class TimeTest {
    private ApiWrapper api;
    @Before
    public void setup() throws Exception{
        this.api = ApiWrapper.build("10");
    }

    @Test
    public void getTime() throws Exception {
        TimeRequest request = new TimeRequest();
        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        this.api.sendRequest(request)
                .subscribe(testObserver);

        testObserver.await(10, TimeUnit.SECONDS);

        TimeResponse response = (TimeResponse) testObserver.values().get(0);

        assertEquals(response.getType(), "time");
        assertEquals(response.getError(), null);
        assertTrue(response.getTime() > 0);
    }
}
