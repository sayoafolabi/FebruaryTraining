package cucumber.pages;

import org.openqa.selenium.WebElement;

import cucumber.helper.Helper;

public class AutotraderHomepage extends Helper
{
	private WebElement logo;
	private WebElement postalcode;
	private WebElement distance;
	private WebElement make;
	private WebElement searchCarButton;
	
	public void navigateToAutotraderHomepage() throws Exception
	{
		launchUrl("http://www.autotrader.co.uk/");
	}
	
	public void autotraderLogoIsDisplayed() throws Exception
	{
		logo = getElementByCssSelector(".at-logo.tracking-header-link");
		VerifyAnElementIsDisplayed(logo);
	}
	
	public void enterCustomerPostcode() throws Exception
	{
		postalcode = getElementById("postcode");
		typeGivenValues(postalcode, "OL9 8LE");
	}
	
	public void enterPostcode(String postcode) throws Exception
	{
		postalcode = getElementById("postcode");
		typeGivenValues(postalcode, postcode);
	}
	
	public void selectDistanceToPostcode() throws Exception
	{
		distance = getElementById("radius");
		selectByText(distance, "Within 45 miles");
	}
	
	public void selectDistanceTo(String dist) throws Exception
	{
		distance = getElementById("radius");
		selectByText(distance, dist);
	}
	
	public void selectCarMake() throws Exception
	{
		make = getElementById("searchVehiclesMake");
		
		selectByValue(make, "AUDI");
	}
	
	public void selectCarMake(String car) throws Exception
	{
		make = getElementById("searchVehiclesMake");
		
		selectByValue(make, car.toUpperCase());
	}
	
		
	public AutotraderSearchResultPage submitSearchCriteria() throws Exception
	{
		searchCarButton = getElementById("search");
		
		clickAnElement(searchCarButton);
		
		return new AutotraderSearchResultPage();
		
	}
	
}
