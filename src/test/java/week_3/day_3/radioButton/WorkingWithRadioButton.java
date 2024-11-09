package week_3.day_3.radioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WorkingWithRadioButton {
    public static void main(String[] args) throws InterruptedException {
        String baseurl = "https://retail.tekschool-students.com/selenium/radio";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseurl);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Thread.sleep(2000);
        WebElement htmlRadioButton = driver.findElement(By.xpath("//input[@id='html']"));

        htmlRadioButton.click();

        if(htmlRadioButton.isSelected()) System.out.println("Yes, it's selected");
        else System.out.println("No, it's not selected");

        if ((htmlRadioButton.isEnabled())) System.out.println("Yes it's enabled");
        else System.out.println("No, it's not enabled");
        System.out.println();

        List<WebElement> htmlRadiobuttons = driver.findElements(By.name("fav-language"));
        for (WebElement radioButton: htmlRadiobuttons){
            System.out.println(radioButton.getAttribute("value"));
        }

        driver.quit();

    }
}
