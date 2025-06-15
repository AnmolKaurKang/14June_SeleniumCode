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
@tag
Feature: I want to use this template for my feature file to test Scenarios for Landing Page

 Scenario Outline:
 Given  User is on the Landing Page
 And    User types <"UserName"> and <"Password"> 
 Then   User Navigates to the Shopping Page
  Examples:
 |UserName|Password|
 |anmol|12345|
 |parneet|4456777|
 |babuuu|12340000000|
 |deepu|88996655|
#added the data from the master
