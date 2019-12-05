package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Expicitwait {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		//WebElement logout=driver.findElement(By.id("logoutLink"));
		WebDriverWait wait=new WebDriverWait(driver,1);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
		//logout.click();
		driver.close();
		
	}

}
