Feature: Data table samples


  #List<String>
  Scenario: sablon 1, list
    Given my list 1
      | 1 |
      | 2 |
      | 3 |
      | 4 |
      | 5 |
      | 6 |
    Then  conclution

    #List<List<String>>
  Scenario: sablon 2, lists
    Given my lists, list of lists
      | ahmet | 11     | 21   | 31  | 41   |
      | 2     | mehmet | 22   | 32  | 42   |
      | 3     | 13     | veli | 33  | 43   |
      | 4     | 14     | 24   | ali | 44   |
      | 5     | 15     | 25   | 35  | kral |
      | 6     | 16     | 23   | 36  | 46   |


    #Map<String, String>
  Scenario: sablon 3, map
    Given my map
      | key1 | 1  |
      | key2 | 6  |
      | key3 | 21 |
      | key4 | 23 |

    #List<Map<String, String>>
  Scenario: sablon 4,list of maps
    Given my maps, list of maps
      | key1 | key2 | key3 | key4 | key5 |
      | 2    | 12   | 22   | 32   | 42   |
      | 3    | 13   | 23   | 33   | 43   |
      | 4    | 14   | 24   | 34   | 44   |
      | 5    | 15   | 25   | 35   | 45   |
      | 6    | 16   | 23   | 36   | 46   |