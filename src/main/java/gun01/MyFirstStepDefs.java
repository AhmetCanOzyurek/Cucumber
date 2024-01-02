package gun01;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyFirstStepDefs {

    @Given("toplama islemi baslasin bre") //buranın degismemesi lazim
    public void toplamaIslemiBaslasin() {
        System.out.println("Islem basladi");
    }

    @When("ilk sayi {int} oldugunda")
    public void ilkSayiOldugunda(int num) {
        System.out.println(num);
    }

    @And("ikinci sayi {int}  oldugunda")
    public void ikinciSayiOldugunda(int num) {
        System.out.println(num);
    }

    @Then("sonuc {int} olmali")
    public void sonucOlmali(int num) {
        System.out.println(num);
    }
}
