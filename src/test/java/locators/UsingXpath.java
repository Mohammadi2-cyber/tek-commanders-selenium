package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpath {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        //-->>  /html/body/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/h1
        Thread.sleep(2000);
        By clickOnImage = By.xpath("/html/body/div/div/div/div[3]/div/div[2]/div[1]/div[1]/div/div/div[2]/img");
        driver.findElement(clickOnImage).click();
        Thread.sleep(2000);
        By clickOnPlayStation = By.xpath("/html/body/div/div/div[1]/div[3]/div/div[1]/img");
        driver.findElement(clickOnPlayStation).click();
        Thread.sleep(1500);
        By titleLocator = By.xpath("/html/body/div/div/div[1]/div[3]/div/div[1]/div[2]/h1");
        WebElement titleElement = driver.findElement(titleLocator);
        String printingTitle = titleElement.getText();
        System.out.println(printingTitle);
        Thread.sleep(1500);
        driver.quit();

    }
}
