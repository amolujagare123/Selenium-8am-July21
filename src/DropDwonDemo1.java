import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDwonDemo1 {


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("file:///D:/Scriptinglogic%20docs/class%20Activities/Selenium/Mywebsite/amol.html");

        // 1. find the webelement
        WebElement drpText = driver.findElement(By.id("seltext"));

        // 2. Create an object of the class Select and pass webelement to its constructor
        Select selDrpText = new Select(drpText);

        Thread.sleep(4000);

        // 3. Select the element either using → visible text or index or value
      //  selDrpText.selectByVisibleText("text 2");
      //  selDrpText.selectByIndex(3);
        selDrpText.selectByValue("v13");


    }
}
