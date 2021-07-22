package MoreElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxRadio2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("file:///D:/Scriptinglogic%20docs/class%20Activities/Selenium/Mywebsite/amol.html");

        WebElement java = driver.findElement(By.id("check0"));
        WebElement selenium = driver.findElement(By.id("check1"));
        WebElement cucumber = driver.findElement(By.id("check2"));


        Thread.sleep(2000);
        // untick the selected elements

        if(java.isSelected())
            java.click();

        if (selenium.isSelected())
            selenium.click();

        if (cucumber.isSelected())
            cucumber.click();

    }
}
