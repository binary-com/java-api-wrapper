package com.binary.api;

import com.binary.api.models.enums.StreamTypes;
import com.binary.api.models.requests.ForgetAllRequest;
import com.binary.api.models.requests.ForgetAllResponse;
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
public class ForgetAllTest {
    private ApiWrapper api;
    @Before
    public void setup() throws Exception{
        this.api = ApiWrapper.build("10");
    }

    @Test
    public void forgetAllStreamsTest() throws Exception {
        ForgetAllRequest request = new ForgetAllRequest(StreamTypes.ticks);
        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        this.api.sendRequest(request)
                .subscribe(testObserver);

        testObserver.await(10, TimeUnit.SECONDS);

        ForgetAllResponse response = (ForgetAllResponse) testObserver.values().get(0);

        assertEquals(response.getType(), "forget_all");
        assertEquals(response.getError(), null);
    }
}
