Feature: Customer Profile Update Feature
Description: 
As a customer
I want to update my profile if i need
So that i can see update information

Scenario: Login as an Customer
Given I am in Landing Page
When I Click on Login
And Click Customer Login
Then I enter User Id "david@gmail.com"
And I enter Password "1234"
When I click Login button
Then I will see "Welcome David"
Then I will click My Profile
Then I will click update info
Then I see "Update Customer Info" page
And I update contact
And I update address
Then I click submit button
Then I will click refresh url
Then I will see updated contact
Then I will see updated address



