Feature: To test the Login functionality


Scenario: Unsuccessful Login with Invalid Credentials
Given User is on Home Page
When User clicks on My Vodafone
	And User clicks 'Login' on 'http://www.vodafone.co.nz/using-myvodafone/' Page
	And User enters Invalid Username and Invalid Password
Then Error message is displayed
