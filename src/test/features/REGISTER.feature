@dev
Feature: Register test suite

  Background: Preconditions
    Given Open http://automationpractice.com/ page
    And Click in SignIn

  Scenario: TC.08 - Register new user
        Try login with correct email and password
        When User write: dsadasdsa@o2.pl to create new accountn
        And Click in Create an account