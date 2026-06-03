Feature: Test scenarios for Calculator

  Scenario: Test sum for positive numbers
    Given User open calculator
    When User sum numbers 5, 5
    Then Verify sum 8

  Scenario: Test sum for negative numbers
    Given User open calculator
    When User sum numbers -5, -5
    Then Verify sum -8