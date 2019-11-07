package item;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search {
	
	private WebDriver driver;
	private By objSearchInput = By.id("locationSearchInput");
	
	public Search(WebDriver driver) {
		this.driver = driver;
	}
	
	public void searchLocation(String searchLoc) throws InterruptedException {
		WebElement searchInput = driver.findElement(objSearchInput); 
		searchInput.sendKeys(searchLoc + Keys.ENTER);
		Thread.sleep(3000);
	}
}