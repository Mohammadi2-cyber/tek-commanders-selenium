package locators.week_2.day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ImplicityWaiting {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement signInElement = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("a#signinLink")));
        signInElement.click();

        WebElement emailElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("input[name='email']")));
        emailElement.sendKeys("wrongEmail6@gmail.com");

        wait.until(ExpectedConditions.presenceOfElementLocated(
                By.cssSelector("input[type='password']"))).sendKeys("wrongPassword");

        wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("button#loginBtn"))).click();

        WebElement errorElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("div.error")));
        String errorMessage = errorElement.getText();
        System.out.println(errorMessage);

        driver.quit();
    }
}
