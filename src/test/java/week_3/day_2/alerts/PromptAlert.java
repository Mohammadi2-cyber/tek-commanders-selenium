package week_3.day_2.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

    final static String baseUrl = "https://retail.tekschool-students.com/selenium/javascript-alerts";
    final static WebDriver driver = new ChromeDriver();
    final static String promptMessage = "Hello World!";
    public static void main(String[] args) throws InterruptedException {

        ConfirmAlert.navigateTo(baseUrl);
        ConfirmAlert.maximizeWindow();
        WebElement promptBtn = ConfirmAlert.findElementByXpath("//button[text()='Prompt']");
        promptBtn.click();
        ConfirmAlert.waitFor(2000);
        Alert promptAlert = ConfirmAlert.switchTo();
        promptAlert.sendKeys(promptMessage);
        ConfirmAlert.waitFor(2000);
        promptAlert.accept();
        ConfirmAlert.waitFor(2000);

        WebElement confirmationText = ConfirmAlert.findElementByXpath("//div[@id='message']");
        String webText = confirmationText.getText();
        ConfirmAlert.waitFor(2000);

        if(("You wrote"+promptMessage).equals(webText)){
            System.out.println("Test passed");
        } else System.out.println("Test failed");
        driver.close();
        driver.quit();
    }
}
