Feature: ProductList

@RunNow
@Positive
Scenario: Open product list and check if breadcrumbs trail is displayed

Given User opens Bikestar page

When user moves mouse over Helmets in menu
Then sub menu is displayed

When user clicks on integral helmets menu item
Then product list of integral helmets is displayed
And breadcrumbs trail is displayed