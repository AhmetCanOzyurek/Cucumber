Feature: Demo QA

  Scenario: WebTable'a giris
    Given User open "https://demoqa.com" address
    And user clicks element button
    And user clicks webtables button


    Scenario Outline:
    When user fill the tables as follows
      | FirstName  | <firstName>  |
      | LastName   | <lastName>   |
      | Email      | <email>      |
      | Age        | <age>        |
      | Salary     | <salary>     |
      | Department | <department> |
    Then data will be added


    Examples:
       | firstName | lastName | email          | age | salary | department |
       | ali1      | ali1     | ali1@gmail.com | 21  | 2001   | A          |
       | ali2      | ali2     | ali1@gmail.com | 22  | 2002   | b          |
       | ali3      | ali3     | ali1@gmail.com | 23  | 2003   | c          |
       | ali4      | ali4     | ali1@gmail.com | 24  | 2004   | d          |
       | ali5      | ali5     | ali1@gmail.com | 25  | 2005   | e          |
       | ali6      | ali6     | ali1@gmail.com | 26  | 2006   | f          |
       | ali7      | ali7     | ali1@gmail.com | 27  | 2007   | g          |

      Scenario:
