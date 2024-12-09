package Assessment_1_TestNG.Module_8;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;

public class ExcelSheetReadFile {
public static void main(String[] args) throws InterruptedException 
{
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Twinkal.Mavani\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");// set chrome path 

	WebDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	
	try {
	FileInputStream fis = new FileInputStream("D:\\Selenium\\TwinkalMavani\\USPortal\\Module_8\\ExcelFile\\ReadExcelSheetData.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	
	int rowCount = sheet.getLastRowNum();
	int colCount = sheet.getRow(1).getLastCellNum();
	
	System.out.println("Row count: " + rowCount + "  Coloumn Count: " + colCount);

	for(int i=1;i<=rowCount;i++)
	{
	    XSSFRow cellData = sheet.getRow(i);
	    
	    if(cellData == null || cellData.getCell(0) == null || cellData.getCell(1) == null || cellData.getCell(0).getStringCellValue() == null || 
	    		cellData.getCell(1).getStringCellValue() == null) 
	    {
	        System.out.println("Empty row found at index: " + i);
	        continue;
	    }
	    
	    String UName = cellData.getCell(0).getStringCellValue();
	    String Password = cellData.getCell(1).getStringCellValue();  

	    WebElement username =  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
	    username.clear();
	    username.sendKeys(UName + "\n");
	    
	    WebElement pass = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
	    
	    pass.sendKeys(Password);
	    
	  
	    Thread.sleep(2000);
//	   // WebDriverWait wait = new  WebDriverWait(driver,Duration.ofSeconds(50));
//	    
////	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
////        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body"))).click();
//		try 
//		{
//			WebElement captchaPopup = driver.findElement(By.xpath("//body"));
//			captchaPopup.click();
//			if(captchaPopup.isDisplayed())
//			{
//				System.out.println("Captcha is displayed please solved manually...");
//				Thread.sleep(2000);
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("Captch is not displayed...");
//		}
	    
	    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  
	    Thread.sleep(7000);
	    //wait.until(ExpectedConditions.visibilityOf());
	    
	   if(driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"))
	   {
            System.out.println("Login successfully with credentials: " + UName + "/" + Password);
            // Add further actions to be performed on the dashboard page
        } else 
        {
            System.out.println("Login failed for credentials: " + UName + "/" + Password);
        }
	    
			    
	    System.out.println(i + "|| " + UName + " || " + Password);
	    Thread.sleep(2000);

	}
	   System.out.println("========================================================="); 
	   System.out.println("");
	    String dashboardURL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		 driver.get(dashboardURL);
		 
		 
		
		if(dashboardURL== "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index")
		{
			System.out.println("Result Pass!!");
		}
		else
		{
			System.out.println("Result Failled !!");
		}
	
}catch(IOException e)
	{
	e.printStackTrace();
	}
	finally {
		driver.quit();
	}
	
	
}
}
