package week_3.day_1.select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import week_3.day_1.utility.driver.ChromeDriverSetUp;

public class ActivityOne extends ChromeDriverSetUp {
    public void main(String[] args) throws InterruptedException {
        String baseUrl = "https://retail.tekschool-students.com/selenium/dropdown";
        creatingChromeDriver();
        navigateToUrl(baseUrl);

        Thread.sleep(1000);
        WebElement languageDropDown = driver.findElement(By.name("language"));
        Select selectLanguage = new Select(languageDropDown);
        selectLanguage.selectByVisibleText("Java");
        Thread.sleep(3000);

        closingDriver();
        quitingDriver();
    }
}
