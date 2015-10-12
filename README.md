# README #

This document helps you to configure your plugin and manage your own brdige with Emospark Cube.

### Main Components of Plugin :

* Main Activity                 :   Activity Which trigger the connect event at the time of First Launch
* LightBridgeServiceReceiver    :   Receiver which receive all events from cube and do appropriate action
* LightBridgeService            :   Service which manage all the communication which Emospark Cube

### Main methods which needs to be customized for reused this library

Following methods called automatically based on plugin lifecycle.

* connectWithLightServiceBridge()       :   Connect with light service bridge

* turnOnLocation(String locationName)   :   Activate specific location if exist within bridge

* turnOffLocation(String locationName)  :   Deactivate specific location if exist within bridge

* turnOffAllLights()                    :   Deactivate all lights

* turnOnAllLights()                     :   Activate all lights
