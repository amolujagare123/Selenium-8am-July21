package JunitDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitDemo2 {
    static WebDriver driver;

    @BeforeClass //the method below this annotation will run before first test method of the class
    public static void openBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @AfterClass//the method below this annotation will run after last test method of the class
    public static void closeBrowser() throws InterruptedException {

        Thread.sleep(2500);
        driver.close();
    }

    @Test // annotation
    public void loginTest1()
    {
        driver.get("https://stock.scriptinglogic.net/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnName = driver.findElement(By.name("submit"));
        //btnName.click();
    }


    @Test
    public void loginTest2()
    {


        driver.get("https://stock.scriptinglogic.net/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("sdsdsd");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("sddsd");

        WebElement btnName = driver.findElement(By.name("submit"));
        //btnName.click();
    }

    @Test
    public void loginTest3()
    {

        driver.get("https://stock.scriptinglogic.net/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");

        WebElement btnName = driver.findElement(By.name("submit"));
      //  btnName.click();
    }



}
