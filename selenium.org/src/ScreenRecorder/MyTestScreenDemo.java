package ScreenRecorder;

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.util.concurrent.TimeUnit;

import javax.swing.text.NavigationFilter;

import org.monte.media.Format;
import org.monte.media.FormatKeys.MediaType;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyTestScreenDemo {
	private static final Object MediaTypeKey = null;
	private static final Object MimeTypeKey = null;
	private static final Object MIME_AVI = null;
	private static final Object ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE = null;
	private static final Object EncodingKey = null;
	private static final Object CompressorNameKey = null;
	private static final Object QualityKey = null;
	private static final Object KeyFrameIntervalKey = null;
	private static final Object DepthKey = null;
	private static final Object FrameRateKey = null;
	public  ScreenRecorder screenRecorder;
	
	@Test(priority = 1)
	public void navigation() throws Exception{
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\Kanth\\Downloads\\Compressed\\gecko\\geckodriver.exe");
		////System.setProperty("webdriver.chrome.driver","C:\\Users\\Kanth\\Downloads\\Compressed\\chromedriver\\chromedriver.exe");
		
	//	WebDriver driver = new ChromeDriver();
		//WebDriver driver  = new FirefoxDriver();
	
		//driver.manage().window().maximize();
	//	Thread.sleep(2000);
		
		ScreenRecorderTest sr = new ScreenRecorderTest();
		sr.startRecording();

	//MyTestScreenDemo scr = new MyTestScreenDemo();
	//	scr.startRecording();
		
		
	//	driver.get("http://www.google.com");
	//	driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//driver.navigate().to("http://www.facebook.com");

		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//driver.navigate().back();

		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//driver.navigate().forward();

		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//driver.navigate().back();

		/*driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.navigate().forward();

		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.navigate().back();

		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.navigate().forward();

		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.navigate().back();

		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.navigate().forward();
		driver.quit();*/
		sr.stopRecording();
	/*	sr.stopRecording();*/
	}

public void  startRecording() throws Exception
{
    GraphicsConfiguration gc = GraphicsEnvironment
        .getLocalGraphicsEnvironment()
        .getDefaultScreenDevice()
        .getDefaultConfiguration();

    this.screenRecorder = new ScreenRecorder(gc,
        new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
        new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
            CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
            DepthKey, 24, FrameRateKey, Rational.valueOf(15),
            QualityKey, 1.0f,
            KeyFrameIntervalKey, 15 * 60),
        new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, "black",
            FrameRateKey, Rational.valueOf(30)),
        null);

    this.screenRecorder.start();
}

public void stopRecording() throws Exception
{
    this.screenRecorder.stop();
}
	
	
	
	
}
