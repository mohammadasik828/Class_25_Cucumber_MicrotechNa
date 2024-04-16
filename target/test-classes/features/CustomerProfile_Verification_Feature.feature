Feature: Customer Profile Verification Feature
Description: 
As a customer
I want to see my profile page
So that i can see all my profile information

Scenario: Login as an Customer
Given I am in Landing Page
When I Click on Login
And Click Customer Login
Then I enter User Id "david@gmail.com"
And I enter Password "1234"
When I click Login button
Then I will see "Welcome David"
Then I will click My Profile
Then I will seen My Info "My Info"
Then I will see My First & Last name "David","Smith"
Then I will see Email Address "david@gmail.com"
Then I will see Date of Birth & Gender "1998-06-24","M"
Then I will see Contact number "01752726848"
Then I will see Address "Taltola"


