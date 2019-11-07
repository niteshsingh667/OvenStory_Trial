package item;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Customize {
	
	private WebDriver driver;
	private By customizePopup = By.xpath("//div[@class='makeYourComboContainer ']");
	
	public Customize(WebDriver driver) {
		this.driver = driver;
	}
	
	public void customizeItem() throws InterruptedException {
		
		if(driver.findElements(customizePopup).size()>0) {
			CommonActions objActions = new CommonActions(driver);
			
			//Select Base - first Option
			objActions.clickElement(By.xpath("(//div[@class='comboBaseCustomise'])[1]//input/following-sibling::span"));
			
			//Select Extras - first Option
			objActions.clickElement(By.xpath("(//div[@class='comboExtraCustomise'])[1]//input/following-sibling::span"));
			
			//Click 'NEXT' button
			objActions.clickElement(By.xpath("//a[text()='NEXT']"));
		}
	}
}
