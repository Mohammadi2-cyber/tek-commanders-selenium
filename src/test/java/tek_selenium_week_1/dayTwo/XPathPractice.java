package tek_selenium_week_1.dayTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XPathPractice {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        String text = driver.findElement(
//                By.xpath("/html/body/div/div/div[1]/div[1]/a"))
//                .getText();
//        System.out.println(text);
        String text = driver.findElement(
                        By.xpath("/html/body/div/div/div[1]/div[3]/div/div[2]/h1"))
                .getText();
        System.out.println(text);
        driver.quit();
    }
}
