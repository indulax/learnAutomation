@DataDriven
Feature: To test login functionality in Orange HRM
@Positive
Scenario Outline: To test login with different credentials
Given endduser entered into login page
When enters below credentials "<Username>" and "<Password>"
And clicking on login button
Examples:
|Username |Password|
|Admin    |admin123|
|admin    |Ad@12345|