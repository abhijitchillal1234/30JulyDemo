package Com.Ecommerce.PageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;

public class TC_Ecommerce_Registration extends Ecommerce_BaseClass{
	
	
	public TC_Ecommerce_Registration() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class=\"title\"]")
	public WebElement Newcustomer;
	
	@FindBy(xpath = "//button[@type=\"button\"]")
	public WebElement Register;
	
	@FindBy(id = "FirstName")
	public WebElement Firstname;
	
	@FindBy(id = "LastName")
	public WebElement Lastname;
	
	@FindBy(id = "Email")
	public WebElement Email;
	
	@FindBy(id = "Password")
	public WebElement Password;
	
	@FindBy(id = "ConfirmPassword")
	public WebElement Confirmpassword;
	
	@FindBy(id = "register-button")
	public WebElement Registerbutn;
	
	@FindBy(xpath = "//div[contains(text(),\"Your registration completed\")]")
	public WebElement Registercomplete;
	
	public void Newcustomer() {
		
		Newcustomer.isDisplayed();
	}
	public void Register1() {
		
		Register.click();
	}
	public void Firstname1(String FN) {
		
		Firstname.sendKeys(FN);
	}
	public void Lastname(String LN) {
		
		Lastname.sendKeys(LN);
	}
	public void Email1(String Uemail) {
		
		Email.sendKeys(Uemail);
	}
	public void Password1(String Pass) {
		
		Password.sendKeys(Pass);
	}
	public void Confirmpassword1(String Confirmpass) {
		
		Confirmpassword.sendKeys(Confirmpass);
	}
	public void Registerbutn1() {
		
		Registerbutn.click();
	}
	public void Registercomplete1() {
		
		Registercomplete.isDisplayed();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
