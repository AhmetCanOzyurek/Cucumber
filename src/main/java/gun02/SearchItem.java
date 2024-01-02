package gun02;

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
import utils.Driver;

import java.time.Duration;

public class SearchItem {
    WebDriver driver;
    WebDriverWait wait;
    {
        WebDriverManager.chromedriver().setup();
        driver = Driver.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    @Given("user on {string} main page")
    public void userOnMainPage(String url) {
        driver.get(url);
    }

    @When("user search {string}")
    public void userSearch(String string) {
        By lSearchbox = By.cssSelector("input[name='search']");
        wait.until(ExpectedConditions.elementToBeClickable(lSearchbox)).sendKeys(string);

        By lSubmtiButton = By.cssSelector(".input-group-btn");
        wait.until(ExpectedConditions.elementToBeClickable(lSubmtiButton)).click();

    }

    @Then("product count shoulde be {int}")
    public void productCountShouldeBe(int num) {
        By lSearchedItems = By.xpath("//div[@class='product-thumb']");
    wait.until(ExpectedConditions.numberOfElementsToBe(lSearchedItems,num));
    }

    @Then("close driver")
    public void closeDriver() {
        driver.close();
    }
}
