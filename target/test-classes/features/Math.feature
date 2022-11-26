@Math @android
Feature: Perform Computation

  Background:
    Given user is on login page
    When user input username "admin"
    And user input password "admin"
    And user click button login

  @test @positive
  Scenario: User perform operator addition
    Given user input number1 5
    And user input number2 3
    When user select operators addition
    And user click button equals
    Then Results showing addition calculations

  @test @positive
  Scenario: User perform operator subtraction
    Given user input number1 40
    And user input number2 20
    When user select operators subtraction
    And user click button equals
    Then Results showing subtraction calculations

  @test @positive
  Scenario: User perform operator division
    When user input number1 50
    And user input number2 4
    And user select operators division
    And user click button equals
    Then Results showing division calculations

  @test @positive
  Scenario: User perform operator multiplication
    When user input number1 6
    And user input number2 9
    And user select operators multiplication
    And user click button equals
    Then Results showing multiplication calculations

