package practice;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebooklogin {
	static
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.name("firstname")).sendKeys("Sample");
		driver.findElement(By.name("lastname")).sendKeys("Test");
		driver.findElement(By.name("reg_email__")).sendKeys("sonimtest129@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sonimtest129@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Sampletest123");
		driver.findElement(By.xpath("//input[@value='1'] ")).click();
		Thread.sleep(2000);
		Select s=new Select(driver.findElement(By.id("day")));
		s.selectByValue("12");
		Thread.sleep(2000);
		Select s1=new Select(driver.findElement(By.id("month")));
		s1.selectByVisibleText("Sept");
		Thread.sleep(2000);
		Select s2=new Select(driver.findElement(By.id("year")));
		s2.selectByVisibleText("1996");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign Up")).click();
		//driver.findElement(By.xpath("//input[@value='Log In to Existing Account']")).click();
	}
}
