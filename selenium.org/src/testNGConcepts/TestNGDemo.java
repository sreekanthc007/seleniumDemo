package testNGConcepts;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.testng.Assert;

public class TestNGDemo {
	
	static WebDriver driver;
	@BeforeMethod
	public void launchChrome(){
		
		/*System.setProperty("webdriver.gecko.driver","C:\\Users\\Kanth\\Downloads\\Compressed\\geckodriver\\geckodriver.exe");
		WebDriver driver  = new FirefoxDriver();*/
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kanth\\Downloads\\Compressed\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();		
	}
	
	@Test(priority=1)
	public void title() throws InterruptedException{
		driver.navigate().to("http://www.facebook.com");		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("Facebook – log in or sign up")) {
			System.out.println("This is title is matched");
		}
		else{
			System.out.println("This is title name is not matched");
		}
		Assert.assertEquals(title, "Facebook – log in or sign up","Title is not matched");
	
		
	}
	
	@Parameters({"uname","pwd"})
	@Test(priority=2)
	public void login(String uname,String pwd){
		driver.navigate().to("http://www.facebook.com");		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[@type='submit']")).sendKeys(Keys.RETURN);
	}
	
	@AfterMethod
	public void quite(){
		driver.close();
		driver.quit();
	}
	
	
	
	
	
	
	
}
