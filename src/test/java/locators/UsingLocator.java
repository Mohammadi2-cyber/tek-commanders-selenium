package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.WatchService;

public class UsingLocator {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        By subTitleLocator = By.className("login__subtitle");
        WebElement subTitleElement = driver.findElement(subTitleLocator);
        String text = subTitleElement.getText();
        System.out.println(text);
        Thread.sleep(2500);
        driver.quit();

    }
}
