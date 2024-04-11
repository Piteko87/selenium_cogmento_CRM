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
Feature: Login

  Scenario: Positive login
    Given I enter a valid username and password
    When I click the login button
    Then I should be logged in succesfully

  Scenario Outline: Negative login
    Given I enter a valid "<username>" and there is NO password
    When I click the login button
    Then Invalid request "<message>" should be displayed
      
  Examples:
    | username			|	message					|
    | invalid@email	| Invalid request	|
