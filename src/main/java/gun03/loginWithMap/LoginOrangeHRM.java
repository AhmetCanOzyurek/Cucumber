package gun03.loginWithMap;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;

import javax.xml.crypto.Data;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class LoginOrangeHRM {
    WebDriver driver;
    WebDriverWait wait;
    {
        driver = Driver.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    @Given("user on page {string}")
    public void userOnPage(String url) {
        driver.get(url);
    }

    @When("user fill the login form as follows")
    public void userFillTheLoginFormAsFollows(DataTable table) {
        Map<String,String> map = table.asMap();
        By lUsernameBox = By.cssSelector("input[name='username']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(lUsernameBox)).sendKeys(map.get("username"));

        By lPasswordBox = By.cssSelector("input[name='password']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(lPasswordBox)).sendKeys(map.get("password"));

        By locator = By.cssSelector("button[type = 'submit']");
        driver.findElement(locator).click();
    }
    By lSubmitButton = By.cssSelector("button[type = 'submit']");
    By lPasswordBox = By.cssSelector("input[name='password']");
    By lUsernameBox = By.cssSelector("input[name='username']");
    By lUserPanel = By.cssSelector(".oxd-userdropdown-tab");
    By lUserPanelLogoutLink = By.xpath("//a[text() ='Logout']");
    By lInvalidCredentialTxt = By.xpath("//*[text()='Invalid credentials']");
    @Then("quit driver")
    public void quitDriver() {
        Driver.quitDriver();
    }

    @Then("login should be succesful")
    public void loginShouldBeSuccesful() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(lUserPanel));
    }

    @When("user tries to login as follows, conclution should be as in status")
    public void userTriesToLoginAsFollowsConclutionShouldBeAsInStatus(DataTable table) {
        List<Map<String,String>> maps = table.asMaps();

        for (Map<String, String> map : maps) {
            String username = map.get("username") == null ? "": map.get("username");
            String password = map.get("password") == null ? "": map.get("password");
            sendKeys(lUsernameBox, username);
            sendKeys(lPasswordBox,password);

            driver.findElement(lSubmitButton).click();

            if (map.get("status").equalsIgnoreCase("false")){
                verifyVisibilty(lInvalidCredentialTxt);
            }else{
                verifyVisibilty(lUserPanel);
                click(lUserPanel);
                click(lUserPanelLogoutLink);
                verifyVisibilty(lUsernameBox);
            }
        }


    }



    public void sendKeys(By locator, String Text){
       WebElement elemet=  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
       elemet.clear();
       elemet.sendKeys(Text);
    }
    public void click(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }
    public void verifyVisibilty(By locator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
