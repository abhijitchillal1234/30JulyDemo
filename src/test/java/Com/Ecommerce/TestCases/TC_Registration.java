package Com.Ecommerce.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;
import Com.Ecommerce.PageClass.TC_Ecommerce_Registration;

public class TC_Registration extends Ecommerce_BaseClass{
	
	@Test
	public void Registartiontestcase() {
		
			TC_Ecommerce_Registration TER = new TC_Ecommerce_Registration();
			
			JavascriptExecutor Js = (JavascriptExecutor)driver;
			
			WebElement Ele = driver.findElement(By.xpath("//button[@type=\"button\"]"));
			
			Js.executeScript("arguments[0].scrollIntoView()", Ele);
			
			TER.Newcustomer();
			logger.info("New customer registration");
			TER.Register1();
			logger.info("Click on register nutton");
			TER.Firstname1("rawan");
			logger.info("First name");
			TER.Lastname("rawan");
			logger.info("Last name");
			TER.Email1("rawan124@gmail.com");
			logger.info("Users email");
			TER.Password1("rawan123");
			logger.info("Enter Password");
			TER.Confirmpassword1("rawan123");
			logger.info("Confirm password");
			TER.Registerbutn1();
			logger.info("Click on register button");
			TER.Registercomplete1();
			logger.info("Registration completed");
			
			
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}