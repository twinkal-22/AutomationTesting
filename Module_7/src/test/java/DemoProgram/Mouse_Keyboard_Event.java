package Module_7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Keyboard_Event 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Twinkal.Mavani\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");// set chrome path 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		Actions action = new Actions(driver);
		WebElement homeTab = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/a"));
		WebElement uname= driver.findElement(By.name("userName"));	
		Thread.sleep(2000);
		action.moveToElement(uname).click().sendKeys("Twinkal Mavani");
		Thread.sleep(2000);
		action.keyDown(Keys.COMMAND).sendKeys("a");

		
		driver.quit();
		
	}
}
