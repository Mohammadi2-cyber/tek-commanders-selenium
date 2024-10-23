package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLinkText {
    public static void main(String[] args) throws InterruptedException {
//        ChromeDriver driver =  new ChromeDriver();
//        driver.get("https://retail.tekschool-students.com/");
//        driver.manage().window().maximize();
//        Thread.sleep(2000);
//
//        By signInLinkLocator = By.linkText("Sign in");
//        WebElement signElement = driver.findElement(signInLinkLocator);
//        signElement.click();
//        Thread.sleep(2000);
//        driver.quit();
        ChromeDriver driver =  new ChromeDriver();
        driver.get("https://www.bbc.com/news");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        By businessLinkLocatpor = By.linkText("Business");
        WebElement businessLinkElement = driver.findElement(businessLinkLocatpor);
        businessLinkElement.click();
        Thread.sleep(2000);
        By titleLocator = By.className("juQBdA");
        WebElement titleElement = driver.findElement(titleLocator);
        String titleText = titleElement.getText();
        System.out.println(titleText);
        Thread.sleep(1500);
        driver.quit();
    }
}
