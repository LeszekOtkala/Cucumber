Feature: UserData

@Positive	
Scenario: User edit account data

Given Bikestar main page has opened
When User click login link
Then login page is displayed
When User logs in using valid credentials
Then my panel page is opened
When user click account edit link
Then account data edit page is opened

When user type name "Leszek" to textbox name
And user type name "Otkała" to textbox surname

And user type name "leszek1502@gmail.com" to textbox email
And user enter password: "owieuryt" to current password
And user enter password: "owieuryt" to confrm password textbox
And user click Save button

Then "Leszek" "Otkała" "leszek1502@gmail.com" is visible in user data fields