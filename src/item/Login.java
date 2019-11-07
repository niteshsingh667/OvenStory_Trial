package item;

import java.util.HashMap;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Login {
	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		//Navigate to 'https://www.ovenstory.in'
		getDriver().get("https://www.ovenstory.in");
		
		//Search for 'Bhandup West' in Location field
		Search objSearch = new Search(driver);
		objSearch.searchLocation("Bhandup West");
		
		//Clicking 'Add' button of first item
		Collections objColl = new Collections(driver);
		objColl.selectItem();
		
		//Customize item 
		Customize objCustomize = new Customize(driver);
		objCustomize.customizeItem();
		
		//Click on 'SAVE' button
		objColl.saveSelection();
	
		//Click on Checkout button
		Cart objCart = new Cart(driver);
		objCart.checkOut();
	}

	public static WebDriver getDriver() {
		/** Browser Capabilities Instance */
		DesiredCapabilities capability;

		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("profile.default_content_setting_values.notifications", 2);
		chromePrefs.put("profile.default_content_setting_values.automatic_downloads", 1);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		options.addArguments("no-sandbox");
		options.addArguments("disable-gpu"); 
		options.addArguments("disable-dev-shm-usage");					
		options.addArguments("start-maximized");
		options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capability = new DesiredCapabilities();
		capability.setCapability("idleTimeout", 300);
		options.merge(capability);
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\eclipse\\OvenStory_Trial\\chromedriver.exe");
		driver = new ChromeDriver(options);
		return driver;
	}
	
}