Feature: Employee profile verification
Description: 
As a Employee 
I want to see my profile page
So that i can see all my profile information

Scenario: Login as an Employee
Scenario: Login as an Employee
Given I am in Landing Page
When I Click on Login
And I Will see Employee Login Page "Employee Login"
Then I Enter user id "testpilot@gmail.com"
And I Enter password "1234"
When I click login button
Then I Will see "Welcome Test"
Then  I click My Profile button
Then I will seen My Info "My Info"
