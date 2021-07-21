package MoreElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDwonDemo2 {


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("file:///D:/Scriptinglogic%20docs/class%20Activities/Selenium/Mywebsite/amol.html");

        // 1. find the webelement
        WebElement drpMultiText = driver.findElement(By.id("multiSel"));

        // 2. Create an object of the class Select and pass webelement to its constructor
        Select selMultiText = new Select(drpMultiText);

        Thread.sleep(4000);

        // 3. Select the element either using → visible text or index or value

        selMultiText.selectByVisibleText("text 1");
        Thread.sleep(4000);
        selMultiText.selectByVisibleText("text 2");
        Thread.sleep(4000);
        selMultiText.selectByVisibleText("text 4");
        Thread.sleep(4000);
      /*  selMultiText.deselectByVisibleText("text 2");
        Thread.sleep(4000);
        selMultiText.deselectByVisibleText("text 1");*/

        selMultiText.deselectAll();

    }
}
