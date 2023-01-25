package Com.Ecommerce.PageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;

public class TC_Ecommerce_Filterbaseproduct extends Ecommerce_BaseClass {
	
	
	public TC_Ecommerce_Filterbaseproduct() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),\"Apparel \")]")     //mouse over
	public WebElement Apparel;
	
	@FindBy(xpath = "//a[contains(text(),\"Shoes \")]")      
	public WebElement Shoes;
	
	@FindBy(xpath = "//div[@class=\"filter-title\"]")        
	public WebElement Filtertitle;
	
	@FindBy(id = "attribute-option-15")           
    public WebElement Colour;
	
	@FindBy(xpath = "//h2[@class=\"product-title\"]")   
	public WebElement Redshoes;
	
	public void Shoes1() {
		
		Shoes.click();
	}
	public void Filtertitle1() {
		
		Filtertitle.isDisplayed();
	}
	public void Colour1() {
		
		Colour.click();
	}
	public void Redshoes1() {
		
		Redshoes.isDisplayed();
	}
	
	
	
	
	
	
	
	
	
	

}
