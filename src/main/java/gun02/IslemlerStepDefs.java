package gun02;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.zh_cn.那么;
import org.testng.Assert;

public class IslemlerStepDefs {
    int sonuc = 0;
    @Given("baslangic sayisi {int} olsun")
    public void baslangicSayisiOlsun(int num) {
        sonuc = num;
        System.out.println("sayi initialized edildi: " + num);
    }

    @When("kullanici {int} eklediginde")
    public void kullaniciEklediginde(int num) {
        sonuc += num;
    }

    @Then("sonuc {int} olmalidir")
    public void sonucOlmali(int num) {
        Assert.assertEquals(num,sonuc);
    }

    @And("kullanici {int} cikardiginda")
    public void kullaniciCikardiginda(int num) {
        sonuc -= num;
    }
}
