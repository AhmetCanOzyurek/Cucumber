package gun01;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/main/java/gun02/Background1.feature"},
        glue = {"gun02"}//step definitionlar hangi package'da
)
public class Runner extends AbstractTestNGCucumberTests {
}
