package item;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Collections {
	
	private WebDriver driver;
	private By objHeader = By.xpath("//*[@class='header collectionsHeader']");
	
	public Collections(WebDriver driver) {
		this.driver = driver;
	}
	
	public void selectItem() throws InterruptedException {
		
		//Wait for location field to be disappear
		WebDriverWait objWait = new WebDriverWait(driver,60);
		objWait.until(ExpectedConditions.visibilityOf(driver.findElement(objHeader)));
		
		//Clicking 'Add' button of first item
		CommonActions objActions = new CommonActions(driver);
		objActions.clickElement(By.xpath("(//a[@id='addProductCombo'])[1]"));
	}
	
	public void saveSelection() throws InterruptedException {
		
		//Click on 'SAVE' button
		CommonActions objActions = new CommonActions(driver);
		objActions.clickElement(By.xpath("//a[text()='SAVE']"));
	}
}