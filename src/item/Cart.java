package item;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cart {
	
	private WebDriver driver;
	private By cartSection = By.id("recommendedCart");
	private By checkOut = By.id("checkoutBtn");
	
	public Cart(WebDriver driver) {
		this.driver = driver;
	}
	
	public void checkOut() throws InterruptedException {
		
		//Wait for Cart section to appear
		WebElement objCart = driver.findElement(cartSection);
		WebDriverWait objWait = new WebDriverWait(driver,60);
		objWait.until(ExpectedConditions.visibilityOf(objCart));
		
		//Click on Checkout button
		CommonActions objActions = new CommonActions(driver);
		objActions.clickElement(checkOut);
	}
}




