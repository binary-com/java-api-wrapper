package com.binary.api;

import com.binary.api.models.requests.AuthorizeRequest;
import com.binary.api.models.requests.SetAccountSettingsRequest;
import com.binary.api.models.responses.AuthorizeResponse;
import com.binary.api.models.responses.ResponseBase;
import com.binary.api.models.responses.SetAccountSettingsResponse;
import io.reactivex.observers.TestObserver;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/14/2017
 */
public class SetAccountSettingsTest extends TestBase {

    @Test
    public void setAccountSettingsTest() throws Exception {

        AuthorizeRequest authRequest = new AuthorizeRequest(properties.getProperty("CR_ADMIN"));
        SetAccountSettingsRequest request = new SetAccountSettingsRequest();
        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        request.setFirstLineAddress("Test Address Line 1");
        request.setSecondLineAddress("Test Address Line 2");
        request.setCity("Test City");
        request.setState("Test State");
        request.setPostcode("123456");
        request.setPhone("1234567890");

        this.api.sendRequest(authRequest)
                .subscribe( o -> {
                    AuthorizeResponse auth = (AuthorizeResponse) o;
                    assertNotEquals(auth.getAuthorize(), null);

                    this.api.sendRequest(request)
                            .subscribe(testObserver);
                });

        testObserver.await(10, TimeUnit.SECONDS);

        SetAccountSettingsResponse response = (SetAccountSettingsResponse) testObserver.values().get(0);

        assertEquals(response.getType(), "set_settings");
        assertEquals(response.getError(), null);
        assertEquals(response.getResult(), new Integer(1));
    }
}
