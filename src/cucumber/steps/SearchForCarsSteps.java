package cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.helper.Helper;
import cucumber.pages.HomePage;

public class SearchForCarsSteps extends Helper
{
	HomePage homepage = new HomePage();
	
	@Given("^I navigate to Autotrader landing$")
	public void i_navigate_to_Autotrader_landing() throws Throwable {
	    launchUrl("http://www.autotrader.co.uk/");
	}

	@When("^I select a distance of \"([^\"]*)\" from the postcode$")
	public void i_select_a_distance_of_from_the_postcode(String distance) throws Throwable {
	   homepage.iSelectDistance(distance);
	}

	@When("^I select \"([^\"]*)\" as the car make$")
	public void i_select_as_the_car_make(String make) throws Throwable {
	    homepage.iSelectMake(make);
	}

	@When("^I select \"([^\"]*)\" as the model$")
	public void i_select_as_the_model(String model) throws Throwable {
	   
	}

	@When("^I select a minimum price of \"([^\"]*)\"$")
	public void i_select_a_minimum_price_of(String minPrice) throws Throwable {
	    
	}

	@When("^I select a maximum price of \"([^\"]*)\"$")
	public void i_select_a_maximum_price_of(String maxPrice) throws Throwable {
	   
	}

	@When("^I click on Search Car button$")
	public void i_click_on_Search_Car_button() throws Throwable {
	    
	}

	@Then("^search result is display$")
	public void search_result_is_display() throws Throwable {
	   
	}



}
