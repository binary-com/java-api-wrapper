package com.binary.api;

import com.binary.api.models.requests.ActiveSymbolRequest;
import com.binary.api.models.responses.ActiveSymbolResponse;
import com.binary.api.models.responses.ResponseBase;
import io.reactivex.observers.TestObserver;
import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 7/31/2017
 */
public class ActiveSymbolTest {
    private ApiWrapper api;
    @Before
    public void setup() throws Exception{
        this.api = ApiWrapper.build("10");
    }

    @Test
    public void getActiveSymbolTest() throws Exception {
        ActiveSymbolRequest request = new ActiveSymbolRequest();
        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        this.api.sendRequest(request)
                .subscribe(testObserver);

        testObserver
                .await(10, TimeUnit.SECONDS);

        ActiveSymbolResponse response = (ActiveSymbolResponse) testObserver.values().get(0);

        assertEquals(response.getType(), "active_symbols");
        assertNotEquals(response.getActiveSymbols(), null);

    }
}
