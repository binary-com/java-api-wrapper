package com.binary.api;

import com.binary.api.models.enums.BasisTypes;
import com.binary.api.models.enums.DurationUnits;
import com.binary.api.models.requests.PriceProposalRequest;
import com.binary.api.models.responses.PriceProposalResponse;
import com.binary.api.models.responses.ResponseBase;
import io.reactivex.observers.TestObserver;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/2/2017
 */
public class PriceProposalTest {
    private ApiWrapper api;
    @Before
    public void setup() throws Exception{
        this.api = ApiWrapper.build("10");
    }

    @Test
    public void getPriceProposalTest() throws Exception {
        PriceProposalRequest request = new PriceProposalRequest("R_100", BigDecimal.valueOf(100), BasisTypes.PAYOUT,
                "CALL", "USD", 60, DurationUnits.SECONDS);

        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        this.api.sendRequest(request)
                .subscribe(testObserver);

        testObserver.await(10, TimeUnit.SECONDS);

        PriceProposalResponse response = (PriceProposalResponse) testObserver.values().get(0);

        assertEquals(response.getType(), "proposal");
        assertEquals(response.getError(), null);
        assertEquals(response.getProposal().getPayout(), BigDecimal.valueOf(100));
    }
}
