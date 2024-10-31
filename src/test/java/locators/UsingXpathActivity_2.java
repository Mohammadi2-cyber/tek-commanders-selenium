package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathActivity_2 {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://dev.retail.tekschool-students.com/");
        driver.manage().window().maximize();
        Thread.sleep(1500);
        driver.findElement(By.linkText("Sign in")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("wrongusername4");
        driver.findElement(By.name("password")).sendKeys("wrong pass33");
        Thread.sleep(1000);
        driver.findElement(By.className("ant-btn-primary")).click();
        Thread.sleep(1000);
        driver.quit();
    }
}
