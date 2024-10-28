package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathActivity_2 {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.bbc.com/");
        driver.manage().window().maximize();
        Thread.sleep(1500);
        By bbcClick = By.xpath("https://www.bbc.com/");
        driver.findElement(bbcClick).click();
        Thread.sleep(2000);

    }
}
