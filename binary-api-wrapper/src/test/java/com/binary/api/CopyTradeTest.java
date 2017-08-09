package com.binary.api;

import com.binary.api.models.requests.AuthorizeRequest;
import com.binary.api.models.requests.StartCopyTradeRequest;
import com.binary.api.models.responses.AuthorizeResponse;
import com.binary.api.models.responses.ResponseBase;
import com.binary.api.models.responses.StartCopyTradeResponse;
import io.reactivex.observers.TestObserver;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/9/2017
 */
public class CopyTradeTest extends TestBase {

    @Test
    public void startCopyTradeTest() throws Exception {
        AuthorizeRequest authRequest = new AuthorizeRequest(properties.getProperty("VRTC_TRADE"));
        StartCopyTradeRequest request = new StartCopyTradeRequest(properties.getProperty("CR_TRADE"));
        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        this.api.sendRequest(authRequest)
                .subscribe( o -> {
                    AuthorizeResponse auth = (AuthorizeResponse) o;
                    assertNotEquals(auth.getAuthorize(), null);

                    this.api.sendRequest(request)
                            .subscribe(testObserver);
                });

        testObserver.await(5, TimeUnit.SECONDS);

        StartCopyTradeResponse response = (StartCopyTradeResponse) testObserver.values().get(0);

        assertEquals(response.getType(), "copy_start");
        assertNotEquals(response.getError(), null);
        assertEquals(response.getError().getCode(), "CopyTradingNotAllowed");
    }
}
