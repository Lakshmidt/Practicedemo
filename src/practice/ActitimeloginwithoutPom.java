package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeloginwithoutPom implements Idemo{

	static
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//verification
	/*	WebDriver driver=new ChromeDriver();
		driver.get("http://lenovo/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");;
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("logoutLink")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("admin");;
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();*/
		
		
		//practice
		ActitimeloginwithoutPom p=new ActitimeloginwithoutPom();
		p.add();
		
	}
	public void add()
	{
		System.out.println("Idemo");
	}
}
interface Idemo
{
	void add();
}
