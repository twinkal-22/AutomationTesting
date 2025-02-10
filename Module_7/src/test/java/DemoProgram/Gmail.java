package Module_7;

import java.security.DomainCombiner;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Gmail
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Twinkal.Mavani\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");// set chrome path 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("create gmail account",Keys.ENTER);
		
		driver.findElement(By.xpath("//h3[normalize-space()='Create a Gmail account']")).click();
		
		driver.findElement(By.xpath("//span[@class='gb_Td']")).click();
		
		//driver.findElement(By.xpath("//div[contains(text(),'Use another account')]")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()='Create account']")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()='For my personal use']")).click();
		
		//driver.findElement(By.xpath("//*[text()='Yes, continue']")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("Twinkal");
		
		driver.findElement(By.name("lastName")).sendKeys("Mavani");
		
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		

		
		
		
		
		
		
		
		
		Select  month = new Select( driver.findElement(By.xpath("//*[@id=\"month\"]")));
		
		Thread.sleep(3000);
		month.selectByValue("9");
//	//	month.sendKeys("August");
//		month.click();
//		
//		Thread.sleep(2000);
//				
//		Select mnth = new Select (month);
//
		Actions action = new Actions(driver);
		org.openqa.selenium.interactions.Action ac = action
				.click()
			
				//.sendKeys(year, "1995")
				.build();
		action.perform();
		
		driver.findElement(By.id("day")).sendKeys("22");
		
		WebElement years = driver.findElement(By.id("year"));
		Thread.sleep(2000);
		years.sendKeys("1995");
		
		WebElement genders = driver.findElement(By.id("gender"));
		
		Select gen = new Select(genders);		
		gen.selectByVisibleText("Female");
		
		WebElement infoPage= driver.findElement(By.xpath("//*[text()='Next']"));
		infoPage.click();
		
	
		// choose your gmail address page 
		
		driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div/div/form/span/section/div/div/div[1]/div[1]/div/span/div[3]/div/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div/div/form/span/section/div/div/div[2]/div[1]/div/div[1]/div/div[1]/input")).sendKeys("twinkalmavaniqa");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[3]/div/div[1]/div/div/button/span")).click();
		
		// Creating strong password page 
		
		driver.findElement(By.xpath("(//input[@name='Passwd'])[1]")).sendKeys("topsQAZ123");
		driver.findElement(By.xpath("(//input[@name='PasswdAgain'])[1]")).sendKeys("topsQAZ123");
		driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[1]")).click();
		
		//Confirm you're not a robot
		
		driver.findElement(By.xpath("(//input[@id='phoneNumberId'])[1]")).sendKeys("6354990421");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[3]/div/div")).click();
		
		
	}

}
