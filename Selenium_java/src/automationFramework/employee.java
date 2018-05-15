package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class employee{

public static WebDriver driver;

public static void main(String[] args) throws InterruptedException {
 System.setProperty("webdriver.gecko.driver","D:/Driver/BrowserDriver/geckodriver-v0.16.0-win32/geckodriver.exe");

 driver = new FirefoxDriver();

 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

 driver.get("https://www.paypal.com/in/home");

 WebElement signin = driver.findElement(By.xpath("//a[@id='signup-button']"));
 signin.click();
 Thread.sleep(30);
WebElement next =driver.findElement(By.xpath("//*[@id='get-started-carousel']/div/div[2]/a"));
next.click();
 }
}