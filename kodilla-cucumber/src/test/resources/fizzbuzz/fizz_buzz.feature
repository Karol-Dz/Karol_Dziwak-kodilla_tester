Feature: FizzBuzz game
  The system should return correct text based on divisibility rules
  for a given number.

  Scenario Outline: Return correct value for given number
    Given the number is <number>
    When I play FizzBuzz
    Then the result should be "<result>"

    Examples:
      | number | result    |
      | 3      | Fizz      |
      | 6      | Fizz      |
      | 5      | Buzz      |
      | 10     | Buzz      |
      | 15     | FizzBuzz  |
      | 30     | FizzBuzz  |
      | 1      | None      |
      | 7      | None      |