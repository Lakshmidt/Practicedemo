package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/login.do;jsessionid=1re7nsig9qvg9");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(500);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(500);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(500);
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		driver.close();
	}

}
