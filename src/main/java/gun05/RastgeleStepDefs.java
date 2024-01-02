package gun05;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RastgeleStepDefs {
    int a = 0;
    @Given("int a = {int}")
    public void intA(int a) {
        Assert.assertEquals(1,1);
    }

    @When("a olus {int}")
    public void aOlus(int a) {
        Assert.assertEquals(1,2);
    }

    @Then("result should be {int}")
    public void resultShouldBe(int x) {
        Assert.assertEquals(1,1);
    }
}
