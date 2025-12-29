Feature: Free CRM Login Feature

#without Examples Keyword
#Scenario: Scotia bank Login Test Scenario
#
#Given user is already on Login Page
#When title of login page is "Sign in | Scotiabank"
#Then user enters "gdfgdf" and "sfggsdgs"
#Then user clicks on login button
#Then user get global error
#Then user quit 
#Then user is on home page

Scenario Outline: Scotia bank Login Test Scenario

Given user is already on Login Page
When title of login page is "Sign in | Scotiabank"
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user get global error
Then user quit
Then user is on home page

Examples:
	| username | password |
	| naveenk  | test@123 |
	|  tom     | test456  | 