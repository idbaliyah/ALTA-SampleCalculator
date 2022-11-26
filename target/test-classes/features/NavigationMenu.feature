@NavigationMenu @android
  Feature: Navigation Menu

    Background:
      Given user is on login page
      When user input username "admin"
      And user input password "admin"
      And user click button login

    @test @positive
      Scenario: Verify navigation menu after user success login
      When user click navigation menu
