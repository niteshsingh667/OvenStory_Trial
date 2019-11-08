package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import OvenFramework.CommonActions;
import OvenFramework.CommonUtility;
import item.Search;

public class CommonTests {
	
	protected WebDriver driver;
	protected CommonActions objActions ;

	@BeforeTest
	public void navigateToOvenStory() throws InterruptedException {
		CommonUtility objUtility = new CommonUtility();
		driver = objUtility.getDriver();
		
		objActions = new CommonActions(driver);
		
		//Navigate to 'https://www.ovenstory.in'
		driver.get("https://www.ovenstory.in");

		//Search for 'Bhandup West' in Location field
		Search objSearch = new Search(driver);
		objActions.waitForElement(Search.objSearchInput);
		objSearch.searchLocation("Bhandup West");
	}
	
	@AfterTest
	public void closeBrowser(){
		driver.quit();
	}
	

}
