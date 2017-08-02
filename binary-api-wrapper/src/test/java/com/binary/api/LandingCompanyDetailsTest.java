package com.binary.api;

import com.binary.api.models.requests.LandingCompanyDetailsRequest;
import com.binary.api.models.responses.LandingCompanyDetailsResponse;
import com.binary.api.models.responses.ResponseBase;
import io.reactivex.observers.TestObserver;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/2/2017
 */
public class LandingCompanyDetailsTest {
    private ApiWrapper api;
    @Before
    public void setup() throws Exception{
        this.api = ApiWrapper.build("10");
    }

    @Test
    public void getLandingCompanyDetailsTest() throws Exception {
        LandingCompanyDetailsRequest request = new LandingCompanyDetailsRequest("malta");
        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        this.api.sendRequest(request)
                .subscribe(testObserver);

        testObserver.await(10, TimeUnit.SECONDS);

        LandingCompanyDetailsResponse response = (LandingCompanyDetailsResponse) testObserver.values().get(0);

        assertEquals(response.getType(), "landing_company_details");
        assertEquals(response.getError(), null);
        assertEquals(response.getLandingCompanyDetails().getShortCode(), "malta");
    }
}
