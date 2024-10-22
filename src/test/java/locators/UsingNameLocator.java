package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingNameLocator {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        //Step 1. locate the element.
        By signInLink = By.name("email");
        WebElement signInElement =  driver.findElement(signInLink);
        signInElement.sendKeys("mohammadi@135");

        By passwordLocater = By.name("pass");
        WebElement passElement =  driver.findElement(passwordLocater;
        signInElement.sendKeys("22222rrr");
    }
}
