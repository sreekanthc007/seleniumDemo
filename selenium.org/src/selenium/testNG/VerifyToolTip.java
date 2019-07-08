package selenium.testNG;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kanth\\Downloads\\Compressed\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		
		String toolTip = driver.findElement(By.xpath("/html/body/div[3]/div[1]/ul/li[4]/a")).getAttribute("title");
		System.out.println("ToolTip of the download:"+toolTip);
		
		 Assert.assertEquals(toolTip, "Get Selenium");
		
		
	}

}
