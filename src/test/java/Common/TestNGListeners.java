package Common;

import CommomUtil.ScreenShot;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

// ITestListener interface which implements TestNGListeners
public class TestNGListeners implements ITestListener {

    ExtentReports extentReports = ExtentReportNG.getReportObject();
    ExtentTest extentTest;
    ThreadLocal<ExtentTest> extentTestThreadLocal = new ThreadLocal<>();

    @Override
    public void onTestStart(ITestResult result) {
        extentTest = extentReports.createTest(result.getMethod().getMethodName());
        extentTestThreadLocal.set(extentTest);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("I successfully executed Listeners success pass code");
        extentTestThreadLocal.get().log(Status.PASS, "Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {

        extentTestThreadLocal.get().fail(result.getThrowable());
        System.out.println("Failed Test Method = " + result.getName());
        String testMethodName = result.getMethod().getMethodName();

        WebDriver driver = null;
        try {
            driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Driver = " + driver);
        System.out.println("Failed Method = " + testMethodName);
        try {
            extentTestThreadLocal.get().addScreenCaptureFromPath(ScreenShot.getScreenShot(driver, testMethodName), result.getMethod().getMethodName());
            System.out.println("Executing this method");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    /**
     * Invoked each time a test fails due to a timeout.
     *
     * @param result <code>ITestResult</code> containing information about the run test
     */
    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

    }

    /**
     * Invoked before running all the test methods belonging to the classes inside the &lt;test&gt; tag
     * and calling all their Configuration methods.
     *
     * @param context
     */
    @Override
    public void onStart(ITestContext context) {

    }

    /**
     * Invoked after all the test methods belonging to the classes inside the &lt;test&gt; tag have run
     * and all their Configuration methods have been called.
     *
     * @param context
     */
    @Override
    public void onFinish(ITestContext context) {
        extentReports.flush();
    }
}
