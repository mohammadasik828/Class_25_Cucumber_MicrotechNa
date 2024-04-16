Feature: Employee Apply leave functionalities

Scenario: Login as an Employee
Given I am in Landing Page
When I Click on Login
And I Will see Employee Login Page "Employee Login"
Then I Enter user id "testpilot@gmail.com"
And I Enter password "1234"
When I click login button
Then I Will see "Welcome Test"
When I Click Apply leave button
Then I See employee leave Page "Apply Leave Form"
Then I write reason for apply leave "I have to get married"
Then I Enter Start Date "02/10/2023"
Then I Enter End Date "02/28/2023"
Then I will click submit button
Then I will refresh Url
Then I will see Apply leave reason and Status

# plm Urgent Family Cause
