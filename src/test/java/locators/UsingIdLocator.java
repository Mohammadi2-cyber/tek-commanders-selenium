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

        Thread.sleep(2000);
        By signInLocator = By.id("signinLink");
        WebElement signInElement = driver.findElement(signInLocator);
        signInElement.click();
        Thread.sleep(2000);
        By createNewAccount = By.id("newAccountBtn");
        WebElement newAccountElement = driver.findElement(createNewAccount);
        newAccountElement.click();
        Thread.sleep(2000);
        By userName = By.id("nameInput");
        WebElement userNameElement = driver.findElement(userName);
        userNameElement.sendKeys("abdullah88@tekschool.come");
        Thread.sleep(2000);
        driver.quit();


    }
}
