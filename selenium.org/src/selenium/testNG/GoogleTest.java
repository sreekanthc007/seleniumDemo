package selenium.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	static WebDriver driver;

	@BeforeMethod
	public void login()
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kanth\\Documents\\chromedriver_win32");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver  = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
	}
	
	@Test(priority=1)
	public void title()
	{
		driver.getTitle();
	}
	
}
