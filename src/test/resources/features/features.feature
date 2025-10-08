Feature: Main Screen Navigation

  This feature verifies that buttons on the main screen navigate correctly.

  Scenario: User clicks the button to go to screen 1
    When The user clicks on the button for screen 1
    Then the user is directed to screen 1
    And the screen 1 title should read screen 1

  Scenario: Navigate back to the homescreen
    When The user clicks on the button for screen 1
    Then the user is directed to screen 1
    When the user taps on the go back button
    Then the user is directed to the home screen

  Scenario: Navigate back to the homescreen from screen 2
    When The user clicks on the button for screen 2
    Then the user is directed to screen 2
    When the user taps on the go back button
    Then the user is directed to the home screen

