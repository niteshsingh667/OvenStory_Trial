package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class LocationChange extends CommonTests {

	@Test
	private void ChangeLocation() throws InterruptedException {
		
		String newLocation = "Powai";
		
		objActions
				.waitForElement(
						By.xpath("//header[@class='header collectionsHeader']//span[@class='locationNameHeader']"))
				.click();

		// Wait introduced here for the user to view the navigation
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Type delivery location']")).sendKeys(newLocation + Keys.ENTER);

		// Wait introduced here for the user to view the navigation
		Thread.sleep(2000);
		
		if(driver.findElement(By.xpath("//header[@class='header collectionsHeader']//span[@class='locationNameHeader']")).getText().equals(newLocation)) {
			System.out.println("Location changed to " + newLocation);
		}
	}

}
