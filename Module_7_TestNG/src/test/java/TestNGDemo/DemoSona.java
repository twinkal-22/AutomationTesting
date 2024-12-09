package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class DemoSona 
{
	

	WebDriver driver = null;
	@Test(priority = 1)
	public void Browser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Twinkal.Mavani\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");// set chrome path 
		driver = new ChromeDriver();
		driver.get("https://development.alltails.in/login");
		
	}
	@Test(priority = 2)
	public void login(ITestContext context) throws InterruptedException {
		WebElement mobile = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div[2]/div[3]/form/div/input[2]"));
		mobile.sendKeys("1234567890");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div[2]/div[3]/form/button")).click();

		Thread.sleep(2000);

		WebElement otp = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div[2]/div[3]/form/input"));
		otp.sendKeys("123456");
		Thread.sleep(20000);

		WebElement btn = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div[2]/div[3]/form/button"));
		btn.click();
		Thread.sleep(5000);
		
		
		
		try 
		{
			WebElement captchaPopup = driver.findElement(By.xpath("/html/body/div/div/div[2]"));
			
			if(captchaPopup.isDisplayed())
			{
				System.out.println("Captcha is displayed please solved manually...");
				Thread.sleep(5000);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Captch is not displayed...");
		}
		context .setAttribute("driver", driver);
		//WebElement captchVerifybtn = driver.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/div[1]/div[2]/button"));
	}
	
	@Test(priority = 3,dependsOnMethods = {"login"})
	public void profile(ITestContext context) throws InterruptedException 
	{
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/ul/li[2]/button")).click();
		Thread.sleep(2000);
		WebElement profile = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[2]/div[1]/a[1]"));
		profile.click();	
	}
	
	
}
