Feature: MyPanelAddressBook


Scenario: Open AdressBook by logged user
Given Bikestar main page has opened
When User click login link
Then login page is displayed
When User logs in using valid credentials
Then my panel page is opened

When user click adress book link
Then addres book is opened or add new address page is opened

@Positive
Scenario: user opens an address book in which there is no address and add new addres as primary billing and primarry shipping address
Given Bikestar main page has opened
When User click login link
Then login page is displayed
When User logs in using valid credentials
Then my panel page is opened

When user click adress book link
Then add new address page is opened
When user creates adress first time typing data:
	|name			     |surname	|company	|tel		|fax|street					|city	|zip	|country|primaryBilling |primaryShipping|
	|Leszek				 |Otkała	|			|604264357	|	|Bolesława Chrobrego 9/1|Barwice|78-460	|Polska	|Yes			|			 Yes|
And user click save adress button
Then adress is visible as primary for billing and shipping



