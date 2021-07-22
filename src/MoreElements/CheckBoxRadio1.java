package MoreElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxRadio1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("file:///D:/Scriptinglogic%20docs/class%20Activities/Selenium/Mywebsite/amol.html");

       Thread.sleep(2000);
        // 1. click on selenium checkbox
        driver.findElement(By.id("check1")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("rad2")).click();
    }
}
