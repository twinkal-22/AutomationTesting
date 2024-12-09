package jUnitDemo.Assessment_1_JUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin_JUnit 
{

	WebDriver driver = null;
	@Before
	public void BrowserOpen()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Twinkal.Mavani\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe");
	    driver = new ChromeDriver();
  
	}
	@Test
	public void GmailPage() throws InterruptedException
	{
		String url = "https://workspace.google.com/intl/en-US/gmail/";
	    driver.get(url);
	    WebElement signInbtn = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/div/div[4]/a[2]"));
		signInbtn.click();
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("karantester1880@gmail.com");
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		Thread.sleep(2000);
	}
	@After
	public void TearDown()
	{
		driver.quit();
	}
}
