Feature: Wallet operations
  Wallet should allow customer to safely withdraw money

  Scenario Outline: Withdraw money from wallet
    Given I have deposited $<deposit> in my wallet
    When I request $<request>
    Then $<dispensed> should be dispensed
    And my wallet balance should be $<balance>

    Examples:
      | deposit | request | dispensed | balance |
      | 200     | 30      | 30        | 170     |  # happy path
      | 100     | 100     | 100       | 0       |  # withdraw exact amount
      | 100     | 0       | 0         | 100     |  # withdraw zero
      | 50      | 100     | 0         | 50      |  # request more than balance
      | 0       | 50      | 0         | 0       |  # empty wallet