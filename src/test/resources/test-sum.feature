Feature: Test scenarios for Calculator

  Scenario: Test sum
    Given User open calculator
    When User sum numbers (5, 5)
    Then verify sum 10
