package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class UsingTagNameLocator {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.bbc.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        By linkLocator = By.tagName("a");
        List<WebElement> allLinkElement = driver.findElements(linkLocator);
        for(WebElement element: allLinkElement){
            String text = element.getText();
            System.out.println(text);
        }
        driver.quit();
    }
}
