package item;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import OvenFramework.CommonActions;

public class Search extends CommonActions{
	
	private WebDriver driver;
	public static By objSearchInput = By.id("locationSearchInput");
	
	public Search(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	public void searchLocation(String searchLoc) throws InterruptedException {
		Thread.sleep(1000);
		WebElement searchInput = driver.findElement(objSearchInput); 
		searchInput.sendKeys(searchLoc + Keys.ENTER);
		Thread.sleep(3000);
	}
}