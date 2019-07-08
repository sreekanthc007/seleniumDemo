package DropDownConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kanth\\Downloads\\Compressed\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
		WebElement from = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
		from.clear();
		from.sendKeys("HYD");
		
		for(int i=0;i<3;i++)
		{
		from.sendKeys(Keys.ARROW_DOWN);
		}
		WebElement to =driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]/div[2]"));
		to.clear();
		to.sendKeys("BANG");
		
		for(int i=0;i<3;i++)
		{
			to.sendKeys(Keys.ARROW_DOWN);
		}
				
	}

}
