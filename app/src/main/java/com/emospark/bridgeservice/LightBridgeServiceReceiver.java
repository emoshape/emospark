package com.emospark.bridgeservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class LightBridgeServiceReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        //PLEASE DO NOT REMOVE FOLLOWING LINES OTHERWISE YOUR PLUGIN WILL NOT WORK ANY MORE
        IntentHelper.onReceive(context, intent);
    }
}