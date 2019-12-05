package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmaillogin {
	static
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("lakshmidt2@gmail.com");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("9886123759");
		//driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("9886123759");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[text()='Compose']")).click();
		//driver.findElement(By.linkText("Compose")).click();
		Thread.sleep(5000);
		driver.switchTo().activeElement().sendKeys("lakshmidt2@gmail.com");
		//driver.findElement(By.id("r8")).sendKeys("lakshmidt2@gmail.com");
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Practice");
		driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf']")).sendKeys("Testing automatically");
		driver.findElement(By.xpath("//div[text()='Send']")).click();
	}

}
