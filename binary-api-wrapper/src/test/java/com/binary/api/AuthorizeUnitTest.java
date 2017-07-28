package com.binary.api;

import com.binary.api.models.requests.AuthorizeRequest;
import com.binary.api.models.requests.TickRequest;
import com.binary.api.models.responses.AuthorizeResponse;
import com.binary.api.models.responses.ResponseBase;
import io.reactivex.observers.TestObserver;
import io.reactivex.schedulers.TestScheduler;
import io.reactivex.subscribers.TestSubscriber;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by morteza on 7/28/2017.
 */
public class AuthorizeUnitTest {
    private ApiWrapper api;
    @Before
    public void setup() throws Exception{
        this.api = ApiWrapper.build("10");
    }

    @Test
    public void validAuthorizeTest() throws Exception{
        AuthorizeRequest request = new AuthorizeRequest("a1-JtfpCqlQDfU42NU4tSz9j6SrzkzOP", false);
        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        this.api.sendRequest(request)
                .subscribe(testObserver);

        testObserver
                .await(10, TimeUnit.SECONDS);

        AuthorizeResponse response =  (AuthorizeResponse) testObserver.values().get(0);
        assertEquals(response.getType(), "authorize");
        assertNotEquals(response.getAuthorize(), null);
    }

    @Test
    public void invalidAuthorizeTest() throws Exception {
        AuthorizeRequest request = new AuthorizeRequest("a1-xxxxxxxxxxxxxxxxxxxxxxxxxxxxx", false);
        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        this.api.sendRequest(request)
                .subscribe(testObserver);

        testObserver
                .await(10, TimeUnit.SECONDS);

        AuthorizeResponse response =  (AuthorizeResponse) testObserver.values().get(0);
        assertEquals(response.getType(), "authorize");
        assertEquals(response.getAuthorize(), null);
        assertNotEquals(response.getError(), null);
    }


}
