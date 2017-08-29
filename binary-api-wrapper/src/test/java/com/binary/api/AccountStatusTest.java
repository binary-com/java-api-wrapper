package com.binary.api;

import com.binary.api.models.requests.AccountStatusRequest;
import com.binary.api.models.requests.AuthorizeRequest;
import com.binary.api.models.responses.AccountStatusResponse;
import com.binary.api.models.responses.Authorize;
import com.binary.api.models.responses.AuthorizeResponse;
import com.binary.api.models.responses.ResponseBase;
import io.reactivex.observers.TestObserver;
import org.junit.Before;
import org.junit.Test;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/4/2017
 */
public class AccountStatusTest {
    private ApiWrapper api;
    private Properties properties;

    @Before
    public void setUp() throws Exception {
        TestUtility testUtility = new TestUtility();
        this.api = testUtility.getApi();
        this.properties = testUtility.getProperties();
    }

    @Test
    public void getAccountStatusTest() throws Exception {
        AuthorizeRequest authorizeRequest = new AuthorizeRequest(properties.getProperty("CR_READ"), false);
        AccountStatusRequest request = new AccountStatusRequest();
        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        this.api.sendRequest(authorizeRequest)
                .subscribe(o -> {
                    AuthorizeResponse auth = (AuthorizeResponse) o;
                    assertNotEquals(auth.getAuthorize(), null);

                    this.api.sendRequest(request)
                            .subscribe(testObserver);
                });

        testObserver.await(5, TimeUnit.SECONDS);

        AccountStatusResponse response = (AccountStatusResponse) testObserver.values().get(0);

        assertEquals(response.getType(), "get_account_status");
        assertEquals(response.getError(), null);
        assertNotEquals(response.getAccountStatus(), null);
    }


}
