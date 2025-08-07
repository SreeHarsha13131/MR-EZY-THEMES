package stepDefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import utils.TestContextSetUp;

import java.io.IOException;

public class Hooks {
    public static ExtentReports extent;
    public static ExtentTest test;
    TestContextSetUp testContextSetUp;
    WebDriver driver;

    public Hooks(TestContextSetUp testContextSetUp) {
        this.testContextSetUp = testContextSetUp;
    }

//    @Before
//    public void beforeScenario(Scenario scenario) {
//        extent = ExtentReportManager.getInstance();
//        test = extent.createTest(scenario.getName());
//    }

    @After
    public void AferSecnario() throws IOException {
        testContextSetUp.testBase.WebDriverManager().quit();
        System.out.println("Closing the Browser");
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();  // Closes all browser windows and ends the WebDriver session
        }
    }
}
