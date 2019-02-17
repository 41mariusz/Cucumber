@test
@dev
Feature: test

  Background: Preconditions
    Given Open http://automationpractice.com/ page
    And Click in SignIn

  Scenario: Login with correct email and password
  Try login with correct email and password
    When User sign in using login: fdfd11sfsd@dasdas.pl and password: haslo123
    Then Check if you are logged in

  Scenario: Login with correct email and incorrect password
  Try login with correct email and password
    When User sign in using login: fdfd11sfsd@dasdas.pl and password: bad_pass
    Then Check if you are logged in