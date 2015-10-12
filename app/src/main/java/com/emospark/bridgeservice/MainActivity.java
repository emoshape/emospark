package com.emospark.bridgeservice;

import android.app.Activity;
import android.os.Bundle;

/***
 * Dummy Activity Just to start service from AutoUpdater after Install
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //DO NOT REMOVE FOLLOWING LINES OTHERWISE YOUR PLUGIN WILL NOT WORK ANY MORE
        // Connect With Bridge
        IntentHelper.connectWithBridge(this);
        finish();
    }

}
