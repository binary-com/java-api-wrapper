package com.binary.api;

import com.binary.api.models.requests.AuthorizeRequest;
import com.binary.api.models.requests.TickRequest;
import com.binary.api.models.responses.AuthorizeResponse;
import com.binary.api.models.responses.ResponseBase;
import io.reactivex.observers.TestObserver;
import io.reactivex.schedulers.TestScheduler;
import io.reactivex.subscribers.TestSubscriber;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by morteza on 7/28/2017.
 */
public class AuthorizeTest {
    private ApiWrapper api;
    private Properties properties;
    @Before
    public void setup() throws Exception{
        this.properties = new Properties();
        InputStream inputStream = ClassLoader.getSystemResourceAsStream("TestEnvironment.properties");
        try{
            properties.load(inputStream);
            this.api = ApiWrapper.build("10");
        }
        catch (IOException ex){
            throw ex;
        }


    }

    @Test
    public void validAuthorizeTest() throws Exception{
        AuthorizeRequest request = new AuthorizeRequest(properties.getProperty("CR_READ"), false);
        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        this.api.sendRequest(request)
                .subscribe(testObserver);

        testObserver
                .await(10, TimeUnit.SECONDS);

        AuthorizeResponse response =  (AuthorizeResponse) testObserver.values().get(0);
        assertEquals(response.getType(), "authorize");
        assertNotEquals(response.getAuthorize(), null);
    }

    @Test
    public void invalidAuthorizeTest() throws Exception {
        AuthorizeRequest request = new AuthorizeRequest("a1-xxxxxxxxxxxxxxxxxxxxxxxxxxxxx", false);
        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        this.api.sendRequest(request)
                .subscribe(testObserver);

        testObserver
                .await(10, TimeUnit.SECONDS);

        AuthorizeResponse response =  (AuthorizeResponse) testObserver.values().get(0);
        assertEquals(response.getType(), "authorize");
        assertEquals(response.getAuthorize(), null);
        assertNotEquals(response.getError(), null);
    }


}
