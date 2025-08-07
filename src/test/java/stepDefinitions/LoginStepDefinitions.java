package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObject.LoginPage;
import utils.TestContextSetUp;

import java.util.List;

public class LoginStepDefinitions {

    TestContextSetUp testContextSetUp;
    public WebDriver driver;
    LoginPage loginPage;

public LoginStepDefinitions(TestContextSetUp testContextSetUp) {
    this.testContextSetUp = testContextSetUp;
    this.loginPage=testContextSetUp.pageObjectManager.getLoginPage();

}
    @Given("User is on EZYThemes Application")
    public void user_is_On_EZYThemes_Application() {
    loginPage.getCurrentUrl();
    }

    @When("^User enters (.+) and (.+)$")
    public void userEnters(String UserName, String Password) throws InterruptedException {
    loginPage.enterUserEmail(UserName);
    loginPage.enterUserPassword(Password);
    loginPage.clickLoginButton();
    }

    @Then("User should be able to login to EZYThemes Application")
    public void user_should_be_able_to_login_to_EZYThemesApplication() throws InterruptedException{
    loginPage.verifyHomePageTitle();
    }
}
