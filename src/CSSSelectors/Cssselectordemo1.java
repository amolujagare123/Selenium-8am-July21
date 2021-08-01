package CSSSelectors;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselectordemo1 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.net/");

    /*    WebElement txtUsername = driver.findElement(By.cssSelector("input#login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.cssSelector("input#login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnName = driver.findElement(By.cssSelector("input.button"));
        btnName.click();

        driver.findElement(By.cssSelector("a[href='add_customer.php']")).click();*/

        WebElement txtUsername = driver.findElement(By.cssSelector("#login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.cssSelector("#login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnName = driver.findElement(By.cssSelector(".blue"));
        btnName.click();

        driver.findElement(By.cssSelector("[href='add_customer.php']")).click();
    }
}
