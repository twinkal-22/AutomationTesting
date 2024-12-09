package Module_7;

import java.awt.RenderingHints.Key;
import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Task_1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Twinkal.Mavani\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");// set chrome path 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		Thread.sleep(2000);
		WebElement fName =  driver.findElement(By.id("firstName"));
		fName.sendKeys("Twinkal");
		Thread.sleep(2000);
		fName.sendKeys(Keys.CONTROL + "A");
		//fName.sendKeys("A");
		Thread.sleep(2000);
		fName.sendKeys(Keys.CONTROL + "C");
		//fName.sendKeys("C");
		
		WebElement lName =  driver.findElement(By.id("lastName"));
		lName.sendKeys(Keys.CONTROL + "V");
		
		driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("mavanitwinkal22@gmail.com");
		
		Thread.sleep(2000);
		WebElement genRadio = driver.findElement(By.xpath("//*[@id='genterWrapper']/div[2]/div[2]/label"));
		boolean selectGen = genRadio.isSelected();
		try
		{
				if(selectGen == false)
				{
					genRadio.click();
					
					System.out.println("Gender... " + genRadio.getText());
				}
				else
				{
					System.out.println("Value is not selected...");
				}
		}
		catch(Exception e)
		{
		
			System.out.println("Error for Gender Radiobutton...");
		}

		driver.findElement(By.xpath("//*[@id=\"userNumber\"]")).sendKeys("7894561230");
		
		Thread.sleep(3000);
		try
		{
			WebElement DOBdrp =  driver.findElement(By.id("dateOfBirthInput"));
			DOBdrp.clear();
			DOBdrp.click();
			
			WebElement drpYears = driver.findElement(By.className("react-datepicker__year-select"));
			drpYears.click();
			Select years = new Select(drpYears);
			years.selectByVisibleText("1995");
			
			WebElement drpMonths = driver.findElement(By.className("react-datepicker__month-select"));
			drpMonths.click();
			Select months = new Select(drpMonths);
			months.selectByValue("8");
			
			WebElement date =  driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[6]"));
			date.sendKeys("22");
			date.click();
		}
		catch (Exception e) 
		{
	
			System.out.println("DOB error....");
		}
		Thread.sleep(2000);
		
		try
		{
			WebElement drpSearch =  driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]"));
			Thread.sleep(2000);
			drpSearch.click();
			drpSearch.sendKeys("Maths");
			Thread.sleep(2000);
			
			driver.findElement(By.className("subjects-auto-complete__menu\""));
			
			List<WebElement> drpSubject = driver.findElements(By.className("subjects-auto-complete__option"));
			System.out.println(drpSubject.size());
			
			for(WebElement e: drpSubject)
			{
				
				System.out.println(e.getText().equals("Maths"));
				e.click();
				break;
				
			}
		}catch (Exception e) {
			System.out.println("Error for Subject DRP...");
		}
		
		Thread.sleep(2000);
		try
		{
			
			List<WebElement> AllChkHobbies = driver.findElements(By.xpath("//*[@type='checkbox']"));
			
			for(WebElement checkBox : AllChkHobbies)
			{
				if(!checkBox.isSelected())
				{
					checkBox.click();
					
				}
					
			}
			

		}catch (Exception e) {
			System.out.println("Error for Hobbies Checkbox...");
		}
		
		Thread.sleep(3000);
		try 
		{
			WebElement uploadFile = driver.findElement(By.xpath("//*[@id=\"uploadPicture\"]"));
			
			String path = "C:\\Users\\Twinkal.Mavani\\Downloads\\241153.pdf";
			
			uploadFile.sendKeys(path);
	
		} catch (Exception e) {
			System.out.println("Error for uploaded File...");
		}

		
		try 
		{
		driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("Nikol,Ahmedabad - 382350");
		
		WebElement drpState = driver.findElement(By.xpath("//*[@id=\"state\"]/div/div"));
		drpState.click();
		
		System.out.println("Sucess State DRP... )");

		WebElement drpCity = driver.findElement(By.xpath("//*[@id=\"stateCity-wrapper\"]/div[3]"));
		drpCity.click();
		}catch (Exception e) {
			System.out.println("Error for City and State drp....");
		}

		driver.close();
	}
}
