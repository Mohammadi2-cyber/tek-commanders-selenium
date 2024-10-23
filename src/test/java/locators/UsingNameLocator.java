package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingNameLocator {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        By signInLink = By.name("email");
        WebElement signInElement =  driver.findElement(signInLink);
        signInElement.sendKeys("mohammadi135@gmail.com");
        Thread.sleep(3000);
        By passwordLocater = By.name("pass");
        WebElement passElement =  driver.findElement(passwordLocater);
        passElement.sendKeys("22222rrr");

        Thread.sleep(3000);
        By loginButten = By.name("login");
        WebElement loginButtenElement = driver.findElement(loginButten);
        loginButtenElement.click();

        driver.quit();
    }
}
