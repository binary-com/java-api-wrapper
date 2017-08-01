package com.binary.api;

import com.binary.api.models.requests.ForgetRequest;
import com.binary.api.models.responses.ForgetResponse;
import com.binary.api.models.responses.ResponseBase;
import io.reactivex.observers.TestObserver;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/1/2017
 */
public class ForgetTest {
    private ApiWrapper api;
    @Before
    public void setup() throws Exception{
        this.api = ApiWrapper.build("10");
    }

    @Test
    public void forgetInvalidStreamTest() throws Exception{
        ForgetRequest request = new ForgetRequest("uw2mk7no3oktoRVVsB4Dz7TQncfABuFDgO95dlxfMxRuPUdz");
        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        this.api.sendRequest(request)
                .subscribe(testObserver);

        testObserver.await(10, TimeUnit.SECONDS);

        ForgetResponse response = (ForgetResponse) testObserver.values().get(0);

        assertEquals(response.getType(), "forget");
        assertEquals(response.getForget(), 0);
        assertEquals(response.getError(), null);
    }
}
