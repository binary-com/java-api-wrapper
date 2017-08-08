package com.binary.api;

import com.binary.api.models.requests.AuthorizeRequest;
import com.binary.api.models.requests.RealityCheckRequest;
import com.binary.api.models.responses.AuthorizeResponse;
import com.binary.api.models.responses.RealityCheckResponse;
import com.binary.api.models.responses.ResponseBase;
import io.reactivex.observers.TestObserver;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/8/2017
 */
public class RealityCheckTest extends TestBase {

    @Test
    public void getRealityCheckTest() throws Exception {
        AuthorizeRequest authRequest = new AuthorizeRequest(properties.getProperty("CR_READ"));
        RealityCheckRequest request = new RealityCheckRequest();
        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        this.api.sendRequest(authRequest)
                .subscribe( o -> {
                    AuthorizeResponse auth = (AuthorizeResponse) o;
                    assertNotEquals(auth.getAuthorize(), null);

                    this.api.sendRequest(request)
                            .subscribe(testObserver);
                });

        testObserver.await(5, TimeUnit.SECONDS);

        RealityCheckResponse response = (RealityCheckResponse) testObserver.values().get(0);

        assertEquals(response.getType(), "reality_check");
        assertEquals(response.getError(), null);
        assertNotEquals(response.getRealityCheck(), null);
    }
}
