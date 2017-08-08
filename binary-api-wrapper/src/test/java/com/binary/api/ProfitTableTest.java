package com.binary.api;

import com.binary.api.models.requests.AuthorizeRequest;
import com.binary.api.models.requests.ProfitTableRequest;
import com.binary.api.models.responses.AuthorizeResponse;
import com.binary.api.models.responses.ProfitTableResponse;
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
public class ProfitTableTest extends TestBase {

    @Test
    public void getProfitTableTest() throws Exception {
        AuthorizeRequest authRequest = new AuthorizeRequest(properties.getProperty("VRTC_READ"));
        ProfitTableRequest request = new ProfitTableRequest();
        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        this.api.sendRequest(authRequest)
                .subscribe( o -> {
                    AuthorizeResponse auth = (AuthorizeResponse) o;
                    assertNotEquals(auth.getAuthorize(), null);

                    this.api.sendRequest(request)
                            .subscribe(testObserver);
                });

        testObserver.await(10, TimeUnit.SECONDS);

        ProfitTableResponse response = (ProfitTableResponse) testObserver.values().get(0);

        assertEquals(response.getType(), "profit_table");
        assertEquals(response.getError(), null);
        assertNotEquals(response.getProfitTable(), null);
    }
}
