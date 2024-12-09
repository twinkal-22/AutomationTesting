package MavenDemoProject;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MavenUsingTestNG

{
	static WebDriver driver = null;
	
	  @BeforeTest
	    public static void open()
	  {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Twinkal.Mavani\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	        driver = new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        String url = "https://dev.templetowntrips.com/";
	        driver.manage().window().maximize();
	        driver.get(url);
	    }
	  @Test
	  public void Demo() throws InterruptedException 
	  {
		  WebElement clickSigninbtn ;
		  clickSigninbtn= driver.findElement(By.cssSelector(".sign_in.h_40"));
		  clickSigninbtn.click();
		  Thread.sleep(2000);
		  WebElement mobNo = driver.findElement(By.cssSelector("input[placeholder='Mobile Number']"));
		  mobNo.sendKeys("9876543210");
		  WebElement clickContibtn = driver.findElement(By.cssSelector("div[class='right'] button[class='full']"));
		  clickContibtn.click();
		  
		  Thread.sleep(5000);
		  try 
		  {  
			WebElement verificationPopup = driver.findElement(By.xpath("//*[@id=\"rc-imageselect\"]"));
			if(verificationPopup.isDisplayed())
			 {
				 System.out.println("Verify  popup...");
			 }
			 else
			 {
				 System.out.println("User not verify captcha...");
			 }
		  } catch (Exception e) {
			
			  System.out.println("Not verify Captcha...");
		  }
		  
		  try 
			{
				WebElement otpPopup = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div"));
				
				if(otpPopup.isDisplayed())
				{
					System.out.println("display otp popup please enter your otp number ...");
					Thread.sleep(5000);	 
				}
			} catch (Exception e) {
				
				System.out.println("Not display OTP pop up...");
			}
		  
			 List<WebElement> otpNoadd = driver.findElements(By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div[3]/div"));
			  
			 if(otpNoadd.isEmpty())
			 {
				 Scanner sc = new Scanner(System.in);
				 
				 Thread.sleep(2000);
				 System.out.println("Enter otp number..." + otpNoadd);
				 Thread.sleep(5000);
				 String otp = sc.nextLine();			
			 }
			 else 
			 {
				 System.out.println("Empty otp number...");
				 Thread.sleep(5000);
			 }
			 driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/button[2]")).click();
			 Thread.sleep(7000);
		 
			 WebElement loginsuccessPopUp =  driver.findElement(By.xpath("//div[@class='modal_container_v2']"));			 
			 if(loginsuccessPopUp.isDisplayed())
			 {
				 System.out.println("login success..");
				 driver.findElement(By.xpath("//button[normalize-space()='Okay']")).click();
			 }
			 else
			 {
				 System.out.println("not success...");
			 }  
		  }
	  @Test
	  public void HomePage()
	  {
		  WebElement homeMenu = driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[2]/div[2]/div[1]/div/a[1]"));
		  homeMenu.click(); 
	  }
	  
	  @Test
	  public void PlannedTripMenu()
	  {
		  WebElement plantripMenu = driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[2]/div[2]/div[1]/div/a[2]"));
		  plantripMenu.click();
	  }
	  
	  @AfterTest
	  public void tearDown()
	  {
		  driver.close();
	  }

}
