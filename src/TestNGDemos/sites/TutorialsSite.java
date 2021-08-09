package TestNGDemos.sites;

import TestNGDemos.sites.util.Initialize;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TutorialsSite extends Initialize {



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
