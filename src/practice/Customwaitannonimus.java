package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Customwaitannonimus {
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
		WebDriverWait wait=new WebDriverWait(driver,1);
		ExpectedCondition<WebElement> a;
		wait.until(a=new ExpectedCondition<WebElement>() {

			@Override
			public WebElement apply(WebDriver arg0) {
				
				return driver.findElement(By.id("logoutLink"));
			}
			
		});
		driver.findElement(By.id("logoutLink")).click();
		System.out.println(a.getClass().getName());
	}

}
