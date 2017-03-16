package cucumber.pages;

import org.openqa.selenium.WebElement;

import cucumber.helper.Helper;

public class HomePage extends Helper
{
	private WebElement distance;
	private WebElement make;
	private WebElement model;
	
	public void iSelectDistance(String dist) throws Exception
	{
		distance = getElementById("radius");
		selectByText(distance, dist);
	}
	
	public void iSelectMake(String carMake) throws Exception
	{
		make = getElementById("searchVehiclesMake");
		selectByValue(make, carMake.toUpperCase());
		
	}
	
	public void iSelectModel(String modelName) throws Exception
	{
		model = getElementById("searchVehiclesModel");
		selectByValue(model, modelName.toUpperCase());
	}
}
