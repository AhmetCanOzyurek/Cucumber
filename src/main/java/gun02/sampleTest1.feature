Feature: opencartAbstracta

  Scenario: search mac
    Given user on "https://opencart.abstracta.us/index.php?route=checkout/cart" main page
    When user search "mac"
    And product count shoulde be 4
    Then close driver
