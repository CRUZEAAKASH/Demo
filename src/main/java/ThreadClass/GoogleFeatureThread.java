package ThreadClass;

import Pages.GooglePage;
import org.openqa.selenium.WebDriver;

public class GoogleFeatureThread extends Thread {

    public String browserName;
    GooglePage googlePage;
    WebDriver driver;

    public GoogleFeatureThread(String threadName, String browserName) {
        super(threadName);
        this.browserName = browserName;
        googlePage = new GooglePage();
    }

    @Override
    public void run() {
        System.out.println("Thread started = " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
            driver = googlePage.initalizeDriver(this.browserName);
            googlePage.launchURL(driver, "https://www.google.com/");
            Thread.sleep(3000);
            googlePage.googleSearchTest();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            googlePage.tearDownDriver(driver);
        }
        System.out.println("Thread Ended = " + Thread.currentThread().getName());
    }

}
