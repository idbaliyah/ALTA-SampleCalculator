@ListPage @android
  Feature: List Menu

    Background:
      Given user is on login page
      When user input username "admin"
      And user input password "admin"
      And user click button login

    @test @positive
    Scenario: Long press on list menu
      When user click navigation menu and click list menu
      Then user doing long press on list menu

    @test @positive
    Scenario: Multiple times on list menu
      When user click navigation menu and click list menu
      Then user doing multiple times on list menu