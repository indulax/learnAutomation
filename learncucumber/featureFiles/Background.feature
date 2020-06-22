@Background
Feature: To learn background concept 
Background: Student completed school education 
	Given Student finished primary education 
	Given Student finished secondary education 
	
Scenario: Student joining medical college
Given Student taken entrance exam
When student cleared exam 
Then join to any medical college

Scenario: Student joining engineering college
Given Student attended entrance
When student scores cut off
Then join to any engineering college
