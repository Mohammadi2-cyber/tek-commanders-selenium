package week_3.day_2.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {
    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "https://retail.tekschool-students.com/selenium/javascript-alerts";
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();

        WebElement alertElement = driver.findElement(By.xpath("//button[@id='alertBtn']"));
        Thread.sleep(2000);
        alertElement.click();
        Alert simpleAlert = driver.switchTo().alert();
        System.out.println("Alert message: " + simpleAlert.getText());
        Thread.sleep(2500);
        simpleAlert.accept();

        Thread.sleep(2500);
        driver.close();
        driver.quit();

    }
}
