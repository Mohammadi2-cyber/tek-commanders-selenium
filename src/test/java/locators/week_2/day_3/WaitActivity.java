package locators.week_2.day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitActivity {
    public static void main(String[] args) {
        /*Sign in into retail app with your credentials. Then go to account page and update phone number
        Make sure Success Message Toast is displayedNOTE: Apply Implicit and Explicit wait.
        Hint-> WebElement have clear() which should use before SendKey to input element
        */
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        // Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("a#signinLink"))).click();
        WebElement emailLocator = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#email")));
        emailLocator.clear();
        emailLocator.sendKeys("mohammadi.ab50@gmail.com");
        WebElement passwordLocator = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.cssSelector("input#password")));
        passwordLocator.clear();
        passwordLocator.sendKeys("Abd.testcase88");
        wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("button.login__valid"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("a#accountLink"))).click();
        WebElement phoneNumberLocator = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("input[name='phoneNumber']")));
        phoneNumberLocator.clear();
        phoneNumberLocator.sendKeys("7574773467");
        wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("button#personalUpdateBtn"))).click();
        WebElement messageLocator = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[text()='Personal Information Updated Successfully']")));
        String successfulUpdateMessage = messageLocator.getText();
        System.out.println(successfulUpdateMessage);
        driver.quit();
        //button#personalUpdateBtn
    }
}
