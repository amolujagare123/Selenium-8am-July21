package MoreElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListJobSite {


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.click.in/pune/classifieds/60/post.html");

       WebElement drpJobLocation = driver.findElement(By.id("source_118"));

        Select selJobLocation = new Select(drpJobLocation);

        selJobLocation.selectByVisibleText("Bangalore");
        selJobLocation.selectByVisibleText("Mumbai");
        selJobLocation.selectByVisibleText("Noida");


    driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[1]")).click();

WebElement drpAddedCities = driver.findElement(By.id("fld_118"));
Select selAddedCities = new Select(drpAddedCities);

Thread.sleep(4000);

        selAddedCities.selectByIndex(1);

        selAddedCities.selectByIndex(2);


        Thread.sleep(4000);

        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[2]")).click();



    }
}
