package jUnitDemo.Assessment_1_JUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertDemo
{
	WebDriver driver = null;

	@Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Twinkal.Mavani\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.navigate().to("https://www.guru99.com/junit-tutorial.html");
		String ActualTitle = driver.getTitle();
		//System.out.println(actualTitle);
		String ExpectedTitle = "JUnit Tutorial for Beginners: Learn in 3 Days";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
	}

}
