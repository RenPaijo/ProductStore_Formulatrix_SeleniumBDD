@Cart @ProductStore
  Feature: Cart feature
    this test case is everything about the cart feature

  Scenario: User Buying an item
    Given User already on product store web
    When User input "aldan" as username and "aldan" as password on login menu
    And Click login button
    Then User already login on product store web
    And User click the item to be purchased for the example Sony vaio i5
    Then add to cart
    And Go to cart page
    And Place order
    And Proceed to payment, "aldan" as name and "123" as credit card
    Then Confirm the purchase

  Scenario: User shouldn't be able to buy unless adding items to cart
    Given User already on product store web
    When User input "aldan" as username and "aldan" as password on login menu
    And Click login button
    And User already login on product store web
    And Go to cart page
    Then Place order button should be disabled

  Scenario: Users should not be able to checkout before logging in first
    Given User already on product store web
    When User click the item to be purchased for the example Sony vaio i5
    And add to cart
    And Go to cart page
    Then Place order button should be disabled

