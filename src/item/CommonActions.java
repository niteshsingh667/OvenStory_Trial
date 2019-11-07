package item;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonActions {
	
	private WebDriver driver;

	public CommonActions(WebDriver driver) {
		this.driver = driver;
	}
	
	public void scroll_into_view_element(WebElement element_to_view) throws InterruptedException {
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'auto',block: 'center',inline: 'center'});", element_to_view);
			Thread.sleep(1000);
		} catch (Exception e) {
			Thread.sleep(5000);
		}
	}
	
	public void clickElement(By objElem) throws InterruptedException {
		scroll_into_view_element(driver.findElement(objElem));
		driver.findElement(objElem).click();
	}
}