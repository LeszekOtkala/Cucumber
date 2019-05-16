Feature: UserData

@Positive	
Scenario: User edit account data

Given User opens Bikestar page
When User click login link
Then login page is displayed
And User enter valid email and password
	|email			     |password|
	|leszek1502@gmail.com|laksjdhf|
And User click login button
Then my panel page is opened
When user click account edit link
Then account data edit page is opened

And user click on textbox Name
And user clear textbox Name
And user type name "Leszek" to textbox name

When user click on textbox surname
And user clear textbox surname
And user type name "Otkała" to textbox surname

When user click on textbox email
And user clear textbox email
And user type name "leszek1502@gmail.com" to textbox email

When user click on current password textfield
And user enter password: "laksjdhf" to current password
And user click on confirm current password textbox
And user eter password: "laksjdhf" to confrm password textbox

When user click Save button
Then "Leszek" "Otkała" "leszek1502@gmail.com" is visible in user data fields