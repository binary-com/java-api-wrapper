package com.binary.api;

import com.binary.api.models.requests.AssetIndexRequest;
import com.binary.api.models.responses.AssetIndex;
import com.binary.api.models.responses.AssetIndexResponse;
import com.binary.api.models.responses.ResponseBase;
import io.reactivex.observers.TestObserver;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.concurrent.TimeUnit;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 7/31/2017
 */
public class AssetIndexTest {
    private ApiWrapper api;
    @Before
    public void setup() throws Exception{
        this.api = ApiWrapper.build("10");
    }

    @Test
    public void getAssetIndexTest() throws Exception{
        AssetIndexRequest request = new AssetIndexRequest();
        TestObserver<ResponseBase> testObserver = new TestObserver<>();

        this.api.sendRequest(request)
                .subscribe(testObserver);

        testObserver.await(10, TimeUnit.SECONDS);

        AssetIndexResponse response = (AssetIndexResponse) testObserver.values().get(0);

        assertEquals(response.getType(), "asset_index");
        assertNotEquals(response.getAssetIndex(), null);

    }
}
