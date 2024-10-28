package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RecapActivity {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000);
        By signInLocator = By.id("signinLink");
        WebElement signInElement = driver.findElement(signInLocator);
        signInElement.click();
        Thread.sleep(2000);
        By wrongUserName = By.id("email");
        WebElement wrongUserElement = driver.findElement(wrongUserName);
        wrongUserElement.sendKeys("Wrong email");
        Thread.sleep(2000);
        By wrongPassword = By.id("password");
        WebElement wrongPassElement = driver.findElement(wrongPassword);
        wrongPassElement.sendKeys("abdullah88@tekschool.come");
        Thread.sleep(2000);
        By login = By.id("loginBtn");
        WebElement loginBtnElement = driver.findElement(login);
        loginBtnElement.click();
        Thread.sleep(2000);
        By errorMessage = By.className("error");
        WebElement errorElement = driver.findElement(errorMessage);
        String error = errorElement.getText();
        System.out.println(error);
        driver.quit();
    }
}
