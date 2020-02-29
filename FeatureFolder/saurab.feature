Feature: Verify the Login page

  Scenario: Positive Login Scenerio
    Given I have the site up and running
    When I enter correct Admin and admin123
    Then I should go to home page

  Scenario Outline: Check the negative scenarios
    Given I have the site up and running
    When I try to check negative flow with <usernameVar> and <passwordVar>
    Then I should stay in the login page

    Examples: 
      | usernameVar | passwordVar |
      | AdminWrong  | admin123    |
      | Admin       | adminWrong  |
      | AdminWrong  | adminWrong  |
      | Admin@Wrong | admin123    |
