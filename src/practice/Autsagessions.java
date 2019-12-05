package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autsagessions {
	
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("java");
		Thread.sleep(2000);
		List<WebElement> li = driver.findElements(By.xpath("//div[@class='aajZCb']/ul/child::li"));
		// List<WebElement> lst = driver.findElements(By.xpath("//li[@class='sbct']"));
		 System.out.println(li.size());
		// driver.close();
		 for(WebElement b:li)
			 System.out.println(b.getText());
		driver.findElement(By.xpath("//div[@class='aajZCb']/ul/child::li[1]")).click();
		
	}

}
