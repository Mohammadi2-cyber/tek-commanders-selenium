package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIdLocator {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        //Step 1. locate the element.
        By signInLink = By.id("signinLink");
        // Step 2. ask Selenium to find the element.
        WebElement signInElement = driver.findElement(signInLink);
        signInElement.click();
        By creatAccount = By.id("newAccountBtn");
        WebElement accountElement = driver.findElement(creatAccount);
        // perform the action
        accountElement.click();
        driver.quit();

    }
}
