Feature: Calculate numbers
  I want to calculate numbers

  Background:
    Given I have a calculator

  Scenario Outline: Addition
    Given Two numbers <first> and <second>
    When I add them
    Then The result should be <result>
    Examples:
      | first | second | result |
      | 1     | 2      | 3      |
      | 4     | 2      | 6      |
      | 5     | 2      | 7      |