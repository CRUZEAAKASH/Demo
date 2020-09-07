package Runner;

//import io.cucumber.junit.CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features",
        glue = {"StepDefinitions"}
        , publish = true
        , plugin = {"pretty", "html:test-output"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
