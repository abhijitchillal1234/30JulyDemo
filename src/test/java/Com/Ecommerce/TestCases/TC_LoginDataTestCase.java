package Com.Ecommerce.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;
import Com.Ecommerce.PageClass.TC_Ecommerce_Login_Page;
import Com.Ecommerce.Utilitities.XLUtils;

public class TC_LoginDataTestCase extends Ecommerce_BaseClass{
	
	@Test(dataProvider= "LoginData")
	public void LoginTestCase(String user , String pwd , String Expected) throws InterruptedException, IOException {		
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
		String Actual_Result = driver.getTitle();
		String Expected_Result = "nopCommerce demo store";
		
		if(Expected.equals("Valid")) {
			
			if(Expected_Result.equals(Actual_Result)) {
				
				TEL.Logout1();
				
				Assert.assertTrue(true);
			}
			else {
				
				Assert.assertTrue(false);
			}
		}
		
		else if(Expected.equals("Invalid")) {
			
         	if(Expected_Result.equals(Actual_Result)) {
				
				TEL.Logout1();
				
				Assert.assertTrue(false);
			}
			else {
				
				Assert.assertTrue(true);
			}
		}
		
		System.out.println("Hello");
		
		
		
}
	@DataProvider(name = "LoginData")
	public String[][] getdata() throws IOException {
		
		String path = System.getProperty("user.dir")+"\\src\\main\\java\\Com\\Ecommerce\\TestData\\30JulyTestData.xlsx";
		
		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int cellnum = XLUtils.getCellCount(path, "Sheet1", 1);
		
		String logindata[][] = new String[rownum][cellnum];
		
		for(int i=1;i<=rownum;i++) {
			
			for(int j=0;j<cellnum;j++) {
				
				logindata[i-1][j] = XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		
		return logindata;
	}


}