package CommomUtil;

import org.openqa.selenium.WebDriver;

public class WebDriverFactory {

    static ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        //	System.out.println("df driver id:"+ webDriver);
        return webDriver.get();
    }

    public static void setWebDriver(WebDriver driver) {
        webDriver.set(driver);
    }
}
