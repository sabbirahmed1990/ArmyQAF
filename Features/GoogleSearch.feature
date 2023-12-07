Feature: Google Search

Scenario Outline: search for simple keyword

Given I am on google homepage
When I enter "<keyword>" on the search box
And I click search button
Then I fine relevent result


Examples:
|keyword|
|QA jobs in NY|
#|Software testing jobs|