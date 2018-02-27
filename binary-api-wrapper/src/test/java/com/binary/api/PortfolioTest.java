package com.binary.api;

import com.binary.api.models.requests.AuthorizeRequest;
import com.binary.api.models.requests.PortfolioRequest;
import com.binary.api.models.responses.AuthorizeResponse;
import com.binary.api.models.responses.PortfolioResponse;
import com.binary.api.models.responses.ResponseBase;
import io.reactivex.observers.TestObserver;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/7/2017
 */
public class PortfolioTest extends TestBase {

    @Test
    public void getPortfolioTest() throws Exception {
        AuthorizeRequest authRequest = new AuthorizeRequest(properties.getProperty("CR_READ"));
        PortfolioRequest request = new PortfolioRequest();
        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        this.api.sendRequest(authRequest)
                .subscribe(o -> {
                    AuthorizeResponse auth = (AuthorizeResponse) o;
                    assertNotEquals(auth.getAuthorize(),  null);

                    this.api.sendRequest(request)
                            .subscribe(testObserver);
                });

        testObserver.await(10, TimeUnit.SECONDS);

        PortfolioResponse response = (PortfolioResponse) testObserver.values().get(0);

        assertEquals(response.getType(), "portfolio");
        assertEquals(response.getError(), null);
        assertNotEquals(response.getPortfolio(), null);
    }
}
