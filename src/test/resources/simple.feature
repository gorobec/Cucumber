Feature: test my app

  @App
  Scenario: simple atm actions
    Given client insert card "1234 0000 6565 0000" into atm
    And client enter "1111" pin
    When client try withdraw "200" cash
    Then client get "200" dollars

  @Main
  Scenario Outline: simple atm actions
    Given client insert card <Card> into atm
    And client enter <pin> pin
    When client try withdraw <cash> cash
    Then client get <res> dollars

    Examples:
      | Card                  | pin    | cash  | res   |
      | "1234 0000 6565 0000" | "1111" | "200" | "200" |
      | "1234 0000 6565 0000" | "1111" | "100" | "100" |




