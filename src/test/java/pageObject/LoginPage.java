package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public static By emailAddressField = By.xpath("//input[@placeholder='Email Address']");
    public static By passwordField = By.xpath("//input[@placeholder='Password']");
    public static By loginButton = By.xpath("//button[@type='button']/child :: span[text()='Login']");
    public static By homePageTitle = By.xpath("//span[text()='MR Transcripts Automation']");
    public void getCurrentUrl() {
        String title=driver.getCurrentUrl();
        System.out.println(title);
    }

    public void enterUserEmail(String UserName)  throws InterruptedException {

        driver.findElement(emailAddressField).sendKeys(UserName);
        Thread.sleep(500);
    }

    public void enterUserPassword(String Password) throws InterruptedException{
        driver.findElement(passwordField).sendKeys(Password);
        Thread.sleep(500);

    }

    public void clickLoginButton() throws InterruptedException {
        driver.findElement(loginButton).click();
        Thread.sleep(100);

    }
    public  void verifyHomePageTitle() throws InterruptedException {
        String HomePageTitle=driver.findElement(homePageTitle).getText();
        System.out.println("HomePageTitle Captured from UI is - "+HomePageTitle);
        Thread.sleep(2000);

    }

}
