package com.binary.api;

import com.binary.api.models.enums.Scopes;
import com.binary.api.models.requests.ApplicationRegistrationRequest;
import com.binary.api.models.requests.AuthorizeRequest;
import com.binary.api.models.responses.ApplicationRegistrationResponse;
import com.binary.api.models.responses.AuthorizeResponse;
import com.binary.api.models.responses.ResponseBase;
import io.reactivex.observers.TestObserver;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/20/2017
 */
public class ApplicationRegistrationTest extends TestBase {

    @Test
    public void registerApplicationTest() throws Exception {

        AuthorizeRequest authRequest = new AuthorizeRequest(properties.getProperty("VRTC_ADMIN"));
        // FIXME Uncomment the below lines after fixing the googleplay regex issue
//        ApplicationRegistrationRequest request = new ApplicationRegistrationRequest(
//                "testAppRegistration",
//                Arrays.asList(new Scopes[]{Scopes.READ, Scopes.TRADE}),
//                "https://www.test.com",
//                "https://github.com/xx/appRegistrationTest",
//                "https://itunes.apple.com/app/apple-store/id1091187567",
//                "https://play.google.com/store/apps/details?id=com.binary.ticktrade",
//                "https://test.com",
//                "https://test.com",
//                new BigDecimal("0")
//        );
        ApplicationRegistrationRequest request = new ApplicationRegistrationRequest(
                "testAppRegistration",
                Arrays.asList(new Scopes[]{Scopes.READ, Scopes.TRADE}),
                "https://www.test.com"
        );
        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        this.api.sendRequest(authRequest)
                .subscribe( o -> {
                    AuthorizeResponse auth = (AuthorizeResponse) o;
                    assertNotEquals(auth.getAuthorize(), null);

                    this.api.sendRequest(request)
                            .subscribe(testObserver);
                });

        testObserver.await(10, TimeUnit.SECONDS);

        ApplicationRegistrationResponse response = (ApplicationRegistrationResponse) testObserver.values().get(0);

        assertEquals(response.getType(), "app_register");
        assertEquals(response.getError(), null);
        assertNotEquals(response.getRegisteredApplication(), null);

    }
}
