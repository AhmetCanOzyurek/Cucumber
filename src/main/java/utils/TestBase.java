package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestBase {
    public static WebDriver driver;
    public static WebDriverWait wait;
    {
        driver = Driver.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
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
    public void scrollIntoView(By locator){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(locator);
        jse.executeScript("arguments[0].scrollIntoView();",element);

    }
}
