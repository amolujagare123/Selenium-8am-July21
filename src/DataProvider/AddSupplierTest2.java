package DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static DataProvider.util.DataProviderMethod.getMyData;

public class AddSupplierTest2 {
    WebDriver driver;

    @BeforeClass
    public void doLogin()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.net/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnName = driver.findElement(By.name("submit"));
        btnName.click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test (dataProvider = "getData")
    public void addSupplier(String name,String add,String con1,String con2)
    {
        WebElement lnkAddSupplier = driver.findElement(By.partialLinkText("Add Sup"));
        lnkAddSupplier.click();

        WebElement txtName = driver.findElement(By.name("name"));
        txtName.sendKeys(name);

        WebElement txtAddress = driver.findElement(By.name("address"));
        txtAddress.sendKeys(add);

        WebElement contact1 = driver.findElement(By.name("contact1"));
        contact1.sendKeys(con1);

        WebElement contact2 = driver.findElement(By.name("contact2"));
        contact2.sendKeys(con2);

        WebElement btnAdd = driver.findElement(By.name("Submit"));
        btnAdd.click();
    }

    @DataProvider
    public Object[][] getData() throws IOException {

     return    getMyData("Data/dataxx.xlsx","suppliers");

    }


}
