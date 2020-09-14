package Runner;

//import io.cucumber.junit.CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features",
        glue = {"StepDefinitions"}
        , publish = true
        , plugin = {"pretty"
        , "html:target/test-output"
        , "json:target/cucumber.json"}
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
