Feature: Customer Product order page
Description: 
As a Customer
I want to order product
So that I can Order a Product

Scenario: Login as an Customer
Given I am in Landing Page
When I Click on Login
And Click Customer Login
Then I enter User Id "david@gmail.com"
And I enter Password "1234"
When I click Login button
Then I will see "Welcome David"
Then I will click Order Product
Then I select product
And I enter order date
Then I click order Product button
Then I will see "Order List" home Page
Then I click confirm button
Then refresh Url
Then I will see "Confirmed" status
