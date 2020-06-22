Feature: This is to test login functionality in Orange HRM 
Scenario: To test login 
	Given Goto login page 
	When enter valid credentials 
	|Username |Password |
	|Admin    |admin123 |
	And click on login button
	Then welcome page need to be displayed