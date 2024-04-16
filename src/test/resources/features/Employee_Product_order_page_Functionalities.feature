Feature: Employee Product order page Functionalities

Scenario: Login as an Employee
Given I am in Landing Page
When I Click on Login
And I Will see Employee Login Page "Employee Login"
Then I Enter user id "testpilot@gmail.com"
And I Enter password "1234"
When I click login button
Then I Will see "Welcome Test"
When  I click Order Product button
Then I see order product page "Order Product"
