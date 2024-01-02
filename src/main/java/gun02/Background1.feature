Feature: background

  #her senaryo oncesi yapilacak islem varsa backgrounda yazilir

  Background: her senaryo oncesi yapilacaklar
    Given baslangic sayisi 3 olsun
    When kullanici 2 eklediginde

  Scenario: islem 1
    And kullanici 3 eklediginde
    Then sonuc 8 olmalidir

  Scenario: islem 2
    And kullanici 1 cikardiginda
    Then sonuc 4 olmalidir