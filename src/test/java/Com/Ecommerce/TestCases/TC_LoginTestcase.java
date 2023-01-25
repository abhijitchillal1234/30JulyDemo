package Com.Ecommerce.TestCases;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;
import Com.Ecommerce.PageClass.TC_Ecommerce_Login_Page;public class TC_LoginTestcase extends Ecommerce_BaseClass{
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
		Thread.sleep(3000);
		if(driver.getTitle().equals("nopCommerce demo store")) {			
			AssertJUnit.assertTrue(true);
			logger.info("Login successfully");
		}
		else {
			
			getScreenshotAs("LoginTestCase");
			AssertJUnit.assertTrue(false);
			logger.info("Login failed");
		}		
	}
}
