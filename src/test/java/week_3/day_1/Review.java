package week_3.day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Review {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/selenium/dropdown");
        driver.manage().window().maximize();
        WebElement countryDropDown = driver.findElement(By.id("countrySelect"));

        Thread.sleep(2000);
        Select countrySelectDropDown = new Select(countryDropDown);
        Thread.sleep(2000);

        countrySelectDropDown.selectByVisibleText("Cuba");
        Thread.sleep(2000);

        List<WebElement> options = countrySelectDropDown.getOptions();
        for(WebElement element: options){
            System.out.println(element.getText());
        }


        driver.close();
        driver.quit();
    }
}
