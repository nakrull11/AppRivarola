package com.example.apprivarola;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AvisoMensaje extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Tienes un nuevo mensaje sin leer!", Toast.LENGTH_LONG).show();
    }
}
