package week_3.day_2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class simpleAlertActivity {
    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "https://retail.tekschool-students.com/selenium/javascript-alerts";
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
       WebElement alertButton = driver.findElement(By.name("confirmBtn"));
       Thread.sleep(2000);
       alertButton.click();
       Thread.sleep(2000);
        Alert simpleAlert = driver.switchTo().alert();
        System.out.println(simpleAlert.getText());
        Thread.sleep(2000);

        simpleAlert.accept();
        Thread.sleep(2000);

        driver.close();
        driver.quit();
    }
}
