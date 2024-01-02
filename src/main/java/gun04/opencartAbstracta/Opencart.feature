Feature: opencart


  Scenario: login
    Given user on "https://opencart.abstracta.us/" page
    And user fills the loginForm  as follows
      | username | deneme@deneme.com |
      | password | deneme            |
    Then opencart login should be succesfull

  Scenario Outline: add products to cart
    Given user searrh for "<searchTerm>"
    When user add "<product>" to the cart
    Then product should be added

    Examples:
      | searchTerm | product            |
      | mac        | MacBook            |
      | mac        | MacBook Pro        |
      | Iphone     | Iphone             |
      | Samsung    | Samsung SyncMaster |