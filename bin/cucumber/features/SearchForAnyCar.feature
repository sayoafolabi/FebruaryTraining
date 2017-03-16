Feature: Search Any Cars
		In order to view different cars for sale
		As an Autotrader customer
		I want the ability to search for a car of my choice 
		
@ignore @search @sanity			
Scenario: Search for Any cars on homepage
		Given I navigate to Autotrader homepage
		And Autotrader logo is displayed 
		When I enter my postcode as "M40 2EB"
		And I select a distance of "Within 35 miles" from my postcode
		And I select "Mazda" from make dropdown
		And I click on Search Cars button
		Then the result of the search for "Mazda" is displayed
		And all the cars displayed belong only to "Mazda"

@ignore @search
Scenario Outline: Search for Any cars on homepage search box
		Given I navigate to Autotrader homepage
		And Autotrader logo is displayed 
		When I enter my postcode as "<Postcode>"
		And I select a distance of "<Distance>" from my postcode
		And I select "<Make>" from make dropdown
		And I click on Search Cars button
		Then the result of the search for "<Make>" is displayed
		And all the cars displayed belong only to "<Make>"
		
Scenarios:
	|Postcode | Distance | Make |
	|OL9 8LE| Within 35 miles| Audi|
	##|M40 2EB | Within 30 miles| Mazda|
	##|M34 5JD | Within 25 miles| Mini|