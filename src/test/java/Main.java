import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.click();
        fullName.sendKeys("Kübra Gökbayrak");

        WebElement eMail = driver.findElement(By.cssSelector(".mr-sm-2[placeholder=\"name@example.com\""));
        eMail.click();
        eMail.sendKeys("kgokbayrak@gmail.com");

        WebElement currentAdress = driver.findElement(By.cssSelector(".form-control[placeholder=\"Current Address\"]"));
        currentAdress.click();
        currentAdress.sendKeys("İstanbul, Turkey");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)", "");

        WebElement permanentAddres = driver.findElement(By.xpath("//textarea[@id=\"permanentAddress\"]"));
        permanentAddres.click();
        permanentAddres.sendKeys("İstanbul, Türkiye");

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
        driver.quit();



        //scrool down java selenium----stackoverflow
    }

}
