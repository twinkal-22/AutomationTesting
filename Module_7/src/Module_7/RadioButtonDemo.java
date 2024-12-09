package Module_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Twinkal.Mavani\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		
		WebElement radioButton = driver.findElement(By.xpath("//input[@name='webform' and @type='radio' or preceding-sibling::text() = ' Option1' and preceding-sibling::text() = ' Option2' and preceding-sibling::text() = ' Option3']\r\n"
				));
		
		if(!(radioButton.isSelected()))
		{
			
			radioButton.click();
		}
		Thread.sleep(2000);
		driver.close();
		
		
	}
}
