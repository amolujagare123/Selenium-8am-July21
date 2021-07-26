package XpathExamples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath3 {


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://billing.scriptinglogic.net/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='email']"));
        txtUsername.sendKeys("amolujagare@gmail.com");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='password']"));
        txtPassword.sendKeys("admin123");

        WebElement btnName = driver.findElement(By.xpath("//input[@name='btn_login']"));
        btnName.click();

        WebElement lnkAddClient = driver.findElement(By.xpath("//span[normalize-space()='Clients']"));
        lnkAddClient.click();

        WebElement viewClients = driver.findElement(By.xpath("//a[normalize-space()='View Clients']"));
        viewClients.click();



    }
}
