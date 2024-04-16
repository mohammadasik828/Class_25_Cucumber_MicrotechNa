Feature: Customer Order List Functionalities

Description: 
As a Customer
I want to see update product order on the order list page 
So that I can confirm my order

Scenario: Login as an Customer
Given I am in Landing Page
When I Click on Login
And Click Customer Login
Then I enter User Id "david@gmail.com"
And I enter Password "1234"
When I click Login button
Then I will see "Welcome David1"
When  I click order list button
Then I see oder list page "Order List"
