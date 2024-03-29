package gun02;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyStepdefsGun02 {
    WebDriverWait wait;
    WebDriver driver ;

    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    @Given("user on {string} page")
    public void userOnPage(String url) {
        driver.get(url);
    }

    @When("user fill username as {string}")
    public void userFillUsernameAs(String text) {
        By locator = By.cssSelector("input[name='user1name']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
    }

    @And("user fill password as {string}")
    public void userFillPassword(String txt) {
        By locator = By.cssSelector("input[name='password']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(txt);
    }

    @And("user clicks submit button")
    public void userClicksSubmitButton() {
        By locator = By.cssSelector("button[type = 'submit']");
        driver.findElement(locator).click();
    }

    @Then("login should be succesfull")
    public void loginShouldBeSuccesfull() {
        By lHeader = By.cssSelector(".oxd-topbar-header");
        wait.until(ExpectedConditions.visibilityOfElementLocated(lHeader));
    }

    @Then("close the driver")
    public void closeTheDriver() {
        driver.close();
    }
}
