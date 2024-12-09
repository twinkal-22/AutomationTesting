package Module_7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMenu 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Twinkal.Mavani\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement conHeader = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td/font/font/b/font/font"));
		System.out.println(conHeader.getText());
		
			
		 WebElement fName=	driver.findElement(By.name("firstName"));
		 fName.sendKeys("Twinkal");
		 System.out.println("First Name..." + fName.getText());
		
		WebElement lName= driver.findElement(By.name("lastName"));
		lName.sendKeys("Mavani");
		System.out.println("Last Name..." + lName.getText());
			
		WebElement contactNumber =  driver.findElement(By.name("phone"));
		contactNumber.sendKeys("+91 7894561320");
		System.out.println("Contact Number..." +  contactNumber.getText());
		
		WebElement emailID = driver.findElement(By.id("userName"));
		emailID.sendKeys("mavanitwinkal22@gmail.com");
		System.out.println("Email ID..." +  emailID.getText());
		
		System.out.println("=============================================");
		
		WebElement moreInfo = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td/font/font/b/font/font"));
		System.out.println(moreInfo.getText());
		
		WebElement address = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]"));
		System.out.println("Address..." + address.getText());
		
		WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
		city.sendKeys("A'bad");
		System.out.println("City..." + city.getText());
		
		WebElement state = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[8]/td[2]/input"));
		System.out.println("State..." + state.getText());

		WebElement postalCode = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/input"));
		System.out.println("Postal Code..." + postalCode.getText());
		
		WebElement countries = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select"));
		countries.click();
				
		Select country = new Select(countries);
		
		List<WebElement> cnt = country.getOptions();
//		
//		for(int i=1;i<cnt.size();i++)
//		{
//			boolean cn = countries.isSelected();
//			
//			System.out.println(cnt.get(i).getText());
//		}
//		
		for(int i=1;i<cnt.size();i++)
		{
			System.out.println(cnt.get(i).getText());
		}	
		driver.close();
	}
	

}
