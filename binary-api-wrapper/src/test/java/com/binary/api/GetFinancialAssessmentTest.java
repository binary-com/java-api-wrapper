package com.binary.api;

import com.binary.api.models.requests.AuthorizeRequest;
import com.binary.api.models.requests.GetFinancialAssessmentRequest;
import com.binary.api.models.responses.AuthorizeResponse;
import com.binary.api.models.responses.GetFinancialAssessmentResponse;
import com.binary.api.models.responses.ResponseBase;
import io.reactivex.observers.TestObserver;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/29/2017
 */
public class GetFinancialAssessmentTest extends TestBase {

    @Test
    public void getFinancialAssessmentTest() throws Exception {
        AuthorizeRequest authRequest = new AuthorizeRequest(properties.getProperty("CR_ADMIN"));
        GetFinancialAssessmentRequest request = new GetFinancialAssessmentRequest();
        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        this.api.sendRequest(authRequest)
                .subscribe( o -> {
                    AuthorizeResponse auth = (AuthorizeResponse) o;
                    assertNotEquals(auth.getAuthorize(), null);

                    this.api.sendRequest(request)
                            .subscribe(testObserver);
                });

        testObserver.await(10, TimeUnit.SECONDS);

        GetFinancialAssessmentResponse response = (GetFinancialAssessmentResponse) testObserver.values().get(0);

        assertEquals(response.getType(), "get_financial_assessment");
        assertEquals(response.getError(), null);
        assertNotEquals(response.getFinancialAssessment(), null);
    }
}
