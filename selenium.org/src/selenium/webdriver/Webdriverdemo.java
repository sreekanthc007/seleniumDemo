package selenium.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriverdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\Kanth\\Downloads\\geckodriver\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
	      // Puts a Implicit wait, Will wait for 10 seconds before throwing exception
	    //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      // Launch website
	      driver.navigate().to("http://www.google.com");
	      
	     String title = driver.getTitle();
	     System.out.println(title);
	      // Close the Browser.
	      driver.close();
	   }

	}


