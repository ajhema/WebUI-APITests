package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.Utility;

public class StepDefinition {
    Utility utilobj = new Utility();
	@Given("^I have navigated to ebay website$")
	public void i_have_navigated_to_ebay_website() throws Throwable {
	    utilobj.navigationForHomePage(); 	  
	}

	@When("^I click on electronics menu$")
	public void i_click_on_electronics_menu() throws Throwable {
		utilobj.loadElectronicsPage();
	}

	@Then("^the electronics page is loaded$")
	public void the_electronics_page_is_loaded() throws Throwable {
		utilobj.verifyElectronicsPage();
		utilobj.exit();
	}
	
	/*@When("I enter a search item")
	public void i_enter_a_search_item() {
	    utilobj.searchItem();
	} */
	
	 @When("^I enter a (.+)$")
	    public void i_enter_a(String searchitem) throws Throwable {
		 utilobj.searchItem(searchitem);
	    }
	
	@Then("the search results are displayed")
	public void the_search_results_are_displayed() {
	    utilobj.verifySearch();
	    utilobj.exit();
	}
}
