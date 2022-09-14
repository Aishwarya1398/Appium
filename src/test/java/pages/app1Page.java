package pages;

import org.apache.log4j.Logger;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class app1Page {
	
public static AndroidDriver<AndroidElement> driver;
public app1Page(AndroidDriver<AndroidElement> driver) {
	this.driver=driver;
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	
}
	//elements
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='AGREE AND CONTINUE']")
	private AndroidElement agreeAndContbtn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Maybe Later']")
	private AndroidElement mayBeLaterbtn;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='While using the app']")
	private AndroidElement locationAccess;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Allow']")
	private AndroidElement contactsAccess;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Allow']")
	private AndroidElement photosAccess;
	
	@AndroidFindBy(id = "com.justdial.search:id/search_edit_text_home")
	private AndroidElement searchTF;
	
	@AndroidFindBy(xpath = "//android.widget.MultiAutoCompleteTextView[@resource-id='com.justdial.search:id/search_edit_text']")
	private AndroidElement hotelSearch;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Hotels']")
	private AndroidElement hotelSearch1;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='4 Star Hotels']")
	private AndroidElement star4hotel;
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='Book a Room'])[1]")
	private AndroidElement bookHotel;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Search']")
	private AndroidElement searchBtn;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Davanam Sarovar Portico Suites']")
	private AndroidElement hotelname;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Reserve for 1 night']")
	private AndroidElement resevebtn;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Reserve']")
	private AndroidElement reserve;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step ']")
	private AndroidElement nextStepBtn;
	
	
	//getters
	
	public AndroidElement getStar4hotel() {
		return star4hotel;
	}

	public AndroidElement getBookHotel() {
		return bookHotel;
	}

	public AndroidElement getSearchBtn() {
		return searchBtn;
	}

	public AndroidElement getHotelname() {
		return hotelname;
	}

	public AndroidElement getResevebtn() {
		return resevebtn;
	}

	public AndroidElement getReserve() {
		return reserve;
	}

	public AndroidElement getNextStepBtn() {
		return nextStepBtn;
	}
	
	public AndroidElement getSearchTF() {
		return searchTF;
	}

	public AndroidElement getHotelSearch() {
		return hotelSearch;
	}

	public AndroidElement getHotelSearch1() {
		return hotelSearch1;
	}
	
	public AndroidElement getAgreeAndContbtn() {
		return agreeAndContbtn;
	}

	public AndroidElement getMayBeLaterbtn() {
		return mayBeLaterbtn;
	}

	public AndroidElement getLocationAccess() {
		return locationAccess;
	}

	public AndroidElement getContactsAccess() {
		return contactsAccess;
	}

	public AndroidElement getPhotosAccess() {
		return photosAccess;
	}	


	
	//actions
	
	public void onetc() throws InterruptedException {
		
		agreeAndContbtn.click();
		Logger.getLogger("agree and continue success");
		Thread.sleep(3000);
		mayBeLaterbtn.click();
		Thread.sleep(3000);
		locationAccess.click();
		Thread.sleep(3000);
		contactsAccess.click();
		Thread.sleep(3000);
		photosAccess.click();
		Thread.sleep(3000);
		searchTF.click();
		Thread.sleep(3000);
		hotelSearch.sendKeys("hotels");
		Thread.sleep(3000);
		hotelSearch1.click();
		Thread.sleep(3000);
		star4hotel.click();
		Thread.sleep(3000);
		bookHotel.click();
		Thread.sleep(3000);
		searchBtn.click();
		Thread.sleep(3000);	
		hotelname.click();
		Thread.sleep(6000);
		resevebtn.click();
		Thread.sleep(3000);
		reserve.click();
		Thread.sleep(3000);
		
		nextStepBtn.click();
		
	}
}
