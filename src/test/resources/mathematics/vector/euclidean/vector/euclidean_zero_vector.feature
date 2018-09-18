Feature: Check zero vector creation

  Scenario: Check zero vector has zero values
    Given zero vector is created
    Then all elements have zero value
