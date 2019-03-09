@test
Feature: test

  Background: Preconditions
    Given Open http://automationpractice.com/ page
    And Click in SignIn

  Scenario: TC.01 - Login with valid username and password # Logowanie poprawne
        Try login with correct email and password
        When User write: fdfd11sfsd@dasdas.pl to login input
        When User write: haslo123 to password input
        And User click: submit button
        Then Check if you are logged in

  Scenario: TC.02 - Login with incorrect username and password # Logowanie z poprawnym loginem i niepoprawnym hasłem
        Try login with correct email and incorrect password
        When User write: fdfd11sfsd@dasdas.pl to login input
        When User write: bad_pass to password input
        And User click: submit button
        Then Check error box contain Authentication failed

  Scenario: TC.03 - Login with incorrect username and valid password # Logowanie z nie poprawnym loginem i poprawnym hasłem
        Try login with correct email and incorrect password
        When User write: bad_adress@mail.com to login input
        When User write: haslo123 to password input
        And User click: submit button
        Then Check error box contain Authentication failed


   Scenario: TC.04 - Login with valid username and empty password # Logowanie z poprawnym loginem i pustym hasłem
        Try login with correct email and incorrect password
        When User write: fdfd11sfsd@dasdas.pl to login input
        And User click: submit button
        Then Check error box contain Password is required

   Scenario: TC.05 - Login with empty username and empty password # Logowanie z pustym loginem i pustym hasłem
        Try login with correct email and incorrect password
        And User click: submit button
        Then Check error box contain An email address required

   Scenario: TC.06 - Login with empty username and valid password # Logowanie z pustym loginem i poprawnym hasłem
        Try login with correct email and incorrect password
        When User write: bad_pass to password input
        And User click: submit button
        Then Check error box contain An email address required
@dev
   Scenario: TC.07 - Login with invalid username and valid password # Logowanie z niepoprawnym loginem (walidacja) i poprawnym hasłem
        Try login with correct email and incorrect password
        When User write: fdfd11sfsd to login input
        When User write: haslo123 to password input
        And User click: submit button
        Then Check error box contain Invalid email address