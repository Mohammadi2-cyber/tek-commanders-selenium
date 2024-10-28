package locators.recapSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class OpeningTheApp {
    public static void main(String[] args) throws InterruptedException {
        var input = new Scanner(System.in);
        String userInput = "";
        System.out.print("Please select on which webDriver do you want to open the app chrome/edge: ");
        userInput = input.next();
        WebDriver driver;
        if ( userInput.equalsIgnoreCase("chrome")){

            driver = new ChromeDriver();

        } else if ( userInput.equalsIgnoreCase("edge")) {

            driver = new EdgeDriver();

        } else if (userInput.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else
            throw new RuntimeException("Invalid input");

        driver.get("https://dev.retail.tekschool-students.com/");
        driver.manage().window().maximize();
        Thread.sleep(1500);
        String printTitle = driver.getTitle();
        System.out.println(printTitle);
        driver.quit();
    }
}
