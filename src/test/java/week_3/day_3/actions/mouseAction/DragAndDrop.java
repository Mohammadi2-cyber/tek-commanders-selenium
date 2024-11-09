package week_3.day_3.actions.mouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        String dragDropUrl = "https://retail.tekschool-students.com/selenium/drag-drop";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(dragDropUrl);
        Thread.sleep(2000);
        WebElement sourceElement = driver.findElement(
                By.xpath("//div[@data-rbd-droppable-id='1']"));
        WebElement targetElement = driver.findElement(
                By.xpath("//div[@data-rbd-droppable-id='2']"));
        Thread.sleep(2000);
        Actions action = new Actions(driver);
        action.clickAndHold(sourceElement).
                moveByOffset(0,10).
                moveToElement(targetElement).
                release().perform();

        Thread.sleep(2000);
        driver.close();
        driver.quit();


    }
}
