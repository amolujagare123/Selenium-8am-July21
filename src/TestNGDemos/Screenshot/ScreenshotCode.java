package TestNGDemos.Screenshot;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotCode {


    public static String takescreenshot(WebDriver driver) throws IOException {

        TakesScreenshot ts = (TakesScreenshot) driver;

        File scrFile = ts.getScreenshotAs(OutputType.FILE);

        String timestamp = new SimpleDateFormat("_yyyyddMM_hhmmss").format(new Date());

        String fileName = "IMG"+timestamp+".png";

        FileUtils.copyFile(scrFile,new File("Reports\\screenshots\\"+fileName));

        return fileName;
    }
}
