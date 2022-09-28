# Complete Appium Guide

### Installation Guide

#### Appium official - https://appium.io/docs/en/about-appium/getting-started/?lang=en

#### Step 1: Install Appium using NPM (Appium CLI)
            -> Commands to check if node and NPM are installed:
                            node -v
                             npm -v
                             
            -> Install node.js (NPM is included) from link - https://nodejs.org/en/download/
            
            -> Command to install Appium using npm: 
                        npm install -g appium
            
            -> Command to start Appium: 
                              appium
            
            -> Command to uninstall Appium: 
                        npm uninstall -g appium


#### Step 2: Install Appium using Appium Desktop
            -> Download and install Appium Desktop from https://appium.io


#### Step 3: Install JAVA JDK and configure environment variables
#### Note: Install JDK and not JRE!
            -> Command to check if JAVA is already installed: java -version
            
            -> JAVA JDK download link: https://www.oracle.com/technetwork/java/javase/downloads/index.html
            
            
####  Note: x86 or x64? Go to "Control Panel\System and Security\System" or execute "set pro" in CMD prompt          
            -> Create JAVA_HOME system environment variable and set it to JDK path (without bin folder). 
            Edit PATH system environment variable and add %JAVA_HOME%\bin
            
####  Note: Usually JDK path is "C:\Program Files\Java\<your_jdk_version>"
            
            -> JAVA 8 Installation instructions on Windows:
            https://docs.oracle.com/javase/8/docs/technotes/guides/install/windows_jdk_install.html#CHDEBCCJ


#### Step 4: Install Android Studio and configure environment variables
            -> Android Sutdio download link: https://developer.android.com/studio
            
            -> Create ANDROID_HOME system environment variable and set it to SDK path. 
            Edit PATH system environment variable and add below,
            %ANDROID_HOME%\platform-tools
            %ANDROID_HOME%\tools
            %ANDROID_HOME%\tools\bin


#### Step 5: Verify installation using appium-doctor
            Command to install appium-doctor: 
                  npm install -g appium-doctor
                  
            Command to get appium-doctor help:             
                  appium-doctor --help
                  
            Command to check Android setup: 
                  appium-doctor --android 


#### Step 6: Emulator Setup: Create AVD and start it 
  Android Studio -> Configure -> AVD Manager -> Create Virtual Device -> Select Model -> Download Image for desired OS version if not already downloaded-> Start AVD


#### Step 7: Emulator Setup: Create Driver Session using Appium Desktop
            Download link for dummy app:
            https://github.com/appium/appium/blob/master/sample-code/apps/ApiDemos-debug.apk


#### Step 8: Real Device Setup: Enable USB debugging on Android mobile
#### Note: Steps can differ based on the phone manufacturer!
            -> Settings -> System -> About Phone -> Click Build Number 7-8 times
            
            -> Settings -> Developer Options -> Enable USB Debugging
            
            -> Permission pop-up: Check the box and press Allow to recognize the computer
            
            -> run "adb devices" in CMD prompt to check if device is recognized
            
            -> USB drivers:
            Google: https://developer.android.com/studio/run/win-usb
            OEMs: https://developer.android.com/studio/run/oem-usb


#### Step 9: Real Device Setup: Create Driver Session using Appium Desktop
            Download link for dummy app:
                  https://github.com/appium/appium/blob/master/sample-code/apps/ApiDemos-debug.apk


#### Step 10: Launch Appium Server


#### Step 11: Install appium inspector from here
                        https://github.com/appium/appium-inspector/releases


#### Step 12: Configure Appium Server GUI and Inspector
####            Go to Appium Server GUI -> Advanced
                        Server address: localhost
                        Port: 4723
                        Allow CORP: yes

####            Go to Appium Inspector
                        Remote host: localhost
                        Port: 4723
                        Path: /wd/hub
                        
                        
#### Step 13: Set appium inspector's require fields
                        1. Launch appium inspector
                        2. Select "Automatic Server"
                        3. Set "Desired Capabilities"
                                    platformName    --- Android/IOS
                                    deviceName      --- Input Device Name 
                                    automationName  --- UiAutomator2                     //appium uses uiautomator2 framewwork to communicate with the android device
                                    udid            --- Input id here                    //unique identifier for the device
                                    app             --- input full path of the apk file  //Example: C:\Imran\Testing\Mobile Automation\APK files\ApiDemos-debug.apk
              
              
#### How to get udID?
            -> Open CMD
            -> Write command "adb devices"
                        Example: emulator-5554
                

#### Step 14: Install IDE (Eclipse)


#### Step 15: Create a Maven project and add below dependencies
                        1. Java Client          --------  https://mvnrepository.com/artifact/io.appium/java-client/8.2.0


#### Step 16: Copy and paste the APK file to src/main/resources in the project.


#### Step 17: Create a Scripted driver session from Java Program in Eclipse   // Find it here src/main/java/

#### Note: Keep the andrioid studio, virtual device, appium server open so that after ruunning the driver session program it can launch the app in virtua; device.


#### Step 18: Launch simulator automatically without launching it on Android studio by below steps
                        1. Android studio -> AVD manager -> get the device name (N.B: Not the display name)
                        
                        2. Set below capabilities
                                    caps.setCapability("avd","Pixel_3_API_30");                    // it will get the device name from android studio
		            caps.setCapability("avdLauchTimeout", 180000);              //it will automatically boot up and launch device
                                    
				    
#### Step 18: Attaching Appium Inspector to an Existing Driver Session
			1. Get the session ID by printing it in Eclipse. Use the below line:
				System.out.println("Session ID:" +driver.getSessionId());
			
			2. Open Appium Inspector, Select "Attach to session", input session ID or click on reload sign to select the session. After launching it, it will launch the application on Inspector as well.
			
## Notes
###  ⚫ What is Appium?
        --- Appium is an open-source framework that allows QAs to conduct automated app testing on different platforms like Android, iOS, and Windows.

####    It automates testing for:
        --- Native Mobile Applications that are written using iOS, Android, or Windows SDKs
        --- Mobile Web Applications that can be accessed using mobile browsers such as Safari, Chrome, or in-built native browser applications for android devices
        --- Hybrid Mobile Applications that have a native wrapper around the web view
        
        
###  ⚫ Architecture Of Appium
        --- There are 3 components included in it:
             1. Appium Client: The automation scripted code is what we call as Appium Client.
             
             2. Appium Server: Appium server is written using Node.js programming language. It receives connection and command requests from the Appium client in JSON format and executes that command on mobile devices. The Server is necessary to be installed in the machine and is started before invoking the automation code.
             
             3. End device: This is mostly a real-time mobile device or an emulator. The automation scripts are executed in the end device by the Appium server by the commands from the client.


###  ⚫ Features of Appium
        --- Appium does not require application source code or library.
        --- Appium provides a strong and active community.
        --- Appium has multi-platform support i.e., it can run the same test cases on multiple platforms.
        --- Appium allows the parallel execution of test scripts.
        --- In Appium, a small change does not require re-installation of the application.
        --- Appium supports various languages like C#, Python, Java, Ruby, PHP, JavaScript with node.js, and many others that have Selenium client library.


###  ⚫ Advantages of Appium
        --- Appium is an open-source tool, which means it is freely available. It is easy to install.
        --- It allows the automated testing of hybrid, native, and web applications.
        --- Unlike other testing tools, you do not need to include any additional agents in your app to make Appium compatible with automation. It tests the same app, which is going to upload in App Store.
        --- An additional feature added to Appium. Now it would support desktop application testing for windows as well along with mobile application testing.
        --- Appium is a cross-platform, freely available mobile testing tool, which allows us the cross-platform mobile testing. This means you can test on multiple platforms (single API for both Android and IOS platforms).


###  ⚫ Disadvantages of Appium
         --- Lack of detailed reports.
         --- Since the tests depend on the remote web driver, so it is a bit slow.
         --- It is not a limitation, but an overhead that Appium uses UIAutomator for Android that only supports Android SDK, API 16, or higher. However, Appium supports older APIs, but not directly. It uses another open-source library Selendroid to support older APIs.
         --- In iOS, only one instance (iOS Script) can run on one Mac OS device, which means one test can be executed at a time per Mac. If you want to run your tests on multiple iOS devices at the same time, you need to arrange the same number of Mac machines. But it would be expensive to arrange various Mac machines.
         --- Solution: This problem can be resolved if you will run your script in the mobile cloud of Sauce Lab. Currently, it allows scripts to run on multiple iOS simulators at the same time. 


###  ⚫ How Appium work?
        --- When we install the Appium, a server is also installed with it on our machine that exposes the REST API.
        --- It receives command and connection requests from the client and executes that command on devices like iOS or Android.
        --- It replies with the HTTP responses.
        --- To execute requests, it uses a mobile test automation framework to run the user interface of the app. For Example -
                        Apple instruments used for iOS
                        Selendroid used for Android API 15 or less
                        UIAutomator used for Android API 16 or higher


###  ⚫ Limitation of Appium
        --- Microsoft Windows does not support running Appium Inspector.
        --- Appium does not allow the testing for Android versions lower than 4.2.
        --- Appium provides limited support for testing Hybrid applications. E.g., Switching action of application is not possible to test i.e., web app to native app and vice versa.


###  ⚫ Is Appium similar to Selenium?
        --- In its architecture, Appium is an HTTP server written in Node. js that creates and handles multiple WebDriver sessions. Appium starts tests on the device and listens for commands from the main Appium server. It is basically the same as the Selenium server that gets HTTP requests from Selenium client libraries.


###  ⚫ What is Appium Inspector?
        --- A GUI inspector for mobile apps and more, powered by a (separately installed) Appium server. Appium Inspector is basically just an Appium client (like WebdriverIO, Appium's Java client, Appium's Python client, etc...) with a user interface. There's an interface for specifying which Appium server to use, which capabilities to set, and then interacting with elements and other Appium commands once you've started a session.
                

###  ⚫ What Are the Different Types of Mobile Apps?
	1. Native apps are created for one specific platform or operating system.
	
	2. Web apps are responsive versions of websites that can work on any mobile device or OS because they’re delivered using a mobile browser.
	
	3. Hybrid apps are combinations of both native and web apps, but wrapped within a native app, giving it the ability to have its own icon or be downloaded from an app store.
	
	
###  ⚫ What Are the Different Types of Mobile Application Testing?
	 Some top mobile testing types: 
		---Usability Testing
		---Performance Testing
		---Security Testing
		---Interruption Testing
		---Manual Testing
		---Compatibility Testing
		---Localization Testing
		---Functional Testing
		---Installation Testing
		---Automation Testing
		
		
###  ⚫ Locator strategies supported by Appium?
####	1. ID
		--- resource-id is used as an element identifier for Android and name is used for iOS.
			driver.findElementById("IntegerA"); // for iOS
			dr.findElement(By.id("android:id/text1")).click(); //for Android
		
####	2. Accessibility ID
		--- For iOS, the default Accessibility ID is set to the name of the UI element. For Android, the value of Accessibility is same as the value of the attribute “content-desc”.
			dr.findElementByAccessibilityId("Accessibility").click();
		
####	3. Class Name
		--- For iOS, Class Name is represented as the full name of the XCUI element and begins with XCUIElementType. For example – UIAButton, UIARadioButton.
			List<WebElement> buttons = driver.findElementsByClassName("android.widget.TextView");
			
####	4. XPath
		---  Xpath should only be used when there is no ID, Name, or accessibility ID assigned to a specific UI element. Although XPath allows for the formulation of complex queries, using XPath is not recommended because it has stability and performance issues.
			MobileElement computeSumButton = driver.findElementByXPath("(//XCUIElementTypeButton)[1]");
			
####	5. Android UI Automator
		---  One needs to use the UI Automator API, in particular, the UISelector Class to search for specific elements. Naturally, this makes it a pre-requisite for QAs to have prior knowledge of UISelector API. In Appium, one needs to send the Java code as a string to the server that is executed in the application’s environment which in turn returns the particular elements.
			String selector = "new UiSelector().text(“Cancel”)).className(“android.widget.Button”))";
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(selector));
			
####	6. Android View Tag (Espresso Only)
		--- Similar to Android UI Automator, this is also an Android platform-specific locator. It allows QAs to locate elements using its view tag.
		
####	7. iOS UI Automation
		--- This is an iOS platform-specific locator. It enables QAs or developers to use Apple’s Instruments framework to locate elements while automating tests for iOS apps.
			String selector = "**/XCUIElementTypeCell[`name BEGINSWITH "P"`]/XCUIElementTypeButton[4]";
			MobileElement element = (MobileElement)
