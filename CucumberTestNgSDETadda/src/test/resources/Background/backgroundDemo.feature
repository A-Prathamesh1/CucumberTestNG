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
#@tag
Feature: background demo
# Background will run before each scenario  
Background: user is logged in to app
Given user is on the demo login page
When user enters valid username and password
Then user is on the home page

  ##@tag1
  Scenario: Test menu items
  	And Clicks on the burger icon
    Then user validates that all items about logout and rest app state links are present
    # And logout from the app
    
  #@tag2 Outline
  Scenario: user is able to add to the cart
    And user adds the item to the cart
    Then item should be added to the cart
    #And when user removes the item from the cart
    #Then cart does not contain that item.

    #Examples: 
     # | name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
