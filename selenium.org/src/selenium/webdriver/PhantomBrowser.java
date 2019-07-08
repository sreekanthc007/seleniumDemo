package selenium.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class PhantomBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("phantomjs.binary.path","C:\\Users\\Kanth\\Downloads\\Compressed\\phantomjs-2.1.1-windows_2\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		WebDriver driver = new PhantomJSDriver();

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