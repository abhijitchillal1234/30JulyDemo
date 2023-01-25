package Com.Ecommerce.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;
import Com.Ecommerce.PageClass.TC_Ecommerce_Login_Page;
import Com.Ecommerce.PageClass.TC_Ecoomerce_Wishlist;

public class TC_Wishlist extends Ecommerce_BaseClass {
	
	@Test
	public void LoginTestCase() throws InterruptedException, IOException {		
		logger.info("Open URL");
		TC_Ecommerce_Login_Page TEL  = new TC_Ecommerce_Login_Page();
		Thread.sleep(3000);
		TEL.SetUsername(username);
		logger.info("Enter user mail");
		Thread.sleep(3000);
		TEL.SetPassword(password);
		logger.info("Enter User password");
		Thread.sleep(3000);
		TEL.ClickButton();
		logger.info("Clicked on login button");
	
		TC_Ecoomerce_Wishlist TEW = new TC_Ecoomerce_Wishlist();
		
		JavascriptExecutor Js = (JavascriptExecutor)driver;
		WebElement Element = driver.findElement(By.id("add-to-wishlist-button-37"));
		
		TEW.Books1();
		logger.info("Click on books");
		Js.executeScript("arguments[0].scrollIntoView()", Element);
		logger.info("Scroll upto wishlist button");
		TEW.Product1();
		logger.info("Click on Product");
		TEW.Wishlist1();
		logger.info("Click on wishlist");
		TEW.Message1();
		logger.info("Message is genrated");
		TEW.Close1();
		logger.info("Close the message");
		
		
		
	
	
	
	
	
	
	
	

}
}