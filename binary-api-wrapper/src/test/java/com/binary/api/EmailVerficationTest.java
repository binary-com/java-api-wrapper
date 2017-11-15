package com.binary.api;

import com.binary.api.models.enums.EmailVerificationReasons;
import com.binary.api.models.requests.EmailVerificationRequest;
import com.binary.api.models.responses.EmailVerificationResponse;
import com.binary.api.models.responses.ResponseBase;
import io.reactivex.observers.TestObserver;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/3/2017
 */
public class EmailVerficationTest {
    private ApiWrapper api;
    @Before
    public void setup() throws Exception{
        this.api = ApiWrapper.build("10");
    }

    @Test
    public void sendEmailVerificationTest() throws Exception {
        EmailVerificationRequest request = new EmailVerificationRequest("test@local.com",
                EmailVerificationReasons.ACCOUNT_OPENING);
        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        this.api.sendRequest(request)
                .subscribe(testObserver);

        testObserver.await(10, TimeUnit.SECONDS);

        EmailVerificationResponse response = (EmailVerificationResponse) testObserver.values().get(0);

        assertEquals(response.getType(), "verify_email");
        assertEquals(response.getError(), null);
        assertTrue(response.getVerifyEmail() == 1);
    }
}
