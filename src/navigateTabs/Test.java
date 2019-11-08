package navigateTabs;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import item.Login;
import item.Search;


public class Test {
	
	private static WebDriver driver;
	
	
	
	private void Navigatesub() throws InterruptedException
	{
		getDriver1().get("https://www.ovenstory.in");
		Search objSearch = new Search(driver);
		objSearch.searchLocation("Bhandup West");
		
		WebDriverWait objWait = new WebDriverWait(driver,600);
		objWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@class='headerIcon']"))));
		
		
		driver.findElement(By.xpath("//a[@class='headerIcon']")).click();
		driver.findElement(By.xpath("//li[@class='sidebarLink']//a[@href='/collections']")).click();
		
		
		driver.findElement(By.xpath("//a[@class='headerIcon']")).click();
		driver.findElement(By.xpath("//li[@class='sidebarLink']//a[@href='/party-orders']")).click();
		objWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h1[@class='partyOrdersHeading']"))));
		
		driver.findElement(By.xpath("//a[@class='headerIcon']")).click();
		driver.findElement(By.xpath("//li[@class='sidebarLink']//a[@href='/terms']")).click();
		objWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@class='termsPage']"))));
		
		driver.findElement(By.xpath("//a[@class='headerIcon']")).click();
		driver.findElement(By.xpath("//li[@class='sidebarLink']//a[@href='/privacy']")).click();
	}
	
	private void ChangeLocation() throws InterruptedException
	{
		getDriver1().get("https://www.ovenstory.in");
		Search objSearch = new Search(driver);
		objSearch.searchLocation("Bhandup West");
		driver.findElement(By.xpath("//header[@class='header collectionsHeader']//span[@class='locationNameHeader']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Type delivery location']")).sendKeys("Powai" + Keys.ENTER);
	}
	
public static void main(String[] args) throws InterruptedException {
	
	Test objTst = new Test();
	
	objTst.Navigatesub();
	//objTst.ChangeLocation();
		
}

public static WebDriver getDriver1() {
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
