package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;

public class PrintingUsingLinkText {
    public static void main(String[] args) {
        /*Navigate to https://www.bbc.com/ Then Click on business linkThen
        Get The text of Page Title and print it.Quit browser  */
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://github.com/");
        driver.manage().window().maximize();

        By textLocator = By.linkText("Business");
        WebElement businessElement = driver.findElement(textLocator);
        businessElement.click();

    }
}
