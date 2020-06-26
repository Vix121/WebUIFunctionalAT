@test

Feature: GymShark Homepage
  Scenario: Testing the UI and functionality of components
    Given I am on the GymShark homepage
    When the homepage has loaded
    Then I will validate that I can see a Sale hero banner with two CTAs
    When I click the CTA with the title women
    Then I will get re-directed to the women sale page