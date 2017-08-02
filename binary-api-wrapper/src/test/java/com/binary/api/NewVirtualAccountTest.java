package com.binary.api;

import com.binary.api.models.requests.NewVirtualAccountRequest;
import com.binary.api.models.responses.NewVirtualAccountResponse;
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
public class NewVirtualAccountTest {
    private ApiWrapper api;
    @Before
    public void setup() throws Exception{
        this.api = ApiWrapper.build("10");
    }

    @Test
    public void invalidVerificationCodeTest() throws Exception{
        NewVirtualAccountRequest request = new NewVirtualAccountRequest("xxxxxxxx", "123456", "id");
        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        this.api.sendRequest(request)
                .subscribe(testObserver);

        testObserver.await(10, TimeUnit.SECONDS);

        NewVirtualAccountResponse response = (NewVirtualAccountResponse) testObserver.values().get(0);

        assertEquals(response.getType(), "new_account_virtual");
        assertNotEquals(response.getError(), null);
    }
}
