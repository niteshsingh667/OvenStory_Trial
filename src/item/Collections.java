package item;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import OvenFramework.CommonActions;

public class Collections extends CommonActions{
	
	private WebDriver driver;
	private By objHeader = By.xpath("//*[@class='header collectionsHeader']");
	
	public Collections(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	public void selectItem() throws InterruptedException {
		
		//Wait for location field to be disappear
		waitForElement(objHeader);
		
		//Clicking 'Add' button of first item
		clickElement(By.xpath("(//a[@id='addProductCombo'])[1]"));
	}
	
	public void saveSelection() throws InterruptedException {
		
		//Click on 'SAVE' button
		clickElement(By.xpath("//a[text()='SAVE']"));
	}
}