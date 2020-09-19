package Runner;

//import io.cucumber.junit.CucumberOptions;

import CommomUtil.BaseClass;
import CommomUtil.WebDriverFactory;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;


//@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features"
        , glue = {"StepDefinitions"}
        , publish = true
        , plugin = {"pretty"
        , "html:target/test-output"
        , "json:reports/cucumber.json"}
        , tags = ""
)
public class TestRunner extends AbstractTestNGCucumberTests {

    @BeforeMethod
    public void settingUpDriver() {
        WebDriver driver = new BaseClass().initializeDriver("chrome");
        WebDriverFactory.setWebDriver(driver);
    }

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

    @AfterMethod
    public void quitDriver() {
        WebDriverFactory.getDriver().quit();
    }
}
