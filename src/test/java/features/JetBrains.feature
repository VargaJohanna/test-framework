Feature: Collection of tests

  Scenario: Tools / IntelliJ IDEA menu item should take me to idea page
    Given that I click on the Tools menu
    When I click on the IntelliJ IDEA item
    Then I'm taken to the idea page

  Scenario: The video on IntelliJ Idea page should play
    Given that I'm on the IntelliJ Idea page
    When I click on the video
    Then the video plays