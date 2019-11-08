package OvenFramework;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	public WebElement waitForElement(By objElem) throws InterruptedException {
		WebElement obj = null;
		WebDriverWait objWait = new WebDriverWait(driver,240);
		obj = objWait.until(ExpectedConditions.visibilityOf(driver.findElement(objElem)));
		Thread.sleep(3000);
		return obj;
	}

}