#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: OutDoor Living
I want to check OutdoorLiving and Laundry & Dish soap
  


Scenario: Title of your scenario
    Given I Launch the browser
    And Open Canadian Tire Website
    When I click outdoor living tab
    And I click on all outdoor living option 
    Then User must be able to go view all OutdoorLiving products
    And Close the browser
    
    
    
    Scenario: Title of your scenario TWO
    Given I Launch the browser
    Given Open Canadian Tire Website
    When I click on Hot Sale option
    And I click on Everyday Essentials
    And I click Laundry & Dish soap
    When I validate the title of the page
    And Close the browser
    
  


