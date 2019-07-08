package selenium.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class GooglePage {

	@BeforeMethod	
	public void google(){
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Kanth\\Downloads\\geckodriver\\geckodriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver  = new FirefoxDriver();
		driver.get("https://www.google.com/");
		String title =driver.getTitle();
			System.out.println(title);
		

	}

}
