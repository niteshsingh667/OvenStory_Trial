package Tests;

import org.testng.annotations.Test;

import item.Cart;
import item.Collections;
import item.Customize;

public class OrderItem extends CommonTests {

	@Test
	public void addItemtoCart() throws InterruptedException {

		// Clicking 'Add' button of first item
		Collections objColl = new Collections(driver);
		objColl.selectItem();

		// Customize item
		Customize objCustomize = new Customize(driver);
		objCustomize.customizeItem();

		// Click on 'SAVE' button
		objColl.saveSelection();

		// Click on Checkout button
		Cart objCart = new Cart(driver);
		objCart.checkOut();
		
		//Wait introduced here for the user to view the navigation
		Thread.sleep(2000);
	}
}