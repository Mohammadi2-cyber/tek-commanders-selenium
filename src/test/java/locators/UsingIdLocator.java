package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.WatchEvent;

public class UsingIdLocator {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("signinLink")).click();
        driver.findElement(By.id("email")).sendKeys("mohhmmad-josh5@gmail.come");

        driver.quit();


    }
}
