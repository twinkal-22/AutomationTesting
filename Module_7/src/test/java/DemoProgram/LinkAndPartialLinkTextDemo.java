package Module_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkAndPartialLinkTextDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Twinkal.Mavani\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/block.html");
		
		Thread.sleep(2000);
		//using linktext xpath
		driver.findElement(By.linkText("Inside a block-level tag.")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		//using partial link xpath
		driver.findElement(By.partialLinkText("Outside")).click();
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
