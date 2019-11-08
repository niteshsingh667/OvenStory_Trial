package OvenFramework;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CommonUtility {
	
	protected WebDriver driver;
	
	public CommonUtility() {
	}

	public WebDriver getDriver() {
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
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		driver = new ChromeDriver(options);
		return driver;
	}
}