package locators.week_2.day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ActivityOne {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//a[text()='Sign in']")).click();
        driver.findElement(
                By.xpath("//input[@name='email']"))
                .sendKeys("mohammadi.ab50@gmail.com");
        driver.findElement(
                By.xpath("//input[@id='password']"))
                .sendKeys("Abd.testcase88");
        driver.findElement(By.xpath("//button[contains(@class,'w-full')]")).click();

        driver.findElement(
                By.xpath("//input[@type='text']")).sendKeys("Keyboard");
        driver.findElement(By.xpath("//button[@id='searchBtn']")).click();

        driver.findElement(By.xpath("//div[@class='products']/div[1]/img")).click();

        driver.findElement(By.xpath("//span[text()='Add to Cart']/..")).click();

        boolean isQuantityDisplayed = driver.findElement(
                By.xpath("//span[@id='cartQuantity']")).isDisplayed();
        System.out.println(isQuantityDisplayed);

        if(isQuantityDisplayed){
            System.out.println("Test passed");
        }else System.out.println("Test failed");

        driver.quit();
    }
}
