package week_3.day_3.keyBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys {
    public static void main(String[] args) throws InterruptedException {
        String facebookUrl = "https://facebook.com/";
        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);
        driver.manage().window().maximize();
        driver.get(facebookUrl);
        Thread.sleep(2000);
        WebElement userNameElement = driver.findElement(By.id("email"));

        WebElement passwordElement = driver.findElement(By.id("pass"));
        Thread.sleep(1000);
        action.click(userNameElement).perform();
        // send keys
        for (char character: "Hello humans!".toCharArray()){
            action.sendKeys(String.valueOf(character)).perform();
            Thread.sleep(100);
        }

        action.click(passwordElement).perform();

        for (char character: "mohammad4443".toCharArray()){
            action.sendKeys(String.valueOf(character)).perform();
            Thread.sleep(100);
        }

        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
}
