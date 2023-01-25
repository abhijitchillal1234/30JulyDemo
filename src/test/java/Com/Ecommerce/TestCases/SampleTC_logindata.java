package Com.Ecommerce.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;
import Com.Ecommerce.PageClass.TC_Ecommerce_Login_Page;
import Com.Ecommerce.Utilitities.SampleXLUtils;

public class SampleTC_logindata extends Ecommerce_BaseClass{
	
	@Test(dataProvider= "logindata")
	public void LoginTestCase(String U , String P , String Expected) throws InterruptedException, IOException {
	logger.info("Open URL");
	TC_Ecommerce_Login_Page TEL  = new TC_Ecommerce_Login_Page();
	Thread.sleep(3000);
	TEL.SetUsername(U);
	logger.info("Enter user mail");
	Thread.sleep(3000);
	TEL.SetPassword(P);
	logger.info("Enter User password");
	Thread.sleep(3000);
	TEL.ClickButton();
	logger.info("Clicked on login button");
	Thread.sleep(3000);
	String Actualtitle = driver.getTitle();
	String Expectedtitle = "nopCommerce demo store";
	
//	SampleXLUtils SX = new SampleXLUtils();
	
	if(Expected.equals("Valid")) {
		
		if(Expectedtitle.equals(Actualtitle)) {
			
			Assert.assertTrue(true);
			
			TEL.Logout1();
		}
		else {
			Assert.assertTrue(false);
		}
	}
	
	else if(Expected.equals("Invalid")) {
		
		if(Expectedtitle.equals(Actualtitle)) {
			
			Assert.assertTrue(false);
			
			TEL.Logout1();
		}
		else {
			Assert.assertTrue(true);
		}
	}
	
	}
	
	@DataProvider(name = "logindata")
	public String[][] data1() throws IOException {
		
		String path = System.getProperty("user.dir")+"\\src\\main\\java\\Com\\Ecommerce\\TestData\\30JulyTestData.xlsx";
		
		int row1 = SampleXLUtils.getRowCount(path, "Sheet1");
		int cell1 = SampleXLUtils.getCellCount(path, "Sheet1", 1);
		
		String S [][] = new String[row1][cell1];
		
		for(int a=1;a<=row1;a++) {
			
			for(int b=0;b<cell1;b++) {
				
				S[a-1][b] = SampleXLUtils.fetchdata(path, "Sheet1", a, b);
				
			}
		}
		
		
		return S;
		
	}
}
