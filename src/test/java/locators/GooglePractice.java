package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePractice {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        By googleSearchLocator = By.className("gLFyf");
        WebElement googleSearchElement = driver.findElement(googleSearchLocator);
        googleSearchElement.sendKeys("Tekschool");
        Thread.sleep(2000);

        By searchButtenLocator = By.className("gNO89b");
        WebElement searchButtemElement = driver.findElement(searchButtenLocator);
        searchButtemElement.click();
        Thread.sleep(2000);

        By firstLinkLocator = By.partialLinkText("TEK SCHOOL Modern Workforce");
        WebElement firstLinkElement = driver.findElement(firstLinkLocator);
        firstLinkElement.click();
        Thread.sleep(1000);

        driver.quit();
    }
}
