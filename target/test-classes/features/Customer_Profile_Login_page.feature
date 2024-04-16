Feature: Customer Profile Login page
Description
As a Customer
I want to login with a user id and password
So that i can see the customer home page

Scenario: Login as an Customer
Given I am in Landing Page
When I Click on Login
And Click Customer Login 
Then I enter User Id "david@gmail.com"

Then I enter Password "1234"
When I click Login button
Then I will see "Welcome David1"