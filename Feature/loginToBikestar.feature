Feature: loginToBikestar

Scenario: User signin with valid login and valid password

	Given User opens Bikestar page
	When User click login link
	And User enter valid email
	And User enter valid password
	And User click login button
	Then my panel page is opened at adress https://www.bikestar.pl/customer/account/
	And Welcome message Witaj, Leszek Otkała! is displayed



Scenario: User signin with valid login and invalid password

	Given User opens Bikestar page
	When User click login link
	And User enter valid email
	And User enter invalid password
	And User click login button
	Then Warning message =Nieprawidłowa nazwa użytkownika lub hasło. is displayed


Scenario: User signin with invalid login and valid password

	Given User opens Bikestar page
	When User click login link
	And User enter invalid email
	And User enter valid password
	And User click login button
	Then Warning message =Nieprawidłowa nazwa użytkownika lub hasło. is displayed


Scenario: User signin with invalid login and invalid password

	Given User opens Bikestar page
	When User click login link
	And User enter invalid email
	And User enter invalid password
	And User click login button
	Then Warning message =Nieprawidłowa nazwa użytkownika lub hasło. is displayed
	