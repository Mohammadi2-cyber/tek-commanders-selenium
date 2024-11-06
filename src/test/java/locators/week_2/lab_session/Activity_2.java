package locators.week_2.lab_session;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity_2 {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://dev.retail.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        int randomNumber = (int)(Math.random()*900);
        String email = "newstudent.tekschool8"+randomNumber+"8@gmail.com";
        SeleniumUtility utility = new SeleniumUtility(wait);

        utility.click(By.linkText("Sign in"));
        utility.click(By.partialLinkText("register here"));
        utility.sendKeys(By.cssSelector("input#firstName"),"Jalal");
        utility.sendKeys(By.cssSelector("input#lastName"),"Jalali");
        utility.sendKeys(By.cssSelector("input#email"),email);
        utility.sendKeys(By.cssSelector("input#password"),"Newstudent667d");
        utility.sendKeys(By.cssSelector("input#confirmPassword"),"Newstudent667d");
        utility.click(By.cssSelector("button[type='submit']"));
        utility.sendKeys(By.cssSelector("input#email"),email);
        utility.sendKeys(By.cssSelector("input#password"),"Newstudent667d");
        utility.click(By.cssSelector("button.ant-btn-primary"));
//        wait.until(ExpectedConditions.elementToBeClickable(
//                By.linkText("Sign in"))).click();
//        wait.until(ExpectedConditions.elementToBeClickable(
//                By.partialLinkText("register here"))).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(
//                By.cssSelector("input#firstName")))
//                .sendKeys("Jalal");
//        wait.until(ExpectedConditions.visibilityOfElementLocated(
//                By.cssSelector("input#lastName")))
//                        .sendKeys("Jalali");
//        wait.until(ExpectedConditions.presenceOfElementLocated(
//                By.cssSelector("input#email")))
//                        .sendKeys(email);
//        wait.until(ExpectedConditions.presenceOfElementLocated(
//                By.cssSelector("input#password")))
//                        .sendKeys("Newstudent667d");
//        wait.until(ExpectedConditions.presenceOfElementLocated(
//                By.cssSelector("input#confirmPassword")))
//                        .sendKeys("Newstudent667d");
//        wait.until(ExpectedConditions.elementToBeClickable(
//                By.cssSelector("button[type='submit']"))).click();

        //--------------------

//        wait.until(ExpectedConditions.presenceOfElementLocated(
//                By.name("email")))
//                        .sendKeys(email);
//        wait.until(ExpectedConditions.presenceOfElementLocated(
//                By.name("password")))
//                        .sendKeys("Newstudent667d");
//        wait.until(ExpectedConditions.elementToBeClickable(
//                By.cssSelector("button.ant-btn-primary"))).click();

        driver.quit();
    }
}
