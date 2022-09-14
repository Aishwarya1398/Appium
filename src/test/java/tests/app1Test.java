package tests;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pages.app1Page;


public class app1Test extends BaseClass{

	
	
	@Test
	public void tc1() throws MalformedURLException, InterruptedException {

		AndroidDriver<AndroidElement> driver =capabilities();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		app1Page ap= new app1Page(driver);
		
		ap.onetc();
	
		
		}
}

