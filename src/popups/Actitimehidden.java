package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimehidden {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://lenovo/login.do");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Help & Support']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='menuItem']/div[contains(.,'About')]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//a[text()='www.actitime.com']")).click();
		driver.findElement(By.xpath("//img[@class='close']")).click();
	}
}
