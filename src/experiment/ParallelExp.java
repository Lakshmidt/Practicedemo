package experiment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(ExpListener.class)
public class ParallelExp {
	WebDriver driver;
	@Parameters({"browser"})
	@BeforeTest
	public void init(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
		}
	}
	@Test
	public void lauchApp()
	{
		driver.get("http://www.google.com");
		Reporter.log(driver.getCurrentUrl(),true);
		Reporter.log(driver.getTitle(),true);
		
	}
	
}
