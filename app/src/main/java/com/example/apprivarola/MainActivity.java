package com.example.apprivarola;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private AvisoMensaje am;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        this.am = new AvisoMensaje();
        registerReceiver(this.am, new IntentFilter("android.provider.Telephony.SMS_RECEIVED"));

    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(am);
    }
}
