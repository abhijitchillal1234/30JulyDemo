package Com.Ecommerce.PageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;

public class TC_Ecommerce_AddReview extends Ecommerce_BaseClass{
	
	public TC_Ecommerce_AddReview() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()=\"Electronics \"]")           //moseover
	public WebElement Electronics;
	
	@FindBy(xpath = "//a[contains(text(),\"Cell phones \")]")           //click
	public WebElement Cellphone;
	
	@FindBy(xpath = "//a[contains(text(),'HTC One Mini Blue')]")       //click
	public WebElement Product;
	
	@FindBy(xpath = "//a[contains(text(),\"Add your review\")]")           //click
	public WebElement Review;
	
	@FindBy(xpath ="//div[@class=\"title\"]")                        //display   
	public WebElement Text;                       
	
	@FindBy(id = "AddProductReview_Title")                //sendkey
	public WebElement Reviewtitle;
	
	@FindBy(id = "AddProductReview_ReviewText")             //sendkey
	public WebElement Reviewtext;
	
	@FindBy(id = "addproductrating_4")              //click
	public WebElement Rating;
	
	@FindBy(xpath ="(//button[@type=\"submit\"])[2]")       //click
	public WebElement Submit;
	
	@FindBy(xpath = "//div[@class=\"result\"]")           //display
	public WebElement Successmessage;
	
	public void Cellphone1() {
		
		Cellphone.click();
	}
	public void Product1() {
		
		Product.click();
	}
	public void Review1() {
		
		Review.click();
	}
	public void Text1() {
		
		Text.isDisplayed();
	}
	public void Reviewtitle1(String title) {
		
		Reviewtitle.sendKeys(title);
	}
	public void Reviewtext(String text) {
		
		Reviewtext.sendKeys(text);
	}
	public void Rating1() {
		
		Rating.click();
	}
	public void Submit1() {
		
		Submit.click();
	}
	public void Successmessage1() {
		
		Successmessage.isDisplayed();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
