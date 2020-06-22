Feature: This is to test login functionality in Orange HRM 
Scenario: To test login 
	Given user is entered into login page 
	When valid credentials are entered 
	| Admin| admin123|
	And clicks on login button
	Then welcome page should be displayed