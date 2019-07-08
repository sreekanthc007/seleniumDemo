package selenium.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) throws InterruptedException {
		
	
		
	//	System.setProperty("webdriver.chrome.driver","C:\\Users\\Kanth\\Downloads\\Compressed\\chromedriver\\chromedriver.exe");
		
	
		
		WebDriver driver = new HtmlUnitDriver();
		
		
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String title1 = driver.getTitle();
		System.out.println("Before submit Login:"+title1);
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("sreekanth");
		driver.findElement(By.id("pass")).sendKeys("9590955254");
		driver.findElement(By.id("loginbutton")).click();
		String title = driver.getTitle();
		System.out.println("After submit Login:"+title);
	}

}
