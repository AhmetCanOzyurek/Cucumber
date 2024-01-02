Feature: Login OrangeHRM

  Scenario: Login
    Given user on page "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When user fill the login form as follows
      | username | Admin    |
      | password | admin123 |
    Then login should be succesful
    Then quit driver

  Scenario: Login2
    Given user on page "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When user tries to login as follows, conclution should be as in status
      | username | password  | status |
      | Admin1   | admin123  | false  |
      | Admin    | admin1234 | false  |
      | Admin    | admin123  | true   |
      | Admin1   | admin123  | false  |
      |          | admin123  | false  |
      | Admin    |           | false  |
      |          |           | false  |

    Then quit driver