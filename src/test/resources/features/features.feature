Feature: Main Screen Navigation

  This feature verifies that buttons on the main screen navigate correctly.

  Scenario: User clicks the button to go to screen 1
    Given the app is open
    When I click on the button for screen 1
    Then the first screen should be displayed
    Then the first screen should be displayed2