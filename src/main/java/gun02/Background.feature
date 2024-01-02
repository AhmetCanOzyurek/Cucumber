Feature: background

  Scenario: islem 1
    Given baslangic sayisi 3 olsun
    When kullanici 2 eklediginde
    And kullanici 3 eklediginde
    Then sonuc 8 olmalidir

  Scenario: islem 2
    Given baslangic sayisi 3 olsun
    When kullanici 2 eklediginde
    And kullanici 1 cikardiginda
    Then sonuc 4 olmalidir