Feature: Header navigation tests

  Scenario: Tools / IntelliJ IDEA menu item should take me to idea page
    Given that I click on the Tools menu
    When I click on the IntelliJ IDEA item
    Then I'm taken to the idea page