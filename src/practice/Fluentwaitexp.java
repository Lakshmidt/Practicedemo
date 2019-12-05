package practice;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Fluentwaitexp {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	
		driver.get("http://lenovo/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manag");
		driver.findElement(By.id("loginButton")).click();
		FluentWait<WebDriver> wait=new FluentWait<>(driver);
		wait.pollingEvery(Duration.ofMillis(600)).withTimeout(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
		//driver.findElement(By.id("logoutLink")).click();
		driver.close();
	}

}
