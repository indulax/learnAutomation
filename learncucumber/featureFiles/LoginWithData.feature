@Login  
Feature: This is to test login of Orange HRM
@Positive 
Scenario: To test login with valid credentials 
	Given user is in login page 
	When user enters valid credential "Admin" and "admin123" 
	And user clicks on login button 
	Then welcome page should be shown 
	
@Negative
Scenario: To test login with invalid credentials 
	Given user is in login page 
	When user enters valid credential "amin" and "admin123" 
	And user clicks on login button 
	Then welcome page should be shown 
