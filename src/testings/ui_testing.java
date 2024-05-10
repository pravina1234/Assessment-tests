package testings;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ui_testing {
	@Test(priority = 1)
	public void openapp()
	{
       System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.getcalley.com/page-sitemap.xml");
	}
	@Test(priority = 2)
	public void urlonechrome() throws InterruptedException
	{
       System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       Thread.sleep(2000);
       driver.get("https://www.getcalley.com/");
       Thread.sleep(2000);
       sample.disp(driver);
	}
	@Test(priority = 3)
	public void urlonefire() throws InterruptedException
	{
       System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
       WebDriver driver=new FirefoxDriver();
       driver.manage().window().maximize();
       Thread.sleep(2000);
       driver.get("https://www.getcalley.com/");
       Thread.sleep(2000);
       sample.disp(driver);
	}
	@Test(priority = 4)
	public void urltwochrome() throws InterruptedException
	{
       System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       Thread.sleep(2000);
       driver.get("https://www.getcalley.com/calley-call-from-browser/");
       Thread.sleep(2000);
       sample.disp(driver);
	}
	@Test(priority = 5)
	public void urltwofire() throws InterruptedException
	{
       System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
       WebDriver driver=new FirefoxDriver();
       driver.manage().window().maximize();
       Thread.sleep(2000);
       driver.get("https://www.getcalley.com/calley-call-from-browser/");
       Thread.sleep(2000);
       sample.disp(driver);
	}
	@Test(priority = 6)
	public void urlthreechrome() throws InterruptedException
	{
       System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       Thread.sleep(2000);
       driver.get("https://www.getcalley.com/calley-pro-features/");
       Thread.sleep(2000);
       sample.disp(driver);
	}
	@Test(priority = 7)
	public void urlthreefire() throws InterruptedException
	{
       System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
       WebDriver driver=new FirefoxDriver();
       driver.manage().window().maximize();
       Thread.sleep(2000);
       driver.get("https://www.getcalley.com/calley-pro-features/");
       Thread.sleep(2000);
       sample.disp(driver);
	}
	@Test(priority = 8)
	public void urlfourchrome() throws InterruptedException
	{
       System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       Thread.sleep(2000);
       driver.get("https://www.getcalley.com/best-auto-dialer-app/");
       Thread.sleep(2000);
       sample.disp(driver);
	}
	@Test(priority = 9)
	public void urlfourfire() throws InterruptedException
	{
       System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
       WebDriver driver=new FirefoxDriver();
       driver.manage().window().maximize();
       Thread.sleep(2000);
       driver.get("https://www.getcalley.com/best-auto-dialer-app/");
       Thread.sleep(2000);
       sample.disp(driver);
	}
	@Test(priority = 10)
	public void urlfivechrome() throws InterruptedException
	{
       System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       Thread.sleep(2000);
       driver.get("https://www.getcalley.com/how-calley-auto-dialer-app-works/");
       Thread.sleep(2000);
       sample.disp(driver);
	}
	@Test(priority = 11)
	public void urlfivefire() throws InterruptedException
	{
       System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
       WebDriver driver=new FirefoxDriver();
       driver.manage().window().maximize();
       Thread.sleep(2000);
       driver.get("https://www.getcalley.com/how-calley-auto-dialer-app-works/");
       Thread.sleep(2000);
       sample.disp(driver);
	}
} 
class sample
{
	public static void disp(WebDriver driver) {
        Date d=new Date();
		String str = d.toString();
		String place = str.replace(":", "-");
		TakesScreenshot shot=(TakesScreenshot)driver;
		File tmp = shot.getScreenshotAs(OutputType.FILE);
		File pmt=new File("./screenshots2/"+place+".jpg");

		try {
			FileHandler.copy(tmp, pmt);
		} catch (IOException e) {

			System.out.println("screenshot is not taken");
		}
	}
}
