package pageObject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    public WebDriver driver;
    public LoginPage loginPage;
    public ConfigureDownloadPage configureDownloadPage;

    public PageObjectManager(WebDriver driver) {

        this.driver = driver;
    }
    public LoginPage getLoginPage() {
        loginPage = new LoginPage(driver);
        return loginPage;
    
    }
    public ConfigureDownloadPage getConfigureDownloadPage(){
        configureDownloadPage = new ConfigureDownloadPage(driver);
        return configureDownloadPage;
    }
}
