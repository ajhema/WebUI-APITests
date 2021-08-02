package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	@FindBy(linkText = "Electronics")
	WebElement electronicsMenu;
	
	@FindBy(id = "gh-ac")
	WebElement searchInputTextfield;
	
	@FindBy(id = "gh-btn")
	WebElement searchButton;
	
	public HomePage(WebDriver browser)
    {
        this.driver = browser;
        PageFactory.initElements(browser, this);
    }
	/*
	 * Getter methods
	 */
	public WebElement getElectronicsMenu()
    {
        return electronicsMenu;
    }
	
	public WebElement getSearchInputTextfield()
    {
        return searchInputTextfield;
    }
	
	public WebElement getSearchButton()
    {
        return searchButton;
    }
	
	public void navigateToHomePage()
	{
	    driver.navigate().to("https://ebay.com.au");
	}

	public void clickElectronicsMenu()
	{
	    getElectronicsMenu().click();    
	     
	}
	
	public void enterSearchInput(String searchitem) 
	{
		getSearchInputTextfield().sendKeys(searchitem);
	}
	
	public void clickSearchButton() 
	{
		getSearchButton().click();
	}
}
