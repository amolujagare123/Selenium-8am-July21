package TestNGDemos.sites;

import TestNGDemos.sites.util.Initialize;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class SocialSites extends Initialize {

    @AfterClass
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2500);
        driver.close();
    }

    @Test (priority = 1)
    public void twitter()
    {
        driver.get("http://twitter.com");
    }

    @Test (priority = 2)
    public void facebook()
    {
        driver.get("http://facebook.com");
    }

    @Test (priority = 3)
    public void instagram()
    {
        driver.get("http://instagram.com");
    }

    @Test(priority = 2)
    public void linkedIn()
    {
        driver.get("http://linkedin.com");
    }

}
