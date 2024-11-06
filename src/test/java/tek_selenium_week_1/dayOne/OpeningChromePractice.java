package tek_selenium_week_1.dayOne;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningChromePractice {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.bbc.com/");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();
    }
}
