package com.binary.api;

import com.binary.api.models.requests.AuthorizeRequest;
import com.binary.api.models.requests.CreateRealAccountRequest;
import com.binary.api.models.responses.AuthorizeResponse;
import com.binary.api.models.responses.CreateRealAccountResponse;
import com.binary.api.models.responses.ResponseBase;
import io.reactivex.observers.TestObserver;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/3/2017
 */
public class CreateRealAccountTest extends TestBase {

    @Test
    public void invalidCreatRealAccountTest() throws Exception {
        AuthorizeRequest authRequest = new AuthorizeRequest(properties.getProperty("VRTC_ADMIN"));
        CreateRealAccountRequest request = new CreateRealAccountRequest();
        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        this.api.sendRequest(authRequest)
                .subscribe( o -> {
                    AuthorizeResponse auth = (AuthorizeResponse) o;
                    assertNotEquals(auth.getAuthorize(), null);

                    this.api.sendRequest(request)
                            .subscribe(testObserver);
                });

        testObserver.await(10, TimeUnit.SECONDS);

        CreateRealAccountResponse response = (CreateRealAccountResponse) testObserver.values().get(0);

        assertEquals(response.getType(), "new_account_real");
        assertNotEquals(response.getError(), null);
    }
}
