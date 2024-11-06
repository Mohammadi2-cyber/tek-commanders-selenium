package tek_selenium_week_1.dayTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XpathActivity1 {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input"))
                .sendKeys("PlayStation");

        driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button")).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[3]/div[1]/div/img")).click();

//        String text = driver.findElement(
//                By.xpath("/html/body/div/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/h1"))
//                .getText();
//        System.out.println(text);
        driver.quit();

    }
}
