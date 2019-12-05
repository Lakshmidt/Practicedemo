package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Htmltext {
	static
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Lakshmi/Desktop/login.html");
		driver.findElement(By.tagName("a")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.id("n1")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.className("r1")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.name("c1")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.linkText("Forgot password")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Forgot")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[id='n1']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		
	}

}
