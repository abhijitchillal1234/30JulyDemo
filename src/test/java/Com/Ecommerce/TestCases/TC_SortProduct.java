package Com.Ecommerce.TestCases;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;
import Com.Ecommerce.PageClass.TC_Ecommerce_Login_Page;
import Com.Ecommerce.PageClass.TC_Ecommerce_SortProduct;

public class TC_SortProduct extends Ecommerce_BaseClass{
	
	@Test
	public void SortProduct() throws InterruptedException {
	
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
	
	TC_Ecommerce_SortProduct TES = new TC_Ecommerce_SortProduct();
	
	WebElement Element = driver.findElement(By.xpath("//a[contains(text(),\"Electronics \")]"));	
	Actions Ac = new Actions(driver);
	
	Ac.moveToElement(Element).perform();
	logger.info("Mouseover on Electronics");
	TES.CameraPhoto1();
	logger.info("Click on Camera & Photo");
	TES.Sortby1();
	logger.info("Click on Sort By");
	WebElement Ele = driver.findElement(By.id("products-orderby"));
	Select S = new Select(Ele);
	List<WebElement> S1 = S.getOptions();
	System.out.println(S1.size());
	
	for(int a=0;a<S1.size();) {
		
		System.out.println(S1.get(a).getText());
		if(S1.get(a).getText().equals("Price: Low to High")) {
			
               S1.get(a).click();
		}
		break;	
	}
	logger.info("Click on Price-A to Z");
	TES.LowToHigh1();
	logger.info("Low price product display first");
	
	
	
	
	
	
	
	
	
	}
	
	
	

}
