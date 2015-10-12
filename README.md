# README #

Let's build the AI Home Console of the future, together

This document helps you to create an EmoSPARK's plugin based on the Philips HUE plugin for EmoSPARK.
All plugins must be approved by Emoshape, so we recommand you contact emoshape: support@emoshapehelp.zendesk.com and discuss with the team about your plugin concept.
Right now we are interested in Nest Plugin and SmartThings, but we are open to other ideas like IFTTT etc.

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
