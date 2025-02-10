package Module_7;

import java.awt.dnd.DragGestureEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Twinkal.Mavani\\\\Downloads\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		List<WebElement> allCheckboxes = driver.findElements(By.xpath("//*[@type='checkbox']"));
		Thread.sleep(2000);
		 for (WebElement checkbox : allCheckboxes) 
		 {
	            if (!checkbox.isSelected()) 
	            {
	                checkbox.click();
//	                WebElement label = checkbox.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div/div/div/label"));
//	               
//	                System.out.println("Selected Checkbox is : " + label.getText());
//       
	            }
	        }
		 System.out.println("Sucess...");
		 Thread.sleep(2000);
		driver.close();
	}
}
