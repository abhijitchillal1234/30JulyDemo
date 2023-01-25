package Com.Ecommerce.PageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;

public class TC_Ecommerce_SearchFunctunality extends Ecommerce_BaseClass{
	
	public TC_Ecommerce_SearchFunctunality() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "small-searchterms")
	public WebElement Search;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	public WebElement Searchbutn1;
	
	@FindBy(xpath = "//div[@class=\"warning\"]")
	public WebElement Errormessage;
	
	@FindBy(id = "advs")
	public WebElement Advancesearch;
	
	@FindBy(id = "cid")
	public WebElement Category;
	
	@FindBy(id = "mid")
	public WebElement Manufacturer;
	
	@FindBy(xpath = "(//button[@type=\"submit\"])[2]")
	public WebElement Searchbutn2;
	
	
	public void Search1(String Value) {
		
		Search.sendKeys(Value);
	}
	public void Searchbutn12() {
		
		Searchbutn1.click();
	}
	public void Errormessage1() {
		
		Errormessage.isDisplayed();
	}
	public void Advancesearch1() {
		
		Advancesearch.click();
	}
	public void Categorylist() {
		
		Category.click();
	}
	public void Manufacturer1() {
		
		Manufacturer.click();
	}
	public void Searchbutn21() {
		
		Searchbutn2.click();
	} 
	
	
}
