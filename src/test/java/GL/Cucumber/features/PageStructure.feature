Feature: PageStructure;

@RunNow
@Positive
Scenario: Checking if menu is visible in all required places
Given Bikestar main page has opened
When User checks if Ddl menu top of the page is visible
Then Ddl menu top of the page is visible
When User checks if table menu bottom of the page is visible
Then table menu bottom of the page is visible
When User checks if highlighted products are visible
Then highlighted products are visible bottom of the page



@Positive
Scenario: Open product list by clicking top menu 

Given Bikestar main page has opened

When user moves mouse over Helmets in menu
Then sub menu is displayed

When user clicks on integral helmets menu item
Then product list of integral helmets is displayed


@Positive
Scenario: Open product site clicking link in highlighted products field

Given Bikestar main page has opened
When user clicks first highlighted product
Then selected product page is displayed
