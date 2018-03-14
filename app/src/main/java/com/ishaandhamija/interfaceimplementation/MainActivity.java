package com.ishaandhamija.interfaceimplementation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    double lat, lon;
    OnSomeAction onSomeAction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fetchLatLon();

        onSomeAction = new OnSomeAction() {
            @Override
            public void onSuccess(double lat, double lon) {
                zomatoAPI(lat, lon);
            }
        };

    }

    void fetchLatLon() {
        lat = 12.111;
        lon = 12.111;
        onSomeAction.onSuccess(lat, lon);
    }

    void zomatoAPI(double lat, double lon) {

    }
}
