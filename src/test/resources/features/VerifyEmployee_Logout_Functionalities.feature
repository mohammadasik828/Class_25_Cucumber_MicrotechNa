Feature: VerifyEmployee Logout_Functionalities.

  Scenario: Login as an Employee
    Given I am in Landing Page
    When I Click on Login
    And I Will see Employee Login Page "Employee Login"
    Then I Enter user id "testpilot@gmail.com"
    And I Enter password "1234"
    When I click login button
    Then I Will see "Welcome Test"
    Then I Click Employee Logout button
    Then I Will see Employee Login Page "Employee Login"
