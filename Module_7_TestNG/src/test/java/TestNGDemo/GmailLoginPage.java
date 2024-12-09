package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GmailLoginPage
{
	WebDriver driver = null;
	
	@BeforeTest
	public void BrowserOpen()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Twinkal.Mavani\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe");
	    driver = new ChromeDriver();
	    
	}
	
	@Test
	public void GmailLoginPage()
	{
		String url = "https://workspace.google.com/intl/en-US/gmail/";
	    driver.get(url);
		WebElement signInbtn = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/div/div[4]/a[2]"));
		signInbtn.click();
		
	}
	
	@Test
	public void EmailCredentials()
	{
		String currentURL = driver.getCurrentUrl();
		
		if(currentURL.equals("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&ifkv=AcMMx-crDf4HrpMAB2mpErrkzVR1zhAgTQnUMedC3QTYPNH5zEgwyoEf5JQznTVMVK-OedT_5vw5ag&ddm=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin"))
		{
			System.out.println("URL invalid");
		}
		else
		{
			System.out.println("your URL is valid and enter your credentials...");
		}	
	}
	
	@Test
	public void email()
	{
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("karantester1880@gmail.com");
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
	}
	
	@AfterTest
	public void tearDOwn()
	{
		driver.close();
	}
}
