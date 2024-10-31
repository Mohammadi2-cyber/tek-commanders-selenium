package locators.week_2.day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("a#signinLink")).click();
        Thread.sleep(1000);
        driver.findElement(
                By.cssSelector("input[name='email']")).sendKeys("wrongEmail6@gmail.com");
        driver.findElement(
                By.cssSelector("input[type='password']")).sendKeys("wrongPassword");
        driver.findElement(By.cssSelector("button#loginBtn")).click();
        Thread.sleep(1000);
        String errorMessage = driver.findElement(By.cssSelector("div.error")).getText();
        System.out.println(errorMessage);
        Thread.sleep(1000);
        driver.quit();

    }
}
