package experiment;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTCExp {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		Set<String> se = driver.getWindowHandles();
		Iterator<String> it = se.iterator();
		String p=it.next();
		String c=it.next();
		//driver.get("http://www.google.com");
		driver.switchTo().window(c);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath(" //a[text()='Hotel Stay']")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
