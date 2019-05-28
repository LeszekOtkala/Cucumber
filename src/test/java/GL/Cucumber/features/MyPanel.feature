Feature: MyPanel

@Negative
Scenario: Try to display my account panel without logging in.

Given Bikestar main page has opened
When User move mouse over Account DDL
And User click on My Account
Then login page is displayed


@Positive
Scenario: Try to display my account panel with logging in.

Given Bikestar main page has opened
When User click login link
Then login page is displayed
When User logs in using valid credentials
Then my panel page is opened at adress https://www.bikestar.pl/customer/account/
When User move mouse over Account DDL
And User click on My Account
Then my panel page is opened at adress https://www.bikestar.pl/customer/account/







