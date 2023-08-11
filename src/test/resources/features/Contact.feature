@Contact @ProductStore
  Feature: Contact feature
    This test case is everything about the contact feature

  Scenario Outline: Send message with valid parameter
    Given User already on product store web
    When User input "<email>" as Contact email "<name>" as Contact name and "<message>" as message
    And Click send message button
    Then Displays an alert that "Thanks for the message!!"
    Examples:
      | email         | name | message |
      | bla@gmail.com | ren  | halo    |

  Scenario Outline: Send message with invalid parameter
    Given User already on product store web
    When User input "<email>" as Contact email "<name>" as Contact name and "<message>" as message
    And Click send message button
    Then Displays an alert that "Please fill out Contact Email Contact Name and Message"
    Examples:
      | email         | name | message |
      | bla@gmail.com |      |         |
      |               | ren  |         |
      |               |      | halo    |