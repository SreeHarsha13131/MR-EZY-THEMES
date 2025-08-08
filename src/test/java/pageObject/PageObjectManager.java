package pageObject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    public WebDriver driver;
    public LoginPage loginPage;
    public CloudPage cloudPage;

    public PageObjectManager(WebDriver driver) {

        this.driver = driver;
    }
    public LoginPage getLoginPage() {
        loginPage = new LoginPage(driver);
        return loginPage;
    }
    public CloudPage getCloudPage(){
        cloudPage = new CloudPage(driver);
        return cloudPage;
    }
}
