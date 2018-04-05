package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DemoSeleniumLearning {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Welcome123");
        System.setProperty("webdriver.gecko.driver","D:/Driver/BrowserDriver/geckodriver-v0.20.0-win32/geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
//		driver.addArguments("disable-infobars");
		
		driver.get("https://www.google.co.in");
//		ie.get("https://www.seleniumhq.org");
		driver.manage().window().maximize();
		System.out.println("Page Title" + driver.getTitle());
		
		WebElement signin= driver.findElement(By.id("gb_70"));
		signin.click();
		Thread.sleep(30);
		WebElement username=driver.findElement(By.id("identifierId"));
		username.sendKeys("preetish45");
		WebElement nexx=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div/div/div[1]/div/div[2]"));
		
				
			nexx.click();
		Thread.sleep(30);
		WebElement passwd=driver.findElement(By.id("Passwd"));
		passwd.sendKeys("akhila123");
		//*[@id="password"]/div[1]/div/div[1]/input
		
		Thread.sleep(30);

		WebElement nexy=driver.findElement(By.id("signIn"));
		nexy.click();
		WebElement gmail=driver.findElement(By.className("gbts"));
		gmail.click();
		
		WebElement signout=driver.findElement(By.id("gb_71"));
		signout.click();
		driver.close();
			
		
		
		
	
//		driver.close();
//		ie.close();
	
		
	}

}
