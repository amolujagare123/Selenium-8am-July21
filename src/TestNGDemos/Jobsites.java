package TestNGDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Jobsites {

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
    public void Naukri()
    {
        driver.get("http://Naukri.com");
    }

    @Test
    public void monster()
    {
        driver.get("http://monster.com");
    }

    @Test
    public void shine()
    {
        driver.get("http://shine.com");
    }



}
