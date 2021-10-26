Original Configuration Based On MoonEye

To boot into fastboot from inital boot (Incase you cannot issue ADB commands) The following must be done:

1. Hold down power until it vibrates.

2. Then quickly tap the touchscreen with two fingers twice, but with each tap press the power button as well.

3. It make take a few tries, but it's an easy process to master.

Video form of this type of boot combo:

https://www.youtube.com/watch?v=C7DH4V8kl48

===============================================

As of 10/25/2021, this watch is able to boot to AsteroidOS using the Android 8 (Oreo) kernel,

Display, Touch and Haptics work.

#TODO

- Get USB working (Top priority, as this allows real time debugging with the system)

- Bluetooth 

- Accelerometer / Heartbeat sensor / Gyroscope (Compass)

- GPS (Test program is on Magnefires profile, low priority)

- NFC (AsteroidOS currently has no concept of NFC as far as I'm aware, this will have to be from scratch after it is verified the core system can interact with it)

- WiFi (Again, not sure if AsteroidOS has any concept at all for this)

#MAYBE TODO

- Boot the watch using the Android 9 (Pie) kernel

- Make a system specific /system directory build

==Product Page==

https://www.mobvoi.com/us/pages/ticwatchc2plus
