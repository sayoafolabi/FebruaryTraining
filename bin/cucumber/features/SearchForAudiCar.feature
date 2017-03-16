Feature: Search Audi Cars
		In order to view different cars for sale
		As an Autotrader customer
		I want the ability to search for a car of my choice 
		
@ignore @Audi @sanity		
Scenario: Search for Audi cars on homepage search box
		Given I navigate to Autotrader homepage
		And Autotrader logo is displayed 
		When I enter my postcode
		And I select a distance from my postcode
		And I select Audi from make dropdown
		And I click on Search Cars button
		Then the result of the search for Audi is displayed
		And all the cars displayed belong only to Audi
@ignore @Audi
Scenario: Search for Audi cars on homepage search box
		Given I navigate to Autotrader homepage
		And Autotrader logo is displayed 
		When I enter my postcode
		And I select a distance from my postcode
		And I select Audi from make dropdown
		And I click on Search Cars button
		Then the result of the search for Audi is displayed
		And all the cars displayed belong only to Audi
@ignore @Audi
Scenario: Search for Audi cars on homepage search box
		Given I navigate to Autotrader homepage
		And Autotrader logo is displayed 
		When I enter my postcode
		And I select a distance from my postcode
		And I select Audi from make dropdown
		And I click on Search Cars button
		Then the result of the search for Audi is displayed
		And all the cars displayed belong only to Audi


		

