package Runner;

//import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features"
        , glue = {"StepDefinitions"}
        , publish = true
        , plugin = {"pretty"
        , "html:target/test-output"
        , "json:reports/cucumber.json"}
        , tags = "@A"
)
public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
