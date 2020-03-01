Feature: Verify Negative login flows

@Negative
@Regression
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
