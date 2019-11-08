package Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NavigationVerification extends CommonTests {

	@Test
	private void Navigatesub() throws InterruptedException {
		objActions.waitForElement(By.xpath("//a[@class='headerIcon']")).click();

		driver.findElement(By.xpath("//li[@class='sidebarLink']//a[@href='/collections']")).click();

		// Wait introduced here for the user to view the navigation
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@class='headerIcon']")).click();
		driver.findElement(By.xpath("//li[@class='sidebarLink']//a[@href='/party-orders']")).click();
		objActions.waitForElement(By.xpath("//h1[@class='partyOrdersHeading']"));

		// Wait introduced here for the user to view the navigation
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@class='headerIcon']")).click();
		driver.findElement(By.xpath("//li[@class='sidebarLink']//a[@href='/terms']")).click();
		objActions.waitForElement(By.xpath("//*[@class='termsPage']"));

		// Wait introduced here for the user to view the navigation
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@class='headerIcon']")).click();
		driver.findElement(By.xpath("//li[@class='sidebarLink']//a[@href='/privacy']")).click();

		// Wait introduced here for the user to view the navigation
		Thread.sleep(2000);
	}

}
