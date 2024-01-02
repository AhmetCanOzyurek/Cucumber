package gun05;

import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Hooks {
    WebDriver driver;
    WebDriverWait wait;


    @BeforeAll
    public static void beforeAll() {
        System.out.println("BeforeALl");
    }

    @Before(order = 1)
    public static void before1() {
        System.out.println("before1");
    }

    @After("@login and @logout")
    public static void after1(Scenario scenario) {


        System.out.println("after1 " + scenario.isFailed());
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("AfterAll");
    }

    @Before(order = 2)
    public static void before2() {
        System.out.println("before1");
    }


    /*
    @Before("@login")
    @Before("@login and @logout")
    @Before("@login and not @logout")
     */
}
