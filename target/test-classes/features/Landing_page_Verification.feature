Feature: Landing page Verification
  Decription
  As a Customer
  I want to see landing page
  So that i can do login

  Scenario: Verify landing page
    Given I am in Chrome Browser
    When I navigate landing page url "http://it.microtechlimited.com/"
    Then The Landing Page appear "Welcome to MicroTech NA."
