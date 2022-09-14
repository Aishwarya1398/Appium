package genericLib;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class JusD extends BaseClass{
	
	//Hardcoding
	
	@Test
	public void test1() throws InterruptedException, MalformedURLException {
		
		AndroidDriver<AndroidElement> driver=capabilities();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.Button[@text='AGREE AND CONTINUE']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.TextView[@text='Maybe Later']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.Button[@text='While using the app']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.Button[@text='Allow']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.Button[@text='Allow']").click();
		Thread.sleep(3000);
		driver.findElementById("com.justdial.search:id/search_edit_text_home").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.MultiAutoCompleteTextView[@resource-id='com.justdial.search:id/search_edit_text']").sendKeys("hotels");
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.TextView[@text='Hotels']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.TextView[@text='4 Star Hotels']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//android.widget.TextView[@text='Book a Room'])[1]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.Button[@text='Search']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.TextView[@text='Davanam Sarovar Portico Suites']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.TextView[@text='Reserve for 1 night']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.Button[@text='Reserve']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.Button[@text='Next step ']").click();
		
		
		
		
		
		
	}


}
