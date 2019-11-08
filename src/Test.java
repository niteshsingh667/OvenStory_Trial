import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class Test {
	
	private  WebDriver driver;
	
	public Test (WebDriver driver) {
		this.driver = driver;
	}
	
	private void Navigatesub()
	{
		
		driver.findElement(By.xpath("//a[@class='headerIcon']")).click();
		driver.findElement(By.xpath("//li[@class='sidebarLink']//a[@href='/collections']")).click();
		driver.findElement(By.xpath("//a[@class='headerIcon']")).click();
		driver.findElement(By.xpath("//li[@class='sidebarLink']//a[@href='/party-orders']")).click();
		driver.findElement(By.xpath("//a[@class='headerIcon']")).click();
		driver.findElement(By.xpath("//li[@class='sidebarLink']//a[@href='/terms']")).click();
		driver.findElement(By.xpath("//a[@class='headerIcon']")).click();
		driver.findElement(By.xpath("//li[@class='sidebarLink']//a[@href='/privacy']")).click();
	}
	
	private void ChangeLocation()
	{
		driver.findElement(By.xpath("//header[@class='header collectionsHeader']//span[@class='locationNameHeader']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Type delivery location']")).sendKeys("Powai");
		driver.findElement(By.xpath("//input[@placeholder='Type delivery location']")).sendKeys(Keys.ENTER);
	}
}
