package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Explicitwaitexp {
	
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Lakshmi/Desktop/Sample.html");
		WebElement e=driver.findElement(By.id("username"));
		e.sendKeys("Test yantra");
		System.out.println(e.getAttribute("value"));
		
		WebDriverWait wait=new WebDriverWait(driver, 1);
		wait.until(ExpectedConditions.attributeContains(By.id("username"), "value", "Test yantra"));
		driver.findElement(By.id("enterkey")).sendKeys("TY");
		
		Thread.sleep(2000);
		driver.close();
	}
}
