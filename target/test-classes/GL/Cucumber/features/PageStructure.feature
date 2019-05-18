Feature: PageStructure;


@Positive
Scenario: Checking if menu is visible in all required places
When User opens Bikestar page
Then Main Page is opened and ddl menu top of the page is visible
And table menu bottom of the page is visible
And highlighted products are visible bottom of the page



@RunNow
@Positive
Scenario: Open product list by clicking top menu 

Given User opens Bikestar page

When user moves mouse over Helmets in menu
Then sub menu is displayed

When user clicks on integral helmets menu item
Then product list of integral helmets is displayed


@Positive
Scenario: Open product site clicking link in highlighted products field

Given User opens Bikestar page


When user clicks first highlighted product
Then selected product page is displayed
