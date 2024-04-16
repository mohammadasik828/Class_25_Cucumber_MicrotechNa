Feature: Employee product order page verification
Description: 
As a Employee
I want to see product order list 
So that I can confirm  Order

Scenario: Login as an Employee
Given I am in Landing Page
When I Click on Login
And I Will see Employee Login Page "Employee Login"
Then I Enter user id "testpilot@gmail.com"
And I Enter password "1234"
When I click login button
Then I Will see "Welcome Test"
When  I click order List button
Then I Will see order product list page "Employee Id: 102"
