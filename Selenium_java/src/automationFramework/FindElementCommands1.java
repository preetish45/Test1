package automationFramework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElementCommands1 {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		// Create a new instance of the FireFox driver
        System.setProperty("webdriver.gecko.driver","D:/Driver/BrowserDriver/geckodriver-v0.20.0-win32/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Launch the ToolsQA WebSite
		driver.get("431	1");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Type Name in the FirstName text box      
		driver.findElement(By.name("firstname")).sendKeys("Lakshay"); 
 
		//Type LastName in the LastName text box
		driver.findElement(By.name("lastname")).sendKeys("Sharma");
		Thread.sleep(200);
//         driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[2]/img")).click();
         List<WebElement> rdBtn_Sex = driver.findElements(By.name("sex"));
 		
 		// Create a boolean variable which will hold the value (True/False)
 		boolean bValue = false;
 		
 		// This statement will return True, in case of first Radio button is selected
 		bValue = rdBtn_Sex.get(0).isSelected();
 		
 		// This will check that if the bValue is True means if the first radio button is selected
 		if(bValue == true){
 			// This will select Second radio button, if the first radio button is selected by default
 			rdBtn_Sex.get(1).click();
 		}else{
 			// If the first radio button is not selected by default, the first will be selected
 			rdBtn_Sex.get(0).click();
 		}
 		Thread.sleep(200);
 		Select oSelect = new Select(driver.findElement(By.id("Country")));
 		
		 driver.findElement(By.id("exp-2")).click();
		 driver.findElement(By.id("profession-1")).click();
		 driver.findElement(By.id("tool-1")).click();
		 driver.findElement(By.id("submit")).click();
		 driver.quit();
		 }
	}
