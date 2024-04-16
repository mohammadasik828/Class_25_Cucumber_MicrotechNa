Feature: Employee profile update verification
Description: 
As a Employee
I want to update my profile if i need
So that i can see update information


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
Then I will click update info button
Then I see "Update Employee Info" Employee Page
And I Will update contact "894489"
And I Will update address "Dhaka"
Then I Will click submit button
Then I click refresh url
Then I will see Employee updated contact "894489"
Then I will see Employee updated address "Dhaka"
