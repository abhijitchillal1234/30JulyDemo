package Com.Ecommerce.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;
import Com.Ecommerce.PageClass.TC_Ecommerce_Filterbaseproduct;
import Com.Ecommerce.PageClass.TC_Ecommerce_Login_Page;

public class TC_Filterbaseproduct extends Ecommerce_BaseClass{

	@Test
	public void Filterbaseproduct() throws InterruptedException {
		
		logger.info("Open URL");
		TC_Ecommerce_Login_Page TEL  = new TC_Ecommerce_Login_Page();
		Thread.sleep(1000);
		TEL.SetUsername(username);
		logger.info("Enter user mail");
		Thread.sleep(1000);
		TEL.SetPassword(password);
		logger.info("Enter User password");
		Thread.sleep(1000);
		TEL.ClickButton();
		logger.info("Clicked on login button");
		Thread.sleep(1000);
		
		TC_Ecommerce_Filterbaseproduct TEF = new TC_Ecommerce_Filterbaseproduct();
		
		Actions Ac = new Actions(driver);
		
		WebElement Ele = driver.findElement(By.xpath("//a[contains(text(),\"Apparel \")]"));
		
		Ac.moveToElement(Ele).build().perform();
		logger.info("Mouseover on Apparel");
		TEF.Shoes1();
		logger.info("Click on Shoes");
		TEF.Filtertitle1();
		logger.info("Filter section is display");
		TEF.Colour1();
		logger.info("Select colour");
		TEF.Redshoes1();
		logger.info("Red shoes is display");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
