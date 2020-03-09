Feature: Verify the Login page
 
 @Regression
 @Smoke
 @Saurab
  Scenario: Positive Login Scenerio
    Given I have the site up and running
    When I enter correct Admin and admin123
    Then I should go to home page

  
