package selenium.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {

	public static void main(String[] args) {
		
		/*System.setProperty("webdriver.gecko.driver","C:\\Users\\Kanth\\Downloads\\Compressed\\geckodriver\\geckodriver.exe");
		WebDriver driver  = new FirefoxDriver();*/
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kanth\\Downloads\\Compressed\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

		/*System.setProperty("webdriver.ie.driver","C:\\Users\\Kanth\\Downloads\\Compressed\\IEDriverServer\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		*/
			driver.get("http://www.google.com");
			driver.manage().window().maximize();
			String title =driver.getTitle();
				System.out.println(title);
			driver.quit();

		

	}

}
