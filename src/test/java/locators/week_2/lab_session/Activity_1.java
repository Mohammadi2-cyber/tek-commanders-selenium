package locators.week_2.lab_session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity_1 {
    public static void main(String[] args) {
        /*On New Retail App https://dev.retail.tekschool-students.com/
        Sign in with  following user and make sure You logged in
        and use name displayunder user profile drop down
        {name: "Quinn Turner"
        ,email: "quinn.turner@example.com",
        password: "password123",    },
        */
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://dev.retail.tekschool-students.com/");
        driver.manage().window().maximize();
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        SeleniumUtility utility = new SeleniumUtility(wait);

        utility.click(By.linkText("Sign in"));
        utility.sendKeys(By.cssSelector("input#email"),"quinn.turner@example.com");
        utility.sendKeys(By.cssSelector("input#password"), "password123");
        utility.click(By.cssSelector("button[type='submit']"));
        utility.click(By.cssSelector("button.ant-btn-circle"));
        String userName = utility.getText(By.cssSelector("//ul//div[@class='ant-space-item']"));
        if(userName.equals("Quinn Turner")){
            System.out.println("Test passed");
        }else System.out.println("Test failed");

        driver.quit();

//        WebElement signInLocator = wait.until(ExpectedConditions.elementToBeClickable(
//                By.xpath("//a[text()='Sign in']")));
//        signInLocator.click();
//
//        WebElement emailLocatorElement = wait.until(ExpectedConditions.presenceOfElementLocated(
//                By.cssSelector("input#email")));
//        emailLocatorElement.sendKeys("quinn.turner@example.com");
//
//        WebElement passwordLocatorElement = wait.until(ExpectedConditions.presenceOfElementLocated(
//                By.cssSelector("input#password")));
//        passwordLocatorElement.sendKeys("password123");
//
//        WebElement signUpElement = wait.until(ExpectedConditions.elementToBeClickable(
//                By.cssSelector("button[type='submit']")));
//        signUpElement.click();
//
//        WebElement profilLocator = wait.until(ExpectedConditions.elementToBeClickable(
//                By.cssSelector("button.ant-btn-circle")));
//        profilLocator.click();
//
//        WebElement nameDisplayed = wait.until(ExpectedConditions.visibilityOfElementLocated(
//                By.cssSelector("//ul//div[@class='ant-space-item']")));
//        nameDisplayed.getText();
//
//        if(nameDisplayed.equals("Quinn Turner")){
//            System.out.println("Test passed");
//        }else System.out.println("Test failed");
//
//        driver.quit();




    }
}
