package testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomclass.Loginpage;

public class Testlogin {
static
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://lenovo/login.do");
		Loginpage l=new Loginpage(driver);
		l.setusername("admcn");
		l.setpwd("mwvf");
		l.login();
		Thread.sleep(1000);
		System.out.println(l.errmsg());
		
		l.clearuser();
		l.setusername("admin");
		l.setpwd("manager");
		l.login();
	}

}
