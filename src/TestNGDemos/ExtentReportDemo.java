package TestNGDemos;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static TestNGDemos.Screenshot.ScreenshotCode.takescreenshot;

public class ExtentReportDemo {

    ExtentReports extent;


    @BeforeClass
    public void initExtent()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Reports\\report.html");
        extent = new ExtentReports();

        reporter.config().setDocumentTitle("My Project Bugs");
        reporter.config().setReportName("Regression report");
        extent.attachReporter(reporter);

        extent.setSystemInfo("Developer","Amol Ujagare");
        extent.setSystemInfo("Test Lead","Vinayak");
        extent.setSystemInfo("Test Manager","Prachi");
        extent.setSystemInfo("Project name","Stock management");
    }

    @AfterClass
    public void writeToReport()
    {
        extent.flush();

    }



    @Test
    public void  loginTest() throws IOException {
        ExtentTest test = extent.createTest("valid loginTest");


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        test.info("browser is opened");

        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.net/");

        test.info("URL is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        test.info("password is entered");

        WebElement btnName = driver.findElement(By.name("submit"));
        btnName.click();

        test.info("login button is clicked");

        String expected = "https://stock.scriptinglogic.net/dashboard.php1";
        String actual = driver.getCurrentUrl();

        try {
            Assert.assertEquals(actual,expected,"wrong page");
            test.pass("this is a dashboard : test is passed");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+takescreenshot(driver));
        }

    }

    @Test
    public void  loginTest1() throws IOException {
        ExtentTest test = extent.createTest("invalid loginTest");


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        test.info("browser is opened");

        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.net/");

        test.info("URL is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("jgjgj");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("jgjgj");

        test.info("password is entered");

        WebElement btnName = driver.findElement(By.name("submit"));
        btnName.click();

        test.info("login button is clicked");

        String expected = "https://stock.scriptinglogic.net/index.php?msg=Wrong%20Username%20or%20Password&type=error";
        String actual = driver.getCurrentUrl();
        try {
            Assert.assertEquals(actual,expected,"wrong page");
            test.pass("this is a login page : test is passed");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+takescreenshot(driver));
        }
    }

    @Test
    public void  loginTest2() throws IOException {
        ExtentTest test = extent.createTest("blank loginTest");


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        test.info("browser is opened");

        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.net");

        test.info("URL is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");

        test.info("password is entered");

        WebElement btnName = driver.findElement(By.name("submit"));
        btnName.click();

        test.info("login button is clicked");

        String expected = "https://stock.scriptinglogic.net/";
        String actual = driver.getCurrentUrl();
        try {
            Assert.assertEquals(actual,expected,"wrong page");
            test.pass("this is a login page : test is passed");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+takescreenshot(driver));
        }

    }

}
