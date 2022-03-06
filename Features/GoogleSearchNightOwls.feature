Feature: Google search


Scenario Outline: Perform a simple search

Given I am on google homepage
When I enter a search "<Keyword>" on the search box
And I click on the search button
Then I find relevent results and count of the results

Examples:
| Keyword                      |
| Quality Assurance       		 |
| Sahriar Islam                |