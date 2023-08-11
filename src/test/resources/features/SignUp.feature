@SignUp @ProductStore
  Feature: Sign Up feature
    This test case is everything about testing the sign up feature

  Scenario Outline: Sign up with valid parameter
    Given User already on product store web
    When User input "<userName>" as username and "<password>" as password on sign up menu
    And Click sign up button
    Then Displays an alert
    And User input "<userName>" as username and "<password>" as password on login menu
    And Click login button
    Then User already login on product store web
    Examples:
      | userName | password |
      | ren8     | ren8     |
      | mafa8    | mafa8    |

    Scenario Outline: Sign up with invalid parameter
    Given User already on product store web
    When User input "<userName>" as username and "<password>" as password on sign up menu
    And Click sign up button
    Then Displays an alert
    Examples:
      | userName | password |
      | ren99    |          |
      |          | ren99    |

  Scenario Outline: Sign up with registered account
    Given User already on product store web
    When User input "<userName>" as username and "<password>" as password on sign up menu
    And Click sign up button
    Then Displays an alert
    Examples:
      | userName | password |
      | aldan    | aldan    |
      | ren      | ren      |