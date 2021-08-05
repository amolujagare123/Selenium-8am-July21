package TestNGDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TutorialsSite {

    WebDriver driver;

    @BeforeClass
    public void openUrl()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2500);
        driver.close();
    }

    @Test
    public void scriptinglogic()
    {
        driver.get("http://scriptinglogic.com");

        Assert.assertEquals(true,false,"this test is failed");
    }

    @Test
    public void javatpoint()
    {
        driver.get("http://javatpoint.com");
    }

    @Test
    public void tutorialspoint()
    {
        driver.get("https://www.tutorialspoint.com/");
    }



}
