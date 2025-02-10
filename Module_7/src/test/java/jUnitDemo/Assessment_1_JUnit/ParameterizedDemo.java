package jUnitDemo.Assessment_1_JUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.stream.Stream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParameterizedDemo 
{
    WebDriver driver;

    @BeforeEach
    public void setUp() 
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Twinkal.Mavani\\Downloads\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @ParameterizedTest
    @MethodSource("provideUrlsForTesting")
    public void testPageTitle(String url, String expectedTitle) throws InterruptedException 
    {
        driver.get(url);
        String actualTitle = driver.getTitle();
        assertTrue(actualTitle.contains(expectedTitle), "Title does not contain expected value");
        Thread.sleep(2000);
    }

    private static Stream<String[]> provideUrlsForTesting() 
    {
        return Stream.of(
            new String[]{"https://www.google.com", "Google"},
            new String[]{"https://www.bing.com", "Bing"},
            new String[]{"https://www.yahoo.com", "Yahoo"}
            
        );
    }
    @AfterEach
    public void tearDown() 
    {
        if (driver != null) 
        {
            driver.quit();
        }
    }
}
