package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimeverify {
	static By b;
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://lenovo/login.do");
		
		String s="actiTIME - Login";
		if(driver.getTitle().equals(s))
				System.out.println("Tc01: Pass");
		else
			System.out.println("TC01: fail");
		String u=driver.findElement(By.xpath("//td[contains(text(),'Username')]")).getText();
		if(u.equals("Username"))
			System.out.println("Username is present");
		String p=driver.findElement(By.xpath("//td[text()='Password:']")).getText();
		if(p.equals("Password:"))
			System.out.println("Password is present");
		boolean ut=driver.findElement(By.name("username")).isEnabled();
		boolean utp=driver.findElement(By.name("username")).isDisplayed();
		if(ut && utp)
			System.out.println("username text field is present and it is enabled");
		boolean pt=driver.findElement(By.name("pwd")).isEnabled();
		boolean ptp=driver.findElement(By.name("pwd")).isEnabled();
		if(pt && ptp)
			System.out.println("username text field is present and it is enabled");
		String l=driver.findElement(By.id("loginButton")).getText();
		if(l.equals("Login"))
			System.out.println("Login is present");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manag");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		String w="Username or Password is invalid. Please try again.";
		String w1=driver.findElement(By.className("errormsg")).getText();
		String h=driver.getTitle();
		if(h.equals("actiTIME - Enter Time-Track"))
			System.out.println("Login succesfull");
		else
			if(w.equals(w1))
			System.out.println("Not succesfull and proper error message is displayed");
			else
				System.out.println("Not succesfull and proper error message is not displayed");
		driver.close();
		
	}

}
