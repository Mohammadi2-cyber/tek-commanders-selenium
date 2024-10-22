package tek_selenium_week_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenningBrowser {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.facebook.com/");
        chromeDriver.quit();
    }
}
