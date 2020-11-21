
  @swap
Feature: SwagLabs01
  Scenario: Verify Adding First Material To Cart
    Given user on the homepage
    When user enters username
    When user enters password
    When user clicks login
    When user adds first material to the cart
    And  user clicks cart
    Then  user verifies the name of the material



