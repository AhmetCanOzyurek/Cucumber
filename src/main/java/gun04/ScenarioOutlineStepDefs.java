  package gun04;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

  public class ScenarioOutlineStepDefs {
    @Given("ogrencinin adi {string}")
    public void ogrencininAdi(String text) {
        System.out.println(text);
    }

    @When("ogrencinin soyadi {string}")
    public void ogrencininSoyadi(String text) {
        System.out.println(text);
    }

    @Then("ogrencinin yasi {int}")
    public void ogrencininYasi(int num) {
        System.out.println(num);
    }

    @And("list of lists")
    public void listOfLists() {
    }

    @Given("kullanici {string} sayfasinda")
    public void kullaniciSayfasinda(String arg0) {
        System.out.println("Senaryo basladi");
        System.out.println(arg0);
    }

    @When("kullanici asagidaki verilerle giris yaptiginda")
    public void kullaniciAsagidakiVerilerleGirisYaptiginda(DataTable table) {
        Map<String, String> map = table.asMap();
        System.out.println(map);
    }

    @Then("giris durumu {string} olmali")
    public void girisDurumuOlmali(String arg0) {
        System.out.println(arg0);
    }

      @And("kullanici {string} ve sifre {string} ile giris yaptiginda")
      public void kullaniciVeSifreIleGirisYaptiginda(String arg0, String arg1) {
      }
  }
