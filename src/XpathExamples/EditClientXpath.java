package XpathExamples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditClientXpath {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://billing.scriptinglogic.net/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='email']"));
        txtUsername.sendKeys("amolujagare@gmail.com");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='password']"));
        txtPassword.sendKeys("admin123");


        driver.findElement(By.xpath("//input[@name='btn_login']")).click();

        driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
        driver.findElement(By.xpath("//a[text()='View Clients']")).click();

        driver.findElement(By.xpath("//tr[td/a[text()='Ajay Mathur']]//a[@data-toggle='dropdown']")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@href='https://billing.scriptinglogic.net/index.php/clients/form/381']")).click();
    }
}
