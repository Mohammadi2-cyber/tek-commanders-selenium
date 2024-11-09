package week_3.day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class ReviewActivity {
    final static String tekSchoolUrl = "https://retail.tekschool-students.com/";
    final static String googleUrl = "https://google.com/";
    final static String mondayUrl = "https://monday.com/";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(tekSchoolUrl);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        String tekSchoolTitle = driver.getTitle();
//        WebElement tekElement = driver.findElement(By.xpath(""));
        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com/', '_blank')");
        String googlelTitle = driver.getTitle();
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.open('https://monday.com/', 'blank')");
        String mondaylTitle = driver.getTitle();
        System.out.println(mondaylTitle);
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(2000);
        driver.switchTo().window(tabs.get(0));
        System.out.println(googlelTitle);
        Thread.sleep(1000);
        System.out.println(tekSchoolTitle);
        driver.close();
        driver.quit();
;



    }
}
