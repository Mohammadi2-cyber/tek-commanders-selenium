package week_3.day_3.actions.mouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveElement {
    public static void main(String[] args) throws InterruptedException {
        String dragDropUrl = "https://amazon.com";
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(dragDropUrl);
        Thread.sleep(2000);
        WebElement medicalCare = driver.findElement(
                By.xpath("//span[text='Medical Care'"));
        Thread.sleep(2000);
        Actions action = new Actions(driver);
        action.moveToElement(medicalCare).perform();

        Thread.sleep(2000);
        driver.close();
        driver.quit();

    }
}
