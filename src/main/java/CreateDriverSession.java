import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CreateDriverSession {
	public void driverSession() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 3");
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
		caps.setCapability(MobileCapabilityType.UDID,"emulator-5554");
		caps.setCapability("newCommandTimeout", 300);
		//caps.setCapability("avd","Pixel_3_API_30");    // it will get the device name from android studio
		//caps.setCapability("avdLauchTimeout", 180000); //it will automatically boot up and launch device
		String appUrl = System.getProperty("user.dir") + File.separator + "src"+ File.separator + "main" + File.separator + "resources"+ File.separator + "ApiDemos-debug.apk";
		caps.setCapability(MobileCapabilityType.APP,appUrl);
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		AppiumDriver driver = new AndroidDriver(url,caps);
		System.out.println("Session ID:" +driver.getSessionId());
		
}
	}
	