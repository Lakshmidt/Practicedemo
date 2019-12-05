package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
//import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Filedownload {
	static 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	}

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.get("https://www.seleniumhq.org/download/");
		driver.findElement(By.xpath("//a[text()='3.141.59']")).click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		//r.keyPress(KeyEvent.VK_LEFT);
	//	r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_CONTROL);
		//r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
	//	driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL +"t");
		Thread.sleep(2000);
		String d = driver.getWindowHandle();
		//System.out.println(driver);
		//System.out.println(d);
		driver.switchTo().window(d);
		driver.get("https://www.google.com/");
		
	}

}
