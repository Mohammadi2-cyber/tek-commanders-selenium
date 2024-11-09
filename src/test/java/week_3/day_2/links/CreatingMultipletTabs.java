package week_3.day_2.links;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import java.util.ArrayList;
import java.util.List;

public class CreatingMultipletTabs {
    final static String tekSchoolUrl = "https://retail.tekschool-students.com/";
    final static String googleUrl = "https://google.com/";
    final static String mondayUrl = "https://monday.com/";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get(tekSchoolUrl);
        driver.manage().window().maximize();

        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com/', '_blank')");
        Thread.sleep(2500);
        ((JavascriptExecutor) driver).executeScript("window.open('https://monday.com/', '_blank')");
        Thread.sleep(2500);

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        Thread.sleep(2500);

        driver.switchTo().window(tabs.get(0));
        Thread.sleep(2500);
        driver.close();
        driver.quit();

    }
}
