package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ConfigureDownloadPage {
    private WebDriver driver;

    public ConfigureDownloadPage(WebDriver driver) {
        this.driver = driver;
    }

    public static By searchProjectField = By.xpath("//input[@placeholder='Search Project']");
    public static By reviewLinkOnProject = By.xpath("//div[@class='p-2 flex justify-start items-center']/descendant :: div[@class='cursor-pointer']");
    public static By projectNameOnCard = By.xpath("//div[@class='flex flex-wrap flex-row break-word text-ellipsis overflow-hidden'] /child :: span[text()='QC_Flowtest_06-Mar-25_v1']");
    public static By reviewPageProjectName = By.xpath("//div[@class='flex justify-start items-center gap-3']/ child :: span");

    public void getSearchProjectAndClickOnReview(String ProjectName) throws InterruptedException {
        Actions actions = new Actions(driver);
        driver.findElement(searchProjectField).sendKeys(ProjectName);
        Thread.sleep(1000);
        actions.sendKeys(Keys.ENTER).build().perform();
        String projectName = driver.findElement(projectNameOnCard).getText();
        if (projectName.equals(ProjectName)) {
            System.out.println("ProjectName Captured from UI is - " + projectName);
            Thread.sleep(1000);
            driver.findElement(reviewLinkOnProject).click();
        }else{
            System.out.println("ProjectName not Captured from UI");
        }
        String ReviewPageProjectName=driver.findElement(reviewPageProjectName).getText();
        Thread.sleep(1000);

        if(ReviewPageProjectName.equals(projectName)){
            System.out.println("User is successfully navigated to Review Page for Project - "+ReviewPageProjectName);
        }else{
            System.out.println("User is not navigated to Review Page Project - "+ReviewPageProjectName);
            Thread.sleep(5000);
        }
    }
}