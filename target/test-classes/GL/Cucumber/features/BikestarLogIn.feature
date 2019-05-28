Feature: BikeStarLogIn

@Positive
Scenario: User signin with correct data

	Given Bikestar main page has opened
	When User click login link
	Then login page is displayed
	When User enter valid email and password
	|email			     |password|
	|leszek1502@gmail.com|laksjdhf|
	And User click login button
	Then my panel page is opened at adress https://www.bikestar.pl/customer/account/
	And Welcome message "Witaj, Leszek Otkała!" is displayed
	
	
@Negative
Scenario Outline: User signin with incorrect data

	Given Bikestar main page has opened
	When User click login link
	Then login page is displayed
	When User enter "<email>" and "<password>"
	And User click login button
	Then Warning message "Nieprawidłowa nazwa użytkownika lub hasło." is displayed
	

	Examples:
	|email					|password |
	|leszek0215@onet.pl		|000000000|
	|leszekoo215@onet.pl	|123456	  |
	|leszekoo215@onet.pl	|000000	  |	