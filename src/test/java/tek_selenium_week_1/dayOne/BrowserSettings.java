package tek_selenium_week_1.dayOne;

import org.openqa.selenium.edge.EdgeDriver;

public class BrowserSettings {
    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        String getTitle = driver.getTitle();
        System.out.println(getTitle);
        driver.quit();
    }
}
