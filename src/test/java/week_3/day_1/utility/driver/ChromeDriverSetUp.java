package week_3.day_1.utility.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverSetUp {
    public   static WebDriver driver;

    public void creatingChromeDriver(){
        driver = new ChromeDriver();
    }
    public static void navigateToUrl (String url){
        driver.get(url);
    }
    public void closingDriver(){
        driver.close();
    }
    public void quitingDriver(){
        driver.quit();
    }

}
