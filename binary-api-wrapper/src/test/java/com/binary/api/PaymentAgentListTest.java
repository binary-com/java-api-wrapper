package com.binary.api;

import com.binary.api.models.requests.PaymentAgentListRequest;
import com.binary.api.models.responses.PaymentAgentListResponse;
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
 * @since 8/2/2017
 */
public class PaymentAgentListTest {
    private ApiWrapper api;
    @Before
    public void setup() throws Exception{
        this.api = ApiWrapper.build("10");
    }

    @Test
    public void getPaymentAgentList() throws Exception {
        PaymentAgentListRequest request = new PaymentAgentListRequest("ng");
        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        this.api.sendRequest(request)
                .subscribe(testObserver);

        testObserver.await(10, TimeUnit.SECONDS);

        PaymentAgentListResponse response = (PaymentAgentListResponse) testObserver.values().get(0);

        assertEquals(response.getType(), "paymentagent_list");
        assertEquals(response.getError(), null);
        assertNotEquals(response.getPaymentAgentList().getPaymentAgents().size(), 0);
    }
}
