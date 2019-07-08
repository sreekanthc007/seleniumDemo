package selenium.webdriver;

import java.io.File;

import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.steadystate.css.util.Output;
import com.sun.jna.platform.FileUtils;

public class PhantomDriverConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("phantomjs.binary.path","C:\\Users\\Kanth\\Downloads\\Compressed\\phantomjs-2.1.1-windows_2\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		WebDriver driver = new PhantomJSDriver();
		driver.get("https://www.google.com/");
		String tit1 = driver.getTitle();
		File img = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		org.apache.commons.io.FileUtils.getFile(img, "D:\\screanshort\\google.png");
		System.out.println("Titile of the page:"+tit1);
		driver.findElement(By.name("q")).sendKeys("seleniumhq.org");
		driver.findElement(By.name("btnK")).click();
		String tit = driver.getTitle();
		System.out.println("Titile of the page:"+tit);
		
		/*DesiredCapabilities dsc = new DesiredCapabilities();
		((DesiredCapabilities)dsc).setJavascriptEnabled(true);
		((DesiredCapabilities)dsc).setCapability("takescreanshort", true);
		((DesiredCapabilities)dsc).setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "C:\\Users\\Kanth\\Downloads\\Compressed\\phantomjs-2.1.1-windows_2\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		dsc.setJavascriptEnabled(true);
		String phantomJSArgs [] = {"--web-security=no","--ignore--ssl-errors=yes"};
		dsc.setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS,phantomJSArgs);
		WebDriver driver = new PhantomJSDriver(dsc);
		driver.get("https://www.google.com/");
		File img = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		org.apache.commons.io.FileUtils.getFile(img, "D:\\screanshort\\google.png");
		
		String tit1 = driver.getTitle();
		System.out.println("Titile of the page:"+tit1);*/
		
	}

}
