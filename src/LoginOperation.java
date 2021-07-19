import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginOperation {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.net/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnName = driver.findElement(By.name("submit"));
        btnName.click();

      /*  WebElement lnkAddSupplier = driver.findElement(By.linkText("Add Supplier"));
        lnkAddSupplier.click();
*/
        WebElement lnkAddSupplier = driver.findElement(By.partialLinkText("Add Sup"));
        lnkAddSupplier.click();

        WebElement txtName = driver.findElement(By.name("name"));
        txtName.sendKeys("Prachi");

        WebElement txtAddress = driver.findElement(By.name("address"));
        txtAddress.sendKeys("xyz");

        WebElement contact1 = driver.findElement(By.name("contact1"));
        contact1.sendKeys("32323232");

        WebElement contact2 = driver.findElement(By.name("contact2"));
        contact2.sendKeys("65655656");

        WebElement btnAdd = driver.findElement(By.name("Submit"));
        btnAdd.click();


    }


}
