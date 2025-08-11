package utils;

import org.openqa.selenium.WebDriver;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilityMethod {
    public WebDriver driver;
    String dateFormat = "MM/dd/yyyy";
    public UtilityMethod(WebDriver driver){
        this.driver=driver;
    }
    public static String getCurrentDate(String dateFormat) {
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        return sdf.format(new Date());

    }
}
