package cucumber.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.helper.Helper;
import cucumber.pages.AutotraderHomepage;
import cucumber.pages.AutotraderSearchResultPage;

public class ParameterizedSteps extends Helper
{
	AutotraderHomepage homepage = new AutotraderHomepage();
	AutotraderSearchResultPage searchPage = new AutotraderSearchResultPage();
	
	@When("^I enter my postcode as \"([^\"]*)\"$")
	public void i_enter_my_postcode_as(String postcode) throws Throwable {
	    homepage.enterPostcode(postcode);
	}

	@When("^I select a distance of \"([^\"]*)\" from my postcode$")
	public void i_select_a_distance_of_from_my_postcode(String distance) throws Throwable {
	    homepage.selectDistanceTo(distance);
	}

	@When("^I select \"([^\"]*)\" from make dropdown$")
	public void i_select_from_make_dropdown(String make) throws Throwable {
		homepage.selectCarMake(make);
	}

	@Then("^the result of the search for \"([^\"]*)\" is displayed$")
	public void the_result_of_the_search_for_is_displayed(String make) throws Throwable {
	   searchPage.IsCarNameContainInTheResultText(make);
	}

	@Then("^all the cars displayed belong only to \"([^\"]*)\"$")
	public void all_the_cars_displayed_belong_only_to(String make) throws Throwable {
	    
	}


}
