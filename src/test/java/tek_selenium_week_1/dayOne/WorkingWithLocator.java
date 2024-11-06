package tek_selenium_week_1.dayOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithLocator {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        By signInLocator = By.id("signinLink");
        WebElement signInElement = driver.findElement(signInLocator);
        Thread.sleep(1000);
        driver.quit();
    }
}
