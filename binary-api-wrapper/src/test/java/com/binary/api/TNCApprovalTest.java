package com.binary.api;

import com.binary.api.models.requests.AuthorizeRequest;
import com.binary.api.models.requests.TNCApprovalRequest;
import com.binary.api.models.responses.AuthorizeResponse;
import com.binary.api.models.responses.ResponseBase;
import com.binary.api.models.responses.TNCApprovalResponse;
import io.reactivex.observers.TestObserver;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/4/2017
 */
public class TNCApprovalTest extends TestBase {

    @Test
    public void tncApprovalTest() throws Exception {

        AuthorizeRequest authRequest = new AuthorizeRequest(properties.getProperty("CR_ADMIN"));
        TNCApprovalRequest request = new TNCApprovalRequest();
        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        this.api.sendRequest(authRequest)
                .subscribe( o -> {
                    AuthorizeResponse auth = (AuthorizeResponse) o;
                    assertNotEquals(auth.getAuthorize(), null);

                    this.api.sendRequest(request)
                            .subscribe(testObserver);
                });

        testObserver.await(10, TimeUnit.SECONDS);

        TNCApprovalResponse response = (TNCApprovalResponse) testObserver.values().get(0);

        assertEquals(response.getType(), "tnc_approval");
        assertEquals(response.getError(), null);
        assertTrue(response.getResult() >= 0);
    }
}
