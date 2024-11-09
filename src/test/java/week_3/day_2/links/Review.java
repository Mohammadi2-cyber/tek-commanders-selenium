package week_3.day_2.links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Review {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/selenium/dropdown");
        driver.manage().window().maximize();

        WebElement languageDroopDown = driver.findElement(
                By.xpath("//select[@name='language']"));

        Select languageSelect = new Select(languageDroopDown);
        languageSelect.selectByVisibleText("Java");
        System.out.println(languageSelect.getAllSelectedOptions());


        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }

}
