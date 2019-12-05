package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Enteringnewtab {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		System.out.println(driver);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(1000);
	//	driver.switchTo().window();
		System.out.println(driver);
		
	}
}
