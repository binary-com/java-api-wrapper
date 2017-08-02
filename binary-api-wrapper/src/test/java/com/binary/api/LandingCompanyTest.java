package com.binary.api;

import com.binary.api.models.requests.LandingCompanyRequest;
import com.binary.api.models.responses.LandingCompanyResponse;
import com.binary.api.models.responses.ResponseBase;
import io.reactivex.observers.TestObserver;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/1/2017
 */
public class LandingCompanyTest {
    private ApiWrapper api;
    @Before
    public void setup() throws Exception{
        this.api = ApiWrapper.build("10");
    }

    @Test
    public void getLandingCompanyTest() throws Exception{
        LandingCompanyRequest request = new LandingCompanyRequest("de");
        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        this.api.sendRequest(request)
                .subscribe(testObserver);

        testObserver.await(10, TimeUnit.SECONDS);

        LandingCompanyResponse response = (LandingCompanyResponse) testObserver.values().get(0);

        assertEquals(response.getType(), "landing_company");
        assertEquals(response.getError(), null);
        assertNotEquals(response.getLandingCompany(), null);

    }

    @Test
    public void illegalLandingCompanyCodeTest() throws Exception {
        LandingCompanyRequest request = new LandingCompanyRequest("xx");
        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        this.api.sendRequest(request)
                .subscribe(testObserver);

        testObserver.await(10, TimeUnit.SECONDS);

        LandingCompanyResponse response = (LandingCompanyResponse) testObserver.values().get(0);

        assertEquals(response.getType(), "landing_company");
        assertNotEquals(response.getError(), null);
    }
}
