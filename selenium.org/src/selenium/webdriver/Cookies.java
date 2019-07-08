package selenium.webdriver;

import java.util.Hashtable;
import java.util.Set;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static <cookie> void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kanth\\Downloads\\Compressed\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		Set<Cookie> allcookie  = driver.manage().getCookies();
		int cookie = allcookie.size();
		System.out.println("Count of all cookies:"+cookie);
		for(Cookie ck : allcookie){
			System.out.println(ck);
		}		
		// Add cookies 
		System.out.println("----------------");
		
		Cookie newCookie = new Cookie("sreekanth", "99590955");
		driver.manage().addCookie(newCookie);
		
		Set<Cookie> allcookie1  = driver.manage().getCookies();
		
		for(Cookie ck : allcookie1)
		{
				
				System.out.println("*************************");
				System.out.println(ck);
		}
		System.out.println("Count of all cookies:"+cookie);
			// delete cookie
		driver.manage().deleteCookie(newCookie);
		Set<Cookie> allcookie2  = driver.manage().getCookies();
		
		for(Cookie ck : allcookie2)
		{
					System.out.println(ck);
		}
		//delete all cookies
		System.out.println("----------------");
		driver.manage().deleteAllCookies();
		
		Set<Cookie> allcookie3  = driver.manage().getCookies();
		
		for(Cookie ck : allcookie3)
		{
					System.out.println(ck);
		}
		driver.quit();
	}

}
