package Module_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class RadioButtonDemo {

    public static void main(String[] args) throws InterruptedException 
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Twinkal.Mavani\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

     
            driver.get("https://demo.guru99.com/test/radio.html");

            List<WebElement> radioButtons = driver.findElements(By.xpath("//*[@type='radio']"));

           
            for (WebElement radioButton : radioButtons)
            {
                String label = radioButton.getAttribute("value"); 

                if (!radioButton.isSelected()) 
                {
                    radioButton.click();
                    System.out.println("Selected radio button name:  " + label);
                    Thread.sleep(1000);
                }
            
        } 
            Thread.sleep(2000); 
            driver.close(); 
        
    }
}

