Feature: Navigate through Vizolution website Test
  User wants to verify navigating through website successfully

  Scenario: User should be able to navigate to Five9 website
    Given User is on HomePage
    When User clicks on Accept All button for accepting Cookies
    And User selects Top Menu Bar "Insights"
    And User clicks on Tab Menu Item "About Us"
    And User verifys the page by Header Title "Our Story"
    And User scrolls down the page
    And User clicks on Learn more button
    Then User is taken to Five9 website successfully











