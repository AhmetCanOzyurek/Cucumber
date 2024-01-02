@login @logout
Feature: rastgele scenario


  @login
  Scenario:
    Given int a = 2
    When a olus 3
    Then result should be 5

    @logout
  Scenario:
    Given int a = 2
    When a olus 3
    Then result should be 5