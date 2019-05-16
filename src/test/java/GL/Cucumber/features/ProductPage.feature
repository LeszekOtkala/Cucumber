Feature: ProductPage

@Positive
Scenario: Open product page and check if breadcrumbs trail is displayed

Given User opens Bikestar page

When user moves mouse over Helmets in menu
Then sub menu is displayed

When user clicks on integral helmets menu item
Then product list of integral helmets is displayed

When user clicks on first product
Then product page is displayed
And breadcrumbs trail is displayed on product page


