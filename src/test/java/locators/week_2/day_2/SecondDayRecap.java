package locators.week_2.day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondDayRecap {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id='signinLink']")).click();
        driver.findElement(By.xpath("//input[@name='email']"))
                .sendKeys("mohammadi.ab50@gmail.com");
        driver.findElement(
                By.xpath("//input[@type='password']"))
                .sendKeys("Abd.testcase88");
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        Thread.sleep(1000);
        boolean isDisplayed = driver.findElement(By.xpath("//button[text()='Log out']")).isDisplayed();
        if (isDisplayed){
            System.out.println("Test passed!");
        }else {
            System.out.println("Test failed");
        }
        Thread.sleep(1000);
        driver.quit();

    }
}
