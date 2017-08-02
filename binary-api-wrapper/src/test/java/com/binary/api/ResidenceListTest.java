package com.binary.api;

import com.binary.api.models.requests.ResidenceListRequest;
import com.binary.api.models.responses.ResidenceListResponce;
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
 * @since 8/2/2017
 */
public class ResidenceListTest {
    private ApiWrapper api;
    @Before
    public void setup() throws Exception{
        this.api = ApiWrapper.build("10");
    }

    @Test
    public void getResidencesTest() throws Exception {
        ResidenceListRequest request = new ResidenceListRequest();
        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        this.api.sendRequest(request)
                .subscribe(testObserver);

        testObserver.await(10, TimeUnit.SECONDS);

        ResidenceListResponce responce = (ResidenceListResponce) testObserver.values().get(0);

        assertEquals(responce.getType(), "residence_list");
        assertEquals(responce.getError(), null);
        assertTrue(responce.getResidenceList().size() > 0);
    }
}
