package cucumber.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import cucumber.helper.Helper;

public class AutotraderSearchResultPage extends Helper
{
	private WebElement noOfCarsReturned;
	private List<WebElement> searchResult;
	
	
	public void IsSearchResultPageDisplayed() throws Exception
	{
		noOfCarsReturned = getElementByCssSelector(".search-form__count.js-results-count");
		
		VerifyAnElementIsDisplayed(noOfCarsReturned);
	}
	
	public void isAnyCarDisplayed() throws Exception
	{
		searchResult = getElementsByClassName("gui-test-search-result-link");
		
		VerifyListOfElementsAreDisplayed(searchResult, 0);
	}
	
	 public void IsAudiContainInTheResultText() throws Exception
	 {
		 searchResult = getElementsByClassName("gui-test-search-result-link");
		 
		 for(WebElement search : searchResult)
		 {
			 String searchText = search.getText();
			 VerifyTextContainSnippet(searchText, "Audi");
		 }
		 
		 
		 
	 }
	 
	 public void IsCarNameContainInTheResultText(String car) throws Exception
	 {
		 searchResult = getElementsByClassName("gui-test-search-result-link");
		 
		 for(WebElement search : searchResult)
		 {
			 String searchText = search.getText();
			 VerifyTextContainSnippet(searchText, car);
		 }
		 
		 
		 
	 }
}
