package com.binary.api;

import com.binary.api.models.requests.TickRequest;
import com.binary.api.models.responses.ResponseBase;
import io.reactivex.observers.TestObserver;
import io.reactivex.schedulers.TestScheduler;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

/**
 * Created by morteza on 7/25/2017.
 */
public class TickRequestTest {
    private ApiWrapper api;
    @Before
    public void setup() throws Exception{
        this.api = ApiWrapper.build("10");
    }

    @Test
    public void getTickTest() throws Exception {
        TickRequest request = new TickRequest("R_10");
        TestObserver<ResponseBase> testSubscriber = new TestObserver<>();
        TestScheduler testScheduler = new TestScheduler();

        this.api.sendRequest(request)
                .subscribe(testSubscriber);

        testSubscriber
                .await(10, TimeUnit.SECONDS);
        ResponseBase<TickRequest> responseBase = testSubscriber
                .values().get(0);

        assertEquals(responseBase.getType(), "tick");
    }
}
