package Module_7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalHyperLink 
{
	public static void main(String[] args) throws InterruptedException 
	{
	int linkscount = 0 ;
	String[] links = null;	

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Twinkal.Mavani\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> linkSize = driver.findElements(By.tagName("a"));
		
		linkscount = linkSize.size();
		System.out.println("Available link count is..." + linkscount);
		links= new String[linkscount];
		System.out.println("List of links Available: ");
		for(int i=0;i<linkscount;i++)
		{
			links[i] = linkSize.get(i).getAttribute("href");
			System.out.println(linkSize.get(i).getAttribute("href"));
		}
		for(int i=0;i<linkscount;i++)
		{
			driver.navigate().to(links[i]);
		}
		driver.close();
	}

}
