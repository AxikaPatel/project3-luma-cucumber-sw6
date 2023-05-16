@regression
Feature: Women Test
  As user I want to click on women tab,Inside women tab hoovering the tops option
  and sorting jackets options

  @sanity
  Scenario: Verify the Sort by Product name display in alphabetical order
    Given   I am on Home page
    When    I hovering mouse on women Menu
    And     I hovering mouse on Tops
    And     I click on jackets option
    Then    Verify the products name display in alphabetical order after sorting product name

    @smoke
    Scenario: Verify the Price filter low to high
      Given   I am on Home page
      When    I hovering mouse on women Menu
      And     I hovering mouse on Tops
      And     I click on jackets option
      Then    Verify the Price filter low to high after sorting price filter



