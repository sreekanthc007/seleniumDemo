package selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabulitesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String projectPath = System.getProperty("Users.Kanth" );
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("ignoreProtectedModeSettings",true );
		System.setProperty("webdriver.ie.driver",projectPath+"\\Kanth\\Downloads\\Compressed\\IEDriverServer\\IEDriverServer.exe");
		
	/*	System.setProperty("webdriver.ie.driver","C:\\Users\\Kanth\\Downloads\\Compressed\\IEDriverServer\\IEDriverServer.exe");
		
		*/
		WebDriver driver = new InternetExplorerDriver();
		
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("ABCD");
		driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();
		
		System.out.println();
	}

}
