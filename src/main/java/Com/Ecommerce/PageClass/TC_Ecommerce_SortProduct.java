package Com.Ecommerce.PageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;

public class TC_Ecommerce_SortProduct extends Ecommerce_BaseClass{
	
	public TC_Ecommerce_SortProduct() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),\"Electronics \")]")
	public WebElement Electronics;
	
	@FindBy(xpath = "//a[contains(text(),\"Camera & photo \")]")             //click
	public WebElement CameraPhoto;
	
	@FindBy(id = "products-orderby")                        //click
	public WebElement Sortby;
	
	@FindBy(xpath = "//h2[@class=\"product-title\"]")           //display
	public WebElement LowToHigh;
	
	public void CameraPhoto1() {
		
		CameraPhoto.click();
	}
	public void Sortby1() {
		
		Sortby.click();
	}
	public void LowToHigh1() {
		
		LowToHigh.isDisplayed();
	}
	

}
