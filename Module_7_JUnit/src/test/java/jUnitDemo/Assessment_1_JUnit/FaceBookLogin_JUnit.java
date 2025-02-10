package jUnitDemo.Assessment_1_JUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FaceBookLogin_JUnit 
{
	WebDriver driver = null;
	
	@Test
	public void OpenChromeBorwser()
	{
		ChromeOptions options = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Twinkal.Mavani\\\\Downloads\\\\chromedriver-win64\\\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		
		WebElement Uid = driver.findElement(By.id("email"));
		Uid.sendKeys("tidife5648@cashbn.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("qwe@123");
		
		WebElement clickLogin = driver.findElement(By.xpath("//*[text() = 'Log in']"));
		clickLogin.click();
	}
	
	
}
