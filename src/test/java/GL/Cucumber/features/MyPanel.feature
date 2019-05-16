Feature: MyPanel

@Negative
Scenario: Try to display my account panel without logging in.

Given User opens Bikestar page
When User move mouse over Account DDL
And User click on My Account
Then login page is displayed


@Positive
Scenario: Try to display my account panel with logging in.

Given User opens Bikestar page
When User click login link
Then login page is displayed
And User enter valid email and password
	|email			     |password|
	|leszek1502@gmail.com|laksjdhf|
And User click login button
Then my panel page is opened at adress https://www.bikestar.pl/customer/account/
When User move mouse over Account DDL
And User click on My Account
Then my panel page is opened at adress https://www.bikestar.pl/customer/account/







