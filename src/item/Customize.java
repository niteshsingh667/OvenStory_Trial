package item;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import OvenFramework.CommonActions;

public class Customize extends CommonActions{
	
	private WebDriver driver;
	private By customizePopup = By.xpath("//div[@class='makeYourComboContainer ']");
	
	public Customize(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	public void customizeItem() throws InterruptedException {
		
		if(driver.findElements(customizePopup).size()>0) {
			//Select Base - first Option
			clickElement(By.xpath("(//div[@class='comboBaseCustomise'])[1]//input/following-sibling::span"));
			
			//Select Extras - first Option
			clickElement(By.xpath("(//div[@class='comboExtraCustomise'])[1]//input/following-sibling::span"));
			
			//Click 'NEXT' button
			clickElement(By.xpath("//a[text()='NEXT']"));
		}
	}
}
