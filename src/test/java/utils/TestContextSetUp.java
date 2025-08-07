package utils;

import org.openqa.selenium.WebDriver;
import pageObject.PageObjectManager;

import java.io.IOException;

public class TestContextSetUp {
public TestBase testBase;
public WebDriver driver;
public PageObjectManager pageObjectManager;

    public TestContextSetUp() throws IOException {
        testBase = new TestBase();
        pageObjectManager = new PageObjectManager(testBase.WebDriverManager());


    }
}
