package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSauceDemo 
{
	public static WebDriver driver;
	
	@Test(dataProvider = "getData")
	public void LoginPage(String userName, String password) throws InterruptedException
	{                   
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		
		driver.findElement(By.id("user-name")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(password);
		WebElement btnLogin =  driver.findElement(By.id("login-button"));
		btnLogin.click();
		Thread.sleep(2000);
		driver.quit();
	
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = {{"admin@gmail.com","admin123"},
						   {"admin@gmail2.com","admin123"},
						   {"standard_user","secret_sauce"}}
						   ;
		return data;
	}
}
