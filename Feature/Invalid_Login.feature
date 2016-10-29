Feature: To test the Login functionality


Scenario Outline: Unsuccessful Login with Invalid Credentials
Given User is on Home Page
When User clicks on My Vodafone
And User clicks 'Login' on 'http://www.vodafone.co.nz/using-myvodafone/' Page
And User enters "<Username>" and "<Password>"
Then Error message is displayed
"""
Your email address is not registered for My Vodafone.
"""


Examples:
	|Username|Password|
	|wdfgh|ghfjd|