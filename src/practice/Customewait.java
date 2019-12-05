package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customewait {
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
		int cnt=0;
		while(true)
		{
			try
			{
				driver.findElement(By.id("logoutLink")).click();
				break;
			}
			catch(Exception e)
			{
				cnt++;
				System.out.println(cnt+". exception caught");
			}
		}
		driver.close();
	}

}
