package tek_selenium_week_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningChromePractice {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.bbc.com/");
        chromeDriver.manage().window().maximize();
        chromeDriver.getTitle();
        chromeDriver.quit();
    }
}
