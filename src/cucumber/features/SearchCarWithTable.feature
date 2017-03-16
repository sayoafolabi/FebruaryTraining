Feature: Search Cars 
		In order to view different cars for sale
		As an Autotrader customer
		I want the ability to search for a car of my choice 


@table
Scenario Outline: Double Under 20s
		Given I navigate to Autotrader landing
		When I enter my postcode as "<Postcode>"
		And I select a distance of "<Distance>" from the postcode
		And I select "<Make>" as the car make
		And I select "<Model>" as the model 
		And I select a minimum price of "<MinPrice>"
		And I select a maximum price of "<MaxPrice>"
		And I click on Search Car button
		Then search result is display
		
Scenarios:
	| Postcode| Distance|Make|Model|MinPrice|MaxPrice|
	|OL9 8LE| Within 35 miles| audi| Q7| 20000| 35000|
