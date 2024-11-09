package week_3.day_2.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlert {

    final static String baseUrl = "https://retail.tekschool-students.com/selenium/javascript-alerts";
    final static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {

        navigateTo(baseUrl);
        maximizeWindow();
        WebElement alertElement = findElementByXpath("//button[text()='Confirm']");
        waitFor(2000);
        click(alertElement);

        Alert confirmationAlert = switchTo();
        confirmationAlert.dismiss();

        waitFor(2000);
        click(alertElement);
        confirmationAlert.accept();

        waitFor(2000);
        driver.close();
        driver.quit();
    }
    public static void navigateTo(String url){
        driver.get(url);
    }
    public static void maximizeWindow(){
        driver.manage().window().maximize();
    }
    public static void waitFor(int seconds) throws InterruptedException {
        Thread.sleep(1000);
    }
    public static WebElement findElementByXpath(String xpath){
        return driver.findElement(By.xpath(xpath));
    }
    public static void click(WebElement element){
        element.click();
    }
    public static Alert switchTo(){
        return driver.switchTo().alert();
    }
}
