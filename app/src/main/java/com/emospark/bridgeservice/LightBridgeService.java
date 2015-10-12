package com.emospark.bridgeservice;

import android.app.IntentService;
import android.content.Intent;

/**
 * Service is intent service used to generate Video Link when Requested from Cube App
 */
public class LightBridgeService extends IntentService implements IBridgeConnector {


    public LightBridgeService() {
        super("LightBridgeService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Utility.traceM("LightBridgeService::onHandleIntent");
        //PLEASE DO NOT REMOVE FOLLOWING LINES OTHERWISE YOUR PLUGIN WILL NOT WORK ANY MORE
        IntentHelper.onHandleIntent(this, intent);
    }

    /**
     * Connect with light service bridge
     */
    @Override
    public void connectWithLightServiceBridge() {
        Utility.trace("Connect with light service bridge");

        // TODO Write your custom logic for connect with respective bridge
        // When Bridge connected well just set the following value to true which do rest of the check
        // AppSettings.getInstance().setConnected(true);

    }

    /**
     * Turn On specific light/scene/location
     */
    @Override
    public void turnOnLocation(String locationName) {
        Utility.trace("Turn On specific light/scene/location :: " + locationName);

        // TODO This method called when Emospark cube send command to activate the specific location
    }

    /**
     * Turn Off specific light/scene/location
     */
    @Override
    public void turnOffLocation(String locationName) {
        Utility.trace("Turn Off specific light/scene/location :: " + locationName);

        // TODO This method called when Emospark cube send command to deactivate the specific location
    }

    /**
     * Turn Off All Lights
     */
    @Override
    public void turnOffAllLights() {
        Utility.trace("Turn Off All Lights");

        // TODO This method called when Emospark cube send command to activate the all location
    }


    /**
     * Turn Off All Lights
     */
    @Override
    public void turnOnAllLights() {
        Utility.trace("Turn On All Lights");

        // TODO This method called when Emospark cube send command to deactivate the all location
    }
}