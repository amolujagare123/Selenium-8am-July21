package XpathExamples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath2 {


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.net/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys("admin");

        WebElement btnName = driver.findElement(By.xpath("//input[@type='submit']"));
        btnName.click();

        WebElement lnkAddCustomer = driver.findElement(By.xpath("//a[normalize-space()='Add Customer']"));
        lnkAddCustomer.click();

        WebElement viewCustomer = driver.findElement(By.xpath("//a[normalize-space()='View Customers']"));
        viewCustomer.click();

        String name = "sakshi1";

        driver.findElement(By.xpath("//tr[td[text()='"+name+"']]//input")).click();

    }
}
