package TestNGDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedDemo 
{
	
	WebDriver driver;
	
	@Parameters({"browser"})
	@Test(priority =  1)
	public void launchURL(String browser)
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.out.println("Running browsewr is..." + browser);
		
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Twinkal.Mavani\\\\Downloads\\\\chromedriver-win64\\\\chromedriver.exe");
		    driver = new ChromeDriver(options);
		}
		else if (browser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if (browser.equals("ie"))
		{
			driver = new InternetExplorerDriver();
			
		}
		else if (browser.equals("safari"))
		{
			driver = new SafariDriver();
			
		}
		driver.get("https://www.facebook.com/");
		
	}
	
	@Parameters({"username","password"})
	@Test(priority = 2)
	public void loginPage(String username, String password) throws InterruptedException
	{

		WebElement Uid = driver.findElement(By.id("email"));
		Uid.sendKeys("tidife5648@cashbn.com");
		
		driver.findElement(By.id("pass")).sendKeys("qwe@123");
		
		WebElement clickLogin = driver.findElement(By.xpath("//*[text() = 'Log in']"));
		clickLogin.click();
		Thread.sleep(2000);
	}
	 
	@Parameters({"logout"})
	@Test(priority = 3)
	public void LogoutPage()
	{
		WebElement userClick = driver.findElement(By.xpath("//*[@class='x78zum5 x1n2onr6']"));
		userClick.click();
		
		WebElement btnLogout = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[5]/div[2]/div/div[2]/div[1]/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/div[1]/div[2]/div/div[5]/div/div[1]/div[2]/div/div/div/div/span"));
		btnLogout.click();		
	}
	
	@Parameters("tearDown")
	@Test(priority = 4)
	public void tearDown()
	{
		driver.quit();
	}

}
