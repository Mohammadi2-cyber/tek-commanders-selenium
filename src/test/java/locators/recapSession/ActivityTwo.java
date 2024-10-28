package locators.recapSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ActivityTwo {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://dev.retail.tekschool-students.com/");
        driver.manage().window().maximize();
        Thread.sleep(1500);
        By searchLocator = By.id("searchInput");
        driver.findElement(searchLocator).sendKeys("apple");
        Thread.sleep(1500);
        By clickOnSearchButton = By.xpath("/html/body/div/div/span/span/span/button");
        driver.findElement(searchLocator).click();
        Thread.sleep(1500);
        By productCardLocator = By.className("ant-card-hoverable");
        List<WebElement> productElements = driver.findElements(productCardLocator);
        int cardSize = productElements.size();
        System.out.println(cardSize);

        driver.quit();


    }
}
