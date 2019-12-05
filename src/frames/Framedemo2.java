package frames;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Framedemo2 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.findElement(By.xpath("//a[text()='Slider']")).click();
	
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		//driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		 WebElement ele = driver.findElement(By.id("slider"));
		 Actions a=new Actions(driver);
			/* a.moveToElement(ele).clickAndHold(ele).moveByOffset(220,0).perform();
			 Thread.sleep(1000);
			 a.moveToElement(ele).clickAndHold(ele).moveByOffset(-220,0).perform();
			 a.release(ele);*/
			 
		//using robot class
			 a.clickAndHold(ele);
			 Robot r=new Robot();
			 r.keyPress(KeyEvent.VK_CONTROL);
			 r.keyPress(KeyEvent.VK_RIGHT);
			 r.keyRelease(KeyEvent.VK_RIGHT);
			 Thread.sleep(1000);
			 r.keyPress(KeyEvent.VK_LEFT);
			 r.keyRelease(KeyEvent.VK_LEFT);
			 r.keyRelease(KeyEvent.VK_CONTROL);
	}
}
