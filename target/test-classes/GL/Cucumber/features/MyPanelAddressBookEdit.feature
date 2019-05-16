Feature: MyPanelAddressBookEdit

@Positive
Scenario: user add new adress
Given User opens Bikestar page
When User click login link
Then login page is displayed
And User enter valid email and password
	|email			     |password|
	|leszek1502@gmail.com|laksjdhf|
And User click login button
Then my panel page is opened

When user click adress book link
Then addres book page is opened
And user clicks on add_new_addres button
Then add new address page is opened

Then user creates adress first time typing data:
	|name			     |surname	|company	|tel		|fax|street				|city	   |zip	|country|primaryBilling |primaryShipping|
	|Leszek				 |Otkała	|			|604264357	|	|Ul. Testowa 1/1	|Szczecinek|78-400	|Polska	|Yes			|			 Yes|
And user click save adress button
Then adress is visible as primary for billing and shipping

@Positive
Scenario: user edits primary billing and primary shipping address
Given User opens Bikestar page
When User click login link
Then login page is displayed
And User enter valid email and password
	|email			     |password|
	|leszek1502@gmail.com|laksjdhf|
And User click login button
Then my panel page is opened

When user click adress book link
Then addres book page is opened

When user clicks edit primary billing address
Then adress edit page is opened

When user edit some personal data
|name			     |surname	|company	|tel		|fax|street				|city	   |zip		|country|primaryBilling |primaryShipping|
|Leszek				 |Otkała	|			|604264357	|	|Ul. Testowa 1/1	|Szczecinek|78-400	|Polska	|Yes			|			 Yes|
And user click save adress button on edit address page
Then corected address is visible as primary billing address