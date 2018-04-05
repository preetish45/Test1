package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class employee{

public static WebDriver driver;

public static void main(String[] args) {
 System.setProperty("webdriver.gecko.driver","D:/Driver/BrowserDriver/geckodriver-v0.20.0-win32/geckodriver.exe");

 driver = new FirefoxDriver();

 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

 driver.get("http://www.onlinestore.toolsqa.wpengine.com");

 WebElement element = driver.findElement(By.linkText("Product Category"));

 Actions action = new Actions(driver);

 action.moveToElement(element).build().perform();

 driver.findElement(By.linkText("iPads")).click();

 }
}