package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitimeinvalid {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://lenovo/login.do");
		WebElement username = driver.findElement(By.name("username"));
			 username.sendKeys("admin");
		WebElement pwd=driver.findElement(By.name("pwd"));
		pwd.sendKeys("manag");
		WebElement login=driver.findElement(By.id("loginButton"));
		login.click();
		WebDriverWait wait=new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("errormsg"))));
		System.out.println(driver.findElement(By.className("errormsg")).getText());
		username.clear();
		username.sendKeys("admin");
		pwd.sendKeys("manager");
		login.click();
	}

}
