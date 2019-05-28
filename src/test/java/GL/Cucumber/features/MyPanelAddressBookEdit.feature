Feature: MyPanelAddressBookEdit
@RunNow
@Positive
Scenario: user add new adress
Given Bikestar main page has opened
When User click login link
Then login page is displayed
When User logs in using valid credentials
Then my panel page is opened

When user click adress book link
Then addres book page is opened
And user clicks on add_new_addres button
Then add new address page is opened

Then user creates adress first time typing data:
	|name			     |surname	|company	|tel		|fax|street				|city	   |zip	|country|primaryBilling |primaryShipping|
	|Leszek				 |Otkała	|			|604264357	|	|Ul. Testowa 1/1	|Szczecinek|78-400	|Polska	|Yes			|			 Yes|
And user click save adress button
Then address has saved and is visible in address book

@Positive
Scenario: user edits primary billing and primary shipping address
Given Bikestar main page has opened
When User click login link
Then login page is displayed
When User logs in using valid credentials
Then my panel page is opened

When user click adress book link
Then addres book page is opened

When user clicks edit primary billing address
Then adress edit page is opened

When user edit personal data
|name			     |surname	|company	|tel		|fax|street				|city	   |zip		|country|primaryBilling |primaryShipping|
|Leszek				 |Otkała	|			|604264357	|	|Ul. Testowa 1/1	|Szczecinek|78-400	|Polska	|Yes			|			 Yes|
And user click save adress button on edit address page
Then address has saved and is visible in address book