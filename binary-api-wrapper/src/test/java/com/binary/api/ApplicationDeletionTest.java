package com.binary.api;

import com.binary.api.models.enums.Scopes;
import com.binary.api.models.requests.ApplicationDeletionRequest;
import com.binary.api.models.requests.ApplicationRegistrationRequest;
import com.binary.api.models.requests.AuthorizeRequest;
import com.binary.api.models.responses.ApplicationDeletionResponse;
import com.binary.api.models.responses.ApplicationRegistrationResponse;
import com.binary.api.models.responses.AuthorizeResponse;
import com.binary.api.models.responses.ResponseBase;
import io.reactivex.observers.TestObserver;
import org.junit.Test;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/27/2017
 */
public class ApplicationDeletionTest extends TestBase {

    @Test
    public void deleteApplicatoinTest() throws Exception {
        AuthorizeRequest authRequest = new AuthorizeRequest(properties.getProperty("VRTC_ADMIN"));
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

        // Delete the application
        ApplicationDeletionRequest deleteRequest =
                new ApplicationDeletionRequest(response.getRegisteredApplication().getApplicationId());

        TestObserver<ResponseBase> testObserver2 = new TestObserver<>();
        this.api.sendRequest(deleteRequest)
                .subscribe(testObserver2);

        testObserver2.await(10, TimeUnit.SECONDS);
        ApplicationDeletionResponse deleteResponse = (ApplicationDeletionResponse) testObserver2.values().get(0);
        assertEquals(deleteResponse.getType(), "app_delete");
        assertNotEquals(deleteResponse.getResponse(), null);
    }
}
