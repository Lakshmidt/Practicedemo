package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enteringdata {
	static
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Lakshmi/Desktop/html%20codes/Frames.html");
		driver.findElement(By.id("pw")).sendKeys("TY");
		driver.switchTo().frame(driver.findElement(By.id("f")));
		driver.findElement(By.id("t2")).sendKeys("Test yantra");
		driver.switchTo().defaultContent();
		Thread.sleep(500);
		driver.findElement(By.id("pw")).clear();
		driver.findElement(By.id("pw")).sendKeys("Softwares");
		
	}

}
