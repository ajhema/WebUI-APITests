package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import pages.HomePage;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

public class Utility {
	WebDriver driver;
	HomePage hompg;
	String expectedTextToVerify;
	
	public void navigationForHomePage()
	  {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		hompg = new HomePage(driver);
	    hompg.navigateToHomePage();
	  }

	public void loadElectronicsPage() 
	  {
		hompg.clickElectronicsMenu();
	  }
	
	public void verifyElectronicsPage()
    {
      String titleElectronicsPage;
      titleElectronicsPage = driver.getTitle();
      Assert.assertEquals("Electronics products for sale | eBay AU", titleElectronicsPage);
    }
	
	public void searchItem(String searchitem)
	{
		hompg.enterSearchInput(searchitem);
		hompg.clickSearchButton();
		expectedTextToVerify = searchitem;
		System.out.println(expectedTextToVerify);
	}
	
	public void verifySearch()
	{
		String titleSearchResultsPage;
		titleSearchResultsPage = driver.getTitle();
	    assertThat(titleSearchResultsPage, containsString(expectedTextToVerify));	
	}
	
	public void exit()
    {
        try
        {
            driver.quit();
        }catch (Exception ignore) { }
        driver = null;
    }
}
