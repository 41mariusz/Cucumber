@dev
Feature: Register test suite

  Background: Preconditions
    Given Open http://automationpractice.com/ page
    And Click in SignIn

  Scenario: TC.08 - Register new user
        Try login with correct email and password
        When User write: dsadasfdd6sa@o2.pl to create new accountn
        And Click in Create an account
        And User write: Janusz to firstname input
        And User write: Kowalski to lastname input
        And User write: haslo123 to passwd input
        And User select: 22 day of birth
        And User select: 11 month of birth
        And User select: 1999 year of birth
        And User write: Krzysztof to firstname adress input
        And User write: Krzysztofowicz to lastname adress input
        And User write: SpaceX to company input
        And User write: Adres1 to adress1 input
        And User write: Adres2 to adress2 input
        And User write: Warszawa to city input
        And User select: Texas state
        And User write: 01110 to postcode input
        And User write: Hello to additional info input
        And User write: 864943 to home phone input
        And User write: 500500500 to mobile phone input
        And User write: hehe to alias input
        And User click: submit register button
        Then Check if you are logged in