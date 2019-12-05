package testclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomclass.Flipkartpage;

public class Flipkartimgcount {
	static
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		Flipkartpage f=new Flipkartpage(driver);
		f.clickclose();
		System.out.println(f.imgcount());
		driver.close();
	}

}
