package selenium.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AcceptSSL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	System.setProperty("webdriver.chrome.driver","C:\\Users\\Kanth\\Downloads\\Compressed\\chromedriver\\chromedriver.exe");
		*/
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);		
		//WebDriver driver = new ChromeDriver(cap);
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Kanth\\Downloads\\Compressed\\geckodriver\\geckodriver.exe");
		
		FirefoxProfile profile=new FirefoxProfile();
		 
		// This will set the true value
		profile.setAcceptUntrustedCertificates(true);

				WebDriver driver = new FirefoxDriver (profile);		
		
		driver.get("https://cacert.org/");
		String title = driver.getTitle();
		System.out.println("This page Title:"+title);
		driver.close();
		driver.quit();
	}

}
