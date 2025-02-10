package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FaceBookTestNG 
{

	WebDriver driver = null;
	
		@BeforeTest
		public  void  openBrowser() 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Twinkal.Mavani\\\\\\\\Downloads\\\\\\\\chromedriver-win32\\\\\\\\chromedriver-win32\\\\\\\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		@Test
		public void OpenFacebookPage() throws InterruptedException
		{
			driver.get("https://www.facebook.com/");
			
			WebElement Uid = driver.findElement(By.id("email"));
			Uid.sendKeys("tidife5648@cashbn.com");
			
			WebElement password = driver.findElement(By.id("pass"));
			password.sendKeys("qwe@123");
			
			WebElement clickLogin = driver.findElement(By.xpath("//*[text() = 'Log in']"));
			clickLogin.click();
			Thread.sleep(2000);
		}
		@AfterTest
		public void tearDown()
		{
			driver.quit();
		}
	
}
