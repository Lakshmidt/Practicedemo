package testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomclass.OhrHomepage;
import pomclass.Orangehrmloginpage;

public class TestOrangehr {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Orangehrmloginpage o=new Orangehrmloginpage(driver);
		o.setusername("Admin");
		o.setpwd("admin123");
		o.login();
		OhrHomepage h=new OhrHomepage(driver);
		h.clickadmin();
		Thread.sleep(1000);
		h.clicklogout();
	}

}
