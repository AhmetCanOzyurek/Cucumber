package gun05;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.*;

@CucumberOptions(

        //features = {"c:/feature}   // feature'lar genellikle test/resources altinda olur
        features = {"src/main/java/gun05/gun05.feature"},             // feature yolu alinirkern content rootdan baslanir
        glue = {"gun05"},     // glue'lar, stepdefs ve hooks classlarinin yeridir, sourceroot'dan baslar
        dryRun = false,          //sadece step defsler duzugn hazirlanmis mi, yapilandirma uygun mu ona bakar/ true ise
        tags = "@login",         // @login tagli senaryolar calistirilir
        plugin = {"pretty",
                "html:test-output/report.html",
                "json:test-output/report.json"
        }

)
public class RunnerGun05 extends AbstractTestNGCucumberTests {
    @Parameters("browser")
    @BeforeTest
    public void beforeTest(@Optional("chrome") String browser){
        System.out.println("TestNG beforeTest");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("TestNG after suite");
    }
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("TestNG before suite");
    }


}

