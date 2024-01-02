package gun04.opencartAbstracta;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import utils.TestBase;

import java.util.Map;

public class OpencartStepdefs extends TestBase {
    By lTopbarMyAccount = By.xpath("//li//span[text()='My Account']");
    By lTopbarLogin = By.xpath("//li//a[text()='Login']");
    By lEmailBox = By.cssSelector("#input-email");
    By lPassword = By.cssSelector("#input-password");
    By lSubmit = By.xpath("//input[@type='submit']");
    By lSearchBox = By.xpath("//input[@name='search']");
    By lSearchButton = By.cssSelector("button > i[class='fa fa-search']");
    By lFirstItemAddButton = By.xpath("(//*[text()='Add to Cart'])[1]");
    By lItemCartButton = By.xpath("//span[@id='cart-total']");
    By lSideBarLogin = By.xpath("(//a[.='Logout'])[2]");
    @And("user fills the loginForm  as follows")
    public void userFillsTheLoginFormAsFollows(DataTable table) {
        Map<String, String> map = table.asMap();
        click(lTopbarMyAccount);
        click(lTopbarLogin);
        sendKeys(lEmailBox, map.get("username"));
        sendKeys(lPassword, map.get("password"));
        click(lSubmit);
    }
    @Then("opencart login should be succesfull")
    public void opencartLoginShouldBeSuccesfull() {
        verifyVisibilty(lSideBarLogin);
    }

    @Given("user searrh for {string}")
    public void userSearrhFor(DataTable table) {
        Map<String, String> map = table.asMap();
        sendKeys(lSearchBox,map.get("searchTerm"));
        click(lSearchButton);
    }

    @When("user add {string} to the cart")
    public void userAddToTheCart(DataTable table) {
        Map<String,String> map = table.asMap();
       By locator = By.xpath("//a[text()='"+map.get("product")+"']");
       click(locator);

    }

    @Then("product should be added")
    public void productShouldBeAdded() {
    }
}
