Feature: Customer Id is Matched
As a Customer
I want to see Home Page


Scenario: Verify Customer Id is Mathed
Given I am in Landing Page
Then Click  Login menu
And Click Customer Login
And Enter email id
And Enter pass
Then Click Login button
And Verify you are Home Page "Welcome David"
And Click Order Product
And Verify Customer Id is Matched "Customer Id: 4"
