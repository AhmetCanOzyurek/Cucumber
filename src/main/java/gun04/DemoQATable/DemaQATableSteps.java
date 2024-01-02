package gun04.DemoQATable;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.Driver;
import utils.TestBase;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.time.Duration;
import java.util.AbstractCollection;
import java.util.List;
import java.util.Map;

public class DemaQATableSteps extends TestBase {
    By lElements = By.xpath("(//div[.='Elements'])[1]");
    By lWebtables = By.xpath("//span[.='Web Tables']");

    By lAddNewRecord = By.cssSelector("#addNewRecordButton");
    By lFirstnameBox = By.cssSelector("#firstName");
    By lLastnameBox = By.cssSelector("#lastName");
    By lEmailBox = By.cssSelector("#userEmail");
    By lAgeBox = By.cssSelector("#age");
    By lSalaryBox = By.cssSelector("#salary");
    By lDepartmentBox = By.cssSelector("#department");
    By lSubmit = By.cssSelector("#submit");
    By lGridCells = By.xpath("//div[@role='rowgroup']");

    @Given("User open {string} address")
    public void userOpenAddress(String url) {
        driver.get(url);
    }

    @And("user clicks element button")
    public void userClicksElementButton() {
        scrollIntoView(lElements);
      click(lElements);
    }

    @And("user clicks webtables button")
    public void userClicksWebtablesButton() {
        scrollIntoView(lWebtables);
        click(lWebtables);
    }

    @When("user fill the tables as follows")
    public void userFillTheTablesAsFollows(DataTable table) {
        Map<String,String> map = table.asMap();
        click(lAddNewRecord);
        sendKeys(lFirstnameBox,map.get("FirstName"));
        sendKeys(lLastnameBox,map.get("LastName"));
        sendKeys(lEmailBox,map.get("Email"));
        sendKeys(lAgeBox,map.get("Age"));
        sendKeys(lSalaryBox,map.get("Salary"));
        sendKeys(lDepartmentBox,map.get("Department"));
        click(lSubmit);
    }

    @Then("data will be added")
    public void dataWillBeAdded() {
        By lDeleteButtons = By.xpath("//span[@title='Delete']");
        List<WebElement> deleteButtons = driver.findElements(lDeleteButtons);
        for (WebElement delButton : deleteButtons) {
           Assert.assertTrue(delButton.isDisplayed());
        }
    }

    @And("user delete former credentials")
    public void userDeleteFormerCredentials() {
        By lDeleteButtons = By.xpath("//span[@title='Delete']");
        List<WebElement> deleteButtons = driver.findElements(lDeleteButtons);
        for (WebElement delButton : deleteButtons) {
            delButton.click();
        }
    }


    @Then("quit from driver")
    public void quitFromDriver() {
        Driver.quitDriver();
    }
}
