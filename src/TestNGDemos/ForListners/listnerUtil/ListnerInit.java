package TestNGDemos.ForListners.listnerUtil;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ListnerInit {




    public static ExtentReports initExtent()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("ListenerReports\\report.html");
        ExtentReports extent = new ExtentReports();

        reporter.config().setDocumentTitle("My Project Bugs");
        reporter.config().setReportName("Regression report");
        extent.attachReporter(reporter);

        extent.setSystemInfo("Developer","Amol Ujagare");
        extent.setSystemInfo("Test Lead","Vinayak");
        extent.setSystemInfo("Test Manager","Prachi");
        extent.setSystemInfo("Project name","Stock management");

        return extent;
    }

    public static String takescreenshotLisners(WebDriver driver) throws IOException {

        TakesScreenshot ts = (TakesScreenshot) driver;

        File scrFile = ts.getScreenshotAs(OutputType.FILE);

        String timestamp = new SimpleDateFormat("_yyyyddMM_hhmmss").format(new Date());

        String fileName = "IMG"+timestamp+".png";

        FileUtils.copyFile(scrFile,new File("ListenerReports\\screenshots\\"+fileName));

        return fileName;
    }
}
