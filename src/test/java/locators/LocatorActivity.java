package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorActivity {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        By title = By.className("top-nav__logo");
        WebElement titleElement = driver.findElement(title);
        String text = titleElement.getText();
        System.out.println(text);
        driver.quit();
    }
}
