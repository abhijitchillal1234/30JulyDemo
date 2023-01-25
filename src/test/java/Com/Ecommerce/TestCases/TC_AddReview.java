package Com.Ecommerce.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;
import Com.Ecommerce.PageClass.TC_Ecommerce_AddReview;
import Com.Ecommerce.PageClass.TC_Ecommerce_Login_Page;

public class TC_AddReview extends Ecommerce_BaseClass{
	
	@Test
	public void AddReview() throws InterruptedException {
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
	
	
	TC_Ecommerce_AddReview TEA = new TC_Ecommerce_AddReview();
	
	WebElement Ele = driver.findElement(By.xpath("//a[text()=\"Electronics \"]"));
	
	Actions Ac = new Actions(driver);
	
	JavascriptExecutor Js = (JavascriptExecutor)driver;
	
	Ac.moveToElement(Ele).perform();
	logger.info("Mouseover on Electronics");
	TEA.Cellphone1();
	logger.info("Click on Cellphones");
	WebElement Ele1 = driver.findElement(By.xpath("//a[contains(text(),'HTC One Mini Blue')]"));
	Js.executeScript("arguments[0].scrollIntoView()", Ele1);
	TEA.Product1();
	logger.info("Click on product");
	TEA.Review1();
	logger.info("Click on review");
	TEA.Text1();
	logger.info("Text of review");
	TEA.Reviewtitle1("Sample Review");
	logger.info("Add title of review");
	TEA.Reviewtext("This is Sample review");
	logger.info("Add text of review");
	TEA.Rating1();
	logger.info("Give the rating");
	TEA.Submit1();
	logger.info("Submit review");
	TEA.Successmessage1();
	logger.info("Successfully add the review");
	
	
	
	
	
	
	
	
	
	
	
	

}
}