Feature: Verify_Customer_Logout_Functionalities.
Description: 
As a customer 
I want to  logout with logout button
So that i can see login page

Scenario: Login as an Customer
Given I am in Landing Page
When I Click on Login
And Click Customer Login
Then I enter User Id "david@gmail.com"
And I enter Password "1234"
When I click Login button
Then I will see "Welcome David"
Then I Click Logout button
Then I See Customer Login Page "Customer Login"

