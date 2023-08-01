@tag
Feature: Login to HRM Application
  I want to use this template for my feature file

  @ValidCredentials
  Scenario: Login with valid credentials
    Given User is on home page
    When User enters username as "Admin"
    And User enters password as "admin123"
    Then User should be able to login successfully