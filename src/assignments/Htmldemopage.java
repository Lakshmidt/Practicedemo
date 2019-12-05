package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Htmldemopage {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Lakshmi/Desktop/html%20codes/allcontentdemo.html");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("manager");
		driver.findElement(By.id("f")).click();
		driver.findElement(By.id("rememberpwd")).click();
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.tagName("a")).click();
		//System.out.println(driver.findElement(By.tagName("body")).getText());
	}

}
