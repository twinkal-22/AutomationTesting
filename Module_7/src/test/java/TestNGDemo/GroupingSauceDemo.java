package TestNGDemo;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class GroupingSauceDemo 
{
	WebDriver driver = null;
	@Test(groups = {"openBrowser"})
	public void OpenBrowsers()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Twinkal.Mavani\\\\Downloads\\\\chromedriver-win64\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		System.out.println("open browser");
	}
	
	@Test(groups = {"Login"}, dependsOnGroups = {"openBrowser"})
	public void LoginPage() throws InterruptedException
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		WebElement btnLogin =  driver.findElement(By.id("login-button"));
		btnLogin.click();
		Thread.sleep(2000);
		System.out.println("Login page...");
			
	}
	
	@Test(groups = {"sideBar"}, dependsOnGroups = {"Login"})
	public void SideMenu() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button")).click();
		Thread.sleep(2000);
		
		Actions actions = new Actions(driver);
		WebElement logout = driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]"));
		actions.click(logout).build().perform();

		Thread.sleep(2000);
		System.out.println("Logout page...");
		
		
	}

	@Test(groups = {"teatDown"}, dependsOnGroups = {"sideBar"})
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
		System.out.println("close tab...");
	}
	
}
