Feature: This is to test login in OrangeHRM website 
Scenario: Test Login with valid credentials 
	Given user is in OrangeHRM login page 
	When user enters valid credentials
	And user clicks on Login button 
	Then hompage should be displayed
	
	