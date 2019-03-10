@test
@dev
Feature: Register test suite

  Background: Preconditions
    Given Open http://automationpractice.com/ page
    And User click: in SignIn

  Scenario: TC.08 - Valid register new user
        Try Valid register new user
        When User write: new_user673x03@mail.com to create new account
        And User click: Create an account
        And User write: Janusz to firstname input
        And User write: Kowalski to lastname input
        And User write: haslo123 to passwd input
        And User set: 22 in day of birth
        And User set: 11 in month of birth
        And User set: 1999 in year of birth
        And User write: Krzysztof to firstname adress input
        And User write: Krzysztofowicz to lastname adress input
        And User write: SpaceX to company input
        And User write: Adres1 to adress1 input
        And User write: Adres2 to adress2 input
        And User write: Warszawa to city input
        And User set: Texas state
        And User write: 01110 to postcode input
        And User write: Hello to additional info input
        And User write: 864943 to home phone input
        And User write: 500500500 to mobile phone input
        And User write: hehe to alias input
        And User click: submit register button
        Then Check if you are logged in

  Scenario: TC.09 - Register new user with short password
        Try Valid register new user with short password
        When User write: new_user43252@mail.com to create new account
        And User click: Create an account
        And User write: Janusz to firstname input
        And User write: Kowalski to lastname input
        And User write: 1234 to passwd input
        And User set: 22 in day of birth
        And User set: 11 in month of birth
        And User set: 1999 in year of birth
        And User write: Krzysztof to firstname adress input
        And User write: Krzysztofowicz to lastname adress input
        And User write: SpaceX to company input
        And User write: Adres1 to adress1 input
        And User write: Adres2 to adress2 input
        And User write: Warszawa to city input
        And User set: Texas state
        And User write: 01110 to postcode input
        And User write: Hello to additional info input
        And User write: 864943 to home phone input
        And User write: 500500500 to mobile phone input
        And User write: hehe to alias input
        And User click: submit register button
        Then Check error box contain passwd is invalid

  Scenario: TC.10 - Register new user wihout password
        Try Valid register new user wihout password
        When User write: new_user432@mail.com to create new account
        And User click: Create an account
        And User write: Janusz to firstname input
        And User write: Kowalski to lastname input
        And User set: 22 in day of birth
        And User set: 11 in month of birth
        And User set: 1999 in year of birth
        And User write: Krzysztof to firstname adress input
        And User write: Krzysztofowicz to lastname adress input
        And User write: SpaceX to company input
        And User write: Adres1 to adress1 input
        And User write: Adres2 to adress2 input
        And User write: Warszawa to city input
        And User set: Texas state
        And User write: 01110 to postcode input
        And User write: Hello to additional info input
        And User write: 864943 to home phone input
        And User write: 500500500 to mobile phone input
        And User write: hehe to alias input
        And User click: submit register button
        Then Check error box contain passwd is required

  Scenario: TC.11 - Register new user with incorrect email
        Try Register new user with incorrect email
        When User write: bad_email to create new account
        And User click: Create an account
        Then Check mini error box contain Invalid email address

  Scenario: TC.12 - Register new user with exsist email
        Try Register new user with incorrect email
        When User write: 41mariusz@mail.com to create new account
        And User click: Create an account
        Then Check mini error box contain An account using this email address has already been registered. Please enter a valid password or request a new one
