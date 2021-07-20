import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LoginOperation2 {


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.net/");

        List<WebElement> elementList = driver.findElements(By.tagName("input"));

        // how to print the total number of elements present

        System.out.println("total elements="+elementList.size());

        elementList.get(0).sendKeys("admin"); // username
        elementList.get(1).sendKeys("admin"); // password
        elementList.get(2).click(); // button

    }
}
