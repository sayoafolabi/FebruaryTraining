$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/SearchCarWithTable.feature");
formatter.feature({
  "line": 1,
  "name": "Search Cars",
  "description": "In order to view different cars for sale\r\nAs an Autotrader customer\r\nI want the ability to search for a car of my choice",
  "id": "search-cars",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Search for Any cars",
  "description": "",
  "id": "search-cars;search-for-any-cars",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I navigate to Autotrader landing",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I enter my postcode as \"\u003cPostcode\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I select a distance of \"\u003cDistance\u003e\" from the postcode",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select \"\u003cMake\u003e\" as the car make",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I select \"\u003cModel\u003e\" as the model",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I select a minimum price of \"\u003cMinPrice\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I select a maximum price of \"\u003cMaxPrice\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on Search Car button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "search result is display",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I enter my postcode as \"\u003cPostcode\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "search-cars;search-for-any-cars;",
  "rows": [
    {
      "cells": [
        "Postcode",
        "Distance",
        "Make",
        "Model",
        "MinPrice",
        "MaxPrice"
      ],
      "line": 20,
      "id": "search-cars;search-for-any-cars;;1"
    },
    {
      "cells": [
        "OL9 8LE",
        "Within 35 miles",
        "audi",
        "Q7",
        "20000",
        "35000"
      ],
      "line": 21,
      "id": "search-cars;search-for-any-cars;;2"
    }
  ],
  "keyword": "Scenarios"
});
formatter.before({
  "duration": 8982678135,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Search for Any cars",
  "description": "",
  "id": "search-cars;search-for-any-cars;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I navigate to Autotrader landing",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I enter my postcode as \"OL9 8LE\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I select a distance of \"Within 35 miles\" from the postcode",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select \"audi\" as the car make",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I select \"Q7\" as the model",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I select a minimum price of \"20000\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I select a maximum price of \"35000\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on Search Car button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "search result is display",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I enter my postcode as \"OL9 8LE\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "SearchForCarsSteps.i_navigate_to_Autotrader_landing()"
});
formatter.result({
  "duration": 4604273153,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "OL9 8LE",
      "offset": 24
    }
  ],
  "location": "ParameterizedSteps.i_enter_my_postcode_as(String)"
});
formatter.result({
  "duration": 413386014,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Within 35 miles",
      "offset": 24
    }
  ],
  "location": "SearchForCarsSteps.i_select_a_distance_of_from_the_postcode(String)"
});
formatter.result({
  "duration": 647336849,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "audi",
      "offset": 10
    }
  ],
  "location": "SearchForCarsSteps.i_select_as_the_car_make(String)"
});
formatter.result({
  "duration": 439059733,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Q7",
      "offset": 10
    }
  ],
  "location": "SearchForCarsSteps.i_select_as_the_model(String)"
});
formatter.result({
  "duration": 214139,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20000",
      "offset": 29
    }
  ],
  "location": "SearchForCarsSteps.i_select_a_minimum_price_of(String)"
});
formatter.result({
  "duration": 95173,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "35000",
      "offset": 29
    }
  ],
  "location": "SearchForCarsSteps.i_select_a_maximum_price_of(String)"
});
formatter.result({
  "duration": 113368,
  "status": "passed"
});
formatter.match({
  "location": "SearchForCarsSteps.i_click_on_Search_Car_button()"
});
formatter.result({
  "duration": 112901,
  "status": "passed"
});
formatter.match({
  "location": "SearchForCarsSteps.search_result_is_display()"
});
formatter.result({
  "duration": 51319,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "OL9 8LE",
      "offset": 24
    }
  ],
  "location": "ParameterizedSteps.i_enter_my_postcode_as(String)"
});
formatter.result({
  "duration": 484991668,
  "status": "passed"
});
formatter.after({
  "duration": 5472918288,
  "status": "passed"
});
formatter.uri("features/SearchForAnyCar.feature");
formatter.feature({
  "line": 1,
  "name": "Search Any Cars",
  "description": "In order to view different cars for sale\r\nAs an Autotrader customer\r\nI want the ability to search for a car of my choice",
  "id": "search-any-cars",
  "keyword": "Feature"
});
formatter.uri("features/SearchForAudiCar.feature");
formatter.feature({
  "line": 1,
  "name": "Search Audi Cars",
  "description": "In order to view different cars for sale\r\nAs an Autotrader customer\r\nI want the ability to search for a car of my choice",
  "id": "search-audi-cars",
  "keyword": "Feature"
});
});