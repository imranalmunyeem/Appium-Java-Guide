# Complete Appium Guide

### Installation Guide
#### Important notes: 
      - Always use latest versions of node, npm, with Appium!
      - Be admin on your Windows!


#### Step 1: Install Appium using NPM (Appium CLI)
============================================
        -> Commands to check if node and NPM are installed:
                            node -v
                             npm -v
        -> Install node.js (NPM is included) from link - https://nodejs.org/en/download/
        -> Command to install Appium using npm: npm install -g appium
        -> Command to start Appium: appium
        -> Command to uninstall Appium: npm uninstall -g appium


#### Step 2: Install Appium using Appium Desktop
===========================================
-> Download and install Appium Desktop from https://appium.io


#### Step 3: Install JAVA JDK and configure environment variables
===========================================================
Note: Install JDK and not JRE!
-> Command to check if JAVA is already installed: java -version
-> JAVA JDK download link: https://www.oracle.com/technetwork/java/javase/downloads/index.html
Note: x86 or x64? Go to "Control Panel\System and Security\System" or execute "set pro" in CMD prompt
-> Create JAVA_HOME system environment variable and set it to JDK path (without bin folder). 
Edit PATH system environment variable and add %JAVA_HOME%\bin
Note: Usually JDK path is "C:\Program Files\Java\<your_jdk_version>"
-> JAVA 8 Installation instructions on Windows:
https://docs.oracle.com/javase/8/docs/technotes/guides/install/windows_jdk_install.html#CHDEBCCJ


#### Step 4: Install Android Studio and configure environment variables
=================================================================
-> Android Sutdio download link: https://developer.android.com/studio
-> Create ANDROID_HOME system environment variable and set it to SDK path. 
Edit PATH system environment variable and add below,
%ANDROID_HOME%\platform-tools
%ANDROID_HOME%\tools
%ANDROID_HOME%\tools\bin


#### Step 5: Verify installation using appium-doctor
===============================================
Command to install appium-doctor: npm install -g appium-doctor
Command to get appium-doctor help: appium-doctor --help
Command to check Android setup: appium-doctor --android 


#### Step 6: Emulator Setup: Create AVD and start it 
================================================
Open Android Studio -> Configure -> AVD Manager -> Create Virtual Device -> 
Select Model -> Download Image for desired OS version if not already downloaded 
-> Start AVD


#### Step 7: Emulator Setup: Create Driver Session using Appium Desktop
==================================================================
Download link for dummy app:
https://github.com/appium/appium/blob/master/sample-code/apps/ApiDemos-debug.apk


#### Step 8: Real Device Setup: Enable USB debugging on Android mobile
==================================================================
Note: Steps can differ based on the phone manufacturer!
-> Settings -> System -> About Phone -> Click Build Number 7-8 times
-> Settings -> Developer Options -> Enable USB Debugging
-> Permission pop-up: Check the box and press Allow to recognize the computer
-> run "adb devices" in CMD prompt to check if device is recognized
-> USB drivers:
Google: https://developer.android.com/studio/run/win-usb
OEMs: https://developer.android.com/studio/run/oem-usb


#### Step 9: Real Device Setup: Create Driver Session using Appium Desktop
====================================================================
Download link for dummy app:
https://github.com/appium/appium/blob/master/sample-code/apps/ApiDemos-debug.apk

C:\YT\ApiDemos-debug.apk
