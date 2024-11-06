package tek_selenium_week_1.dayOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class InterviewQuestionUsingTagName {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        List< WebElement > listElement = driver.findElements(By.tagName("a"));
        for (WebElement elemen: listElement){
            String links = elemen.getText();
            System.out.println(links);
        }
        driver.quit();
    }
}
