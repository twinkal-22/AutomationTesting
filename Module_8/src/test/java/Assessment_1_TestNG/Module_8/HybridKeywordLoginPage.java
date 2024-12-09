package Assessment_1_TestNG.Module_8;

import static org.testng.Assert.fail;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HybridKeywordLoginPage 
{
WebDriver driver  = null;
	

	@DataProvider(name="Twinkal")
	public void readExcel() throws InvalidFormatException, IOException
	{
		FileInputStream file = new FileInputStream("D:\\Selenium\\TwinkalMavani\\USPortal\\Module_8\\ExcelFile\\HybridKeywordLoginPage.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int row = sheet.getPhysicalNumberOfRows();
		int cell = sheet.getRow(row).getPhysicalNumberOfCells();
		
		for(int i=1;i<row;i++)
		{
			XSSFRow cellData = sheet.getRow(i);		
			
			String UName= cellData.getCell(0).getStringCellValue();
			String password = cellData.getCell(1).getStringCellValue();
		}       
		 
	}
	
	@Test	(dataProvider =  "Twinkal")
	public void test(String keyword, String data) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Twinkal.Mavani\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

			driver = new ChromeDriver();
		
			driver.get("https://www.saucedemo.com/");
			
			driver.findElement(By.id("user-name")).sendKeys(data);
			Thread.sleep(2000);
			
			
			driver.findElement(By.id("password")).sendKeys(data);
			Thread.sleep(2000);
	
			driver.findElement(By.id("login-button")).click();
			Thread.sleep(2000);
			if(driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html"))
			{
				System.out.println("Login successfully....");
				signOutPage();
			}
			else
			{
				System.out.println("Login has been failled...");
				File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File dest = new File("D:\\TwinkalMavani\\ScreenShot");
				FileUtils.copyFile(src, dest);
				fail();
			}
		}	
		
	@Test
	public void signOutPage() throws InterruptedException
	{
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(2000);
	}
}
