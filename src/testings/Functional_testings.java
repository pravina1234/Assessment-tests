package testings;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Functional_testings {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
        ChromeOptions opt=new ChromeOptions();
        opt.addArguments("---start-maximized");
        WebDriver driver=new ChromeDriver(opt);
        driver.get("https://demo.dealsdray.com/");
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("prexo.mis@dealsdray.com");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("prexo.mis@dealsdray.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='chevron_right']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Orders']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Add Bulk Orders']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\HP\\Desktop\\demo-data.xlsx");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Import']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Validate Data']")).click();
        Thread.sleep(2000);
        Alert alt = driver.switchTo().alert();
        Thread.sleep(2000);
        alt.accept();
        Thread.sleep(2000);
        TakesScreenshot shot=(TakesScreenshot) driver;
        File tmp = shot.getScreenshotAs(OutputType.FILE);
        File pmt=new File("./screenshot/photo.png");
        FileHandler.copy(tmp, pmt);
	}
}
