package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageObject.CloudPage;
import utils.TestContextSetUp;

public class CloudStepDefinitions {
    TestContextSetUp testContextSetUp;
    public WebDriver driver;
    CloudPage cloudPage;

    public CloudStepDefinitions(TestContextSetUp testContextSetUp) {
        this.testContextSetUp = testContextSetUp;
        this.cloudPage=testContextSetUp.pageObjectManager.getCloudPage();
    }

    @Then("^User should be able enter the (.+) and should able to search the project and Click on Review Link$")
    public void enterProjectName(String ProjectName) throws InterruptedException {
        cloudPage.getSearchProjectAndClickOnReview(ProjectName);
    }

}
