@Login @ProductStore
Feature: Login feature
  This test case is everything about testing the login feature

  Scenario Outline: Login with valid parameter
    Given User already on product store web
    When User input "<userName>" as username and "<password>" as password on login menu
    And Click login button
    Then User already login on product store web
    Examples:
      | userName | password |
      | aldan    | aldan    |
      | ren5     | ren5     |

  Scenario Outline: Login with invalid parameter
    Given User already on product store web
    When User input "<userName>" as username and "<password>" as password on login menu
    And Click login button
    Then Displays an alert
    Examples:
      | userName | password |
      | aldan    |          |
      |          | ren      |
      |          |          |