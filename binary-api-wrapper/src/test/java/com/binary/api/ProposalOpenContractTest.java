package com.binary.api;

import com.binary.api.models.requests.AuthorizeRequest;
import com.binary.api.models.requests.ProposalOpenContractRequest;
import com.binary.api.models.responses.AuthorizeResponse;
import com.binary.api.models.responses.ProposalOpenContractResponse;
import com.binary.api.models.responses.ResponseBase;
import io.reactivex.observers.TestObserver;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/8/2017
 */
public class ProposalOpenContractTest extends TestBase {

    @Test
    public void getopenContractTest() throws Exception {
        AuthorizeRequest authRequest = new AuthorizeRequest(properties.getProperty("VRTC_READ"));
        ProposalOpenContractRequest request = new ProposalOpenContractRequest(1111111111L);
        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        this.api.sendRequest(authRequest)
                .subscribe( o -> {
                    AuthorizeResponse auth = (AuthorizeResponse) o;
                    assertNotEquals(auth.getAuthorize(), null);

                    this.api.sendRequest(request)
                            .subscribe(testObserver);
                });

        testObserver.await(5, TimeUnit.SECONDS);

        ProposalOpenContractResponse response = (ProposalOpenContractResponse) testObserver.values().get(0);

        assertEquals(response.getType(), "proposal_open_contract");
        assertEquals(response.getError(), null);
        assertNotEquals(response.getOpenContract(), null);
    }
}
