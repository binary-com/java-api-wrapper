package com.binary.examples.simplebinaryapiusage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.binary.api.ApiWrapper;
import com.binary.api.models.requests.TickRequest;
import com.binary.api.models.responses.TickResponse;

import io.reactivex.android.schedulers.AndroidSchedulers;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiWrapper api = ApiWrapper.build("10"  );

        TickRequest tickRequest = new TickRequest();
        tickRequest.setSymbol("R_10");


        api.sendRequest(tickRequest)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        response -> {
                            TextView result = (TextView) findViewById(R.id.result);
                            result.setText(((TickResponse) response).getTick().getQuote());
                        }
                );
    }
}
