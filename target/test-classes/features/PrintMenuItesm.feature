@Search
Feature: Search for the Menu Items
  Scenario: Search for MenuItems
    Given User on Home page
    And Close the default login
    When Click on any banner
    And Check the banner is redirect to page with top menu items
    Then Print the Submenu items
  