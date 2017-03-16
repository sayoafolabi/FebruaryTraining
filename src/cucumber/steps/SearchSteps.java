package cucumber.steps;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.helper.Helper;
import cucumber.pages.AutotraderHomepage;
import cucumber.pages.AutotraderSearchResultPage;

public class SearchSteps extends Helper
{
	AutotraderHomepage homepage = new AutotraderHomepage();	
	AutotraderSearchResultPage searchResult = new AutotraderSearchResultPage();
	
	
	@Given("^I navigate to Autotrader homepage$")
	public void iNavigateToAutotraderHomepage() throws Throwable {
		
		homepage.navigateToAutotraderHomepage();
	}

	@Given("^Autotrader logo is displayed$")
	public void AutotraderHomePageIsDisplayed() throws Throwable {
		
		homepage.autotraderLogoIsDisplayed();
	}

	@When("^I enter my postcode$")
	public void i_enter_my_postcode() throws Throwable {
		homepage.enterCustomerPostcode();
	}

	@When("^I select a distance from my postcode$")
	public void i_select_a_distance_from_my_postcode() throws Throwable {
	   homepage.selectDistanceToPostcode();
	}

	@When("^I select Audi from make dropdown$")
	public void i_select_Audi_from_make_dropdown() throws Throwable {
	   homepage.selectCarMake();
	}

	@When("^I click on Search Cars button$")
	public void i_click_on_Search_Cars_button() throws Throwable {
		searchResult = homepage.submitSearchCriteria();
	}

	@Then("^the result of the search for Audi is displayed$")
	public void the_result_of_the_search_for_Audi_is_displayed() throws Throwable {
	   searchResult.IsSearchResultPageDisplayed();
	   searchResult.isAnyCarDisplayed();
	}

	@Then("^all the cars displayed belong only to Audi$")
	public void all_the_cars_displayed_belong_only_to_Audi() throws Throwable {
	    
	}
}
