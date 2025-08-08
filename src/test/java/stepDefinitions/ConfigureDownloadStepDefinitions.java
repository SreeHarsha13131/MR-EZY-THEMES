package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageObject.ConfigureDownloadPage;
import utils.TestContextSetUp;

public class ConfigureDownloadStepDefinitions {
    TestContextSetUp testContextSetUp;
    public WebDriver driver;
    ConfigureDownloadPage configureDownloadPage;

    public ConfigureDownloadStepDefinitions(TestContextSetUp testContextSetUp) {
        this.testContextSetUp = testContextSetUp;
        this.configureDownloadPage=testContextSetUp.pageObjectManager.getConfigureDownloadPage();
    }

    @Then("^User should be able enter the (.+) and should able to search the project and Click on Review Link$")
    public void enterProjectName(String ProjectName) throws InterruptedException {
        configureDownloadPage.getSearchProjectAndClickOnReview(ProjectName);
    }

}
