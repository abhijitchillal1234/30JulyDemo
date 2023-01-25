package Com.Ecommerce.PageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;

public class TC_Ecoomerce_Wishlist extends Ecommerce_BaseClass{
	
	public TC_Ecoomerce_Wishlist() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),\"Books \")]")
	public WebElement Books;
	
	@FindBy(xpath = "//a[contains(text(),\"Fahrenheit 451 by Ray Bradbury\")]")
	public WebElement Product;
	
	@FindBy(id = "add-to-wishlist-button-37")
	public WebElement Wishlist;
	
	@FindBy(xpath = "//p[@class=\"content\"]")
    public WebElement Message;
	
	@FindBy(xpath = "//span[@title=\"Close\"]")
	public WebElement Close;
	
	public void Books1() {
		
		Books.click();
	}
	public void Product1() {
		
		Product.click();
	}
	public void Wishlist1() {
		
		Wishlist.click();
	}
	public void Message1() {
		
		Message.isDisplayed();
	}
	public void Close1() {
		
		Close.click();
	}
}
