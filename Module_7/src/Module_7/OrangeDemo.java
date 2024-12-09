package Module_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeDemo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Twinkal.Mavani\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");// set chrome path 
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebDriverWait wait = new WebDriverWait(driver, 10); // 10 seconds wait
      
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
        WebElement uName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        uName.sendKeys("ws");
        
       
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
        WebElement password =   driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("admin123");
       
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[normalize-space()='Login'])[1]")));
        WebElement btnClick =  driver.findElement(By.xpath("(//button[normalize-space()='Login'])[1]"));
        btnClick.click();
      
      
        	Thread.sleep(2000);
        
        
        driver.quit();
		
		
		
		
		
	}

}
