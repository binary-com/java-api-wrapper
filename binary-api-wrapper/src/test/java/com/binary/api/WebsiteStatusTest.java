package com.binary.api;

import com.binary.api.models.requests.WebsiteStatusRequest;
import com.binary.api.models.responses.ResponseBase;
import com.binary.api.models.responses.WebsiteStatusResponse;
import io.reactivex.observers.TestObserver;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/3/2017
 */
public class WebsiteStatusTest {
    private ApiWrapper api;
    @Before
    public void setup() throws Exception{
        this.api = ApiWrapper.build("10");
    }

    @Test
    public void getWebsiteStatusTest() throws Exception {
        WebsiteStatusRequest request = new WebsiteStatusRequest();
        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        this.api.sendRequest(request)
                .subscribe(testObserver);

        testObserver.await(10, TimeUnit.SECONDS);

        WebsiteStatusResponse response = (WebsiteStatusResponse) testObserver.values().get(0);

        assertEquals(response.getType(), "website_status");
        assertEquals(response.getError(), null);
        assertNotEquals(response.getWebsiteStatus(), null);
    }
}
