package genericLib;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class BaseClass {
	
	
		public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException, InterruptedException  {
			AndroidDriver<AndroidElement> driver;

			File app= new File("C:\\Users\\User\\Documents\\Automation1\\AppiumProject\\apk\\base.apk");
		
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		//caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, 12);
			
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus Nord");
		//caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 10);
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		caps.setCapability(MobileCapabilityType.APP,app.getAbsolutePath() );
		caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.justdial.search");
		caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.justdial.search.SplashScreenNewActivity");
		
		//caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\User\\Documents\\Automation1\\AppiumProject\\apk\\ApiDemos-debug.apk");
	
		//caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
	 driver= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		return driver;
		
	}


}
